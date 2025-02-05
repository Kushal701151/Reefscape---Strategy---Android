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
    int tracker = 1;

    public String historystring;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Keyfinder = (EditText) findViewById(R.id.keyfinder);

        HSubmit = (Button) findViewById(R.id.HSubmit);

    }
    public void Submit(View view){

        if(MainActivity.GlobalDictionary.keylist.contains(Keyfinder.getText().toString())){
            tracker = 0;
        }



        if(tracker==0){
            historystring = MainActivity.GlobalDictionary.historydict.get(Keyfinder.getText().toString());
            String[] parts = historystring.split(",");
            // Convert the array into a List named historicallist
            ArrayList<String> historicallist = new ArrayList<>(Arrays.asList(parts));


            Intent pager = new Intent(HistoryActivity.this, MainActivity.class);
            pager.putExtra("FROM_WINDOW", "Historical");  // Add extra identifying the source
            pager.putStringArrayListExtra("historicallist", historicallist);
            // Start the activity
            startActivity(pager);
        } else if (tracker ==1) {
            android.app.AlertDialog alertDialog = new android.app.AlertDialog.Builder(HistoryActivity.this).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("you did not enter any history number");
            alertDialog.show();
        }

    }

    public void Return(View view){
        Intent pager = new Intent(HistoryActivity.this, MainActivity.class);
        pager.putExtra("FROM_WINDOW", "Display");
        startActivity(pager);

    }

}
