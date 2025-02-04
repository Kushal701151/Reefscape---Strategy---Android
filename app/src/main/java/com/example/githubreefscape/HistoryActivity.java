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

import java.lang.reflect.Type;
import java.util.Dictionary;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;





public class HistoryActivity extends AppCompatActivity {
    public EditText Keyfinder;
    public Button HSubmit;

    public String historystring;
    public HashMap<String, String> myDictionary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Keyfinder = (EditText) findViewById(R.id.keyfinder);

        HSubmit = (Button) findViewById(R.id.HSubmit);

    }
    public void Submit(View view){

        SharedPreferences sharedPreferences = getSharedPreferences("MyPreferences", MODE_PRIVATE);

        // Get the JSON string from SharedPreferences
        String json = sharedPreferences.getString(MainActivity.GlobalDictionary.MatchNumber.getText().toString(), "");

        // Convert JSON string back to HashMap using Gson
        Gson gson = new Gson();
        Type type = new TypeToken<HashMap<String, String>>() {}.getType();
        myDictionary = gson.fromJson(json, type);

        historystring = myDictionary.get(Keyfinder.getText().toString());
        String[] parts = historystring.split(",");
        // Convert the array into a List named historicallist
        ArrayList<String> historicallist = new ArrayList<>(Arrays.asList(parts));


        Intent pager = new Intent(HistoryActivity.this, MainActivity.class);
        pager.putExtra("FROM_WINDOW", "Historical");  // Add extra identifying the source
        pager.putStringArrayListExtra("historicallist", historicallist);
        // Start the activity
        startActivity(pager);
    }

}
