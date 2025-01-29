package com.example.githubreefscape;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.util.DisplayMetrics;
import android.content.Intent;
import java.util.Dictionary;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class HistoryActivity extends AppCompatActivity {
    public EditText Keyfinder;
    public Button HSubmit;

    public String historystring;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Keyfinder = (EditText) findViewById(R.id.keyfinder);

        HSubmit = (Button) findViewById(R.id.HSubmit);

    }
    public void Submit(View view){
        historystring = MainActivity.GlobalDictionary.historydict.get(Keyfinder);
        String[] parts = historystring.split(",");
        // Convert the array into a List named historicallist
        ArrayList<String> historicallist = new ArrayList<>(Arrays.asList(parts));


        Intent intent = new Intent(HistoryActivity.this, MainActivity.class);
        intent.putStringArrayListExtra("historicallist", historicallist);
        // Start the activity
        startActivity(intent);
    }

}
