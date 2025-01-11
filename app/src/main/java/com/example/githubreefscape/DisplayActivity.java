package com.example.githubreefscape;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class DisplayActivity extends AppCompatActivity{
    // Variables
    private ImageView iv;
    private TextView dataToText;
    private Button nextMatch;
    private Bitmap bitmap;

    private static final String IMAGE_DIRECTORY = "/QRcodes";
    private static final int QR_CODE_WIDTH = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // Initialize views
        iv = findViewById(R.id.iv);
        nextMatch = findViewById(R.id.NextMatchBtn);
        dataToText = findViewById(R.id.dataToTextTxtView);

        // Retrieve data passed from the previous activity
        Intent dataSend = getIntent();
        String data = dataSend.getStringExtra("dat");
        if (data == null || data.isEmpty()) {
            Toast.makeText(this, "No data received!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Prepare data for QR code
        data = "R3," + data + "|";
        dataToText.setText(data);

        // Generate QR code
        try {
            bitmap = textToImageEncode(data);
            iv.setImageBitmap(bitmap);

            String path = saveImage(bitmap);
            Toast.makeText(this, "QR Code saved to -> " + path, Toast.LENGTH_LONG).show();
        } catch (WriterException e) {
            Toast.makeText(this, "Error generating QR Code!", Toast.LENGTH_SHORT).show();
            Log.e("QRGenError", "WriterException", e);
        }
    }

    public void onNextMatch(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    private String saveImage(Bitmap myBitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        myBitmap.compress(Bitmap.CompressFormat.PNG, 100, bytes);

        File wallpaperDirectory = new File(Environment.getExternalStorageDirectory() + IMAGE_DIRECTORY);
        if (!wallpaperDirectory.exists() && !wallpaperDirectory.mkdirs()) {
            Log.e("FileError", "Failed to create directory");
            return "";
        }

        try {
            File file = new File(wallpaperDirectory, System.currentTimeMillis() + ".png");
            file.createNewFile();
            try (FileOutputStream fo = new FileOutputStream(file)) {
                fo.write(bytes.toByteArray());
            }
            MediaScannerConnection.scanFile(this,
                    new String[]{file.getPath()},
                    new String[]{"image/png"}, null);

            Log.d("FileSaved", "File saved at: " + file.getAbsolutePath());
            return file.getAbsolutePath();
        } catch (IOException e) {
            Log.e("FileError", "Error saving file", e);
        }
        return "";
    }

    private Bitmap textToImageEncode(String value) throws WriterException {
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(
                    value,
                    BarcodeFormat.QR_CODE,
                    QR_CODE_WIDTH, QR_CODE_WIDTH, null
            );
        } catch (IllegalArgumentException e) {
            Log.e("EncodeError", "Invalid data for QR Code", e);
            return null;
        }

        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int[] pixels = new int[width * height];

        for (int y = 0; y < height; y++) {
            int offset = y * width;
            for (int x = 0; x < width; x++) {
                pixels[offset + x] = bitMatrix.get(x, y) ?
                        ContextCompat.getColor(this, R.color.black) :
                        ContextCompat.getColor(this, R.color.white);
            }
        }

        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
