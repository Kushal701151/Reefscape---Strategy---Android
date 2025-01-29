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
        List<String> historicallist = new ArrayList<>(Arrays.asList(parts));
        MainActivity.GlobalDictionary.StudentName.setText(historicallist.get(0));
        MainActivity.GlobalDictionary.TeamNumber.setText(historicallist.get(1));
        MainActivity.GlobalDictionary.MatchNumber.setText(historicallist.get(2));
        MainActivity.GlobalDictionary.LeftStartingInt = Integer.parseInt(historicallist.get(2));
        MainActivity.GlobalDictionary.LeftStarting.setChecked(true);
        MainActivity.GlobalDictionary.AutoL1Int = Integer.parseInt(historicallist.get(3));
        MainActivity.GlobalDictionary.AutoL2Int = Integer.parseInt(historicallist.get(4));
        MainActivity.GlobalDictionary.AutoL3Int = Integer.parseInt(historicallist.get(5));
        MainActivity.GlobalDictionary.AutoL4Int = Integer.parseInt(historicallist.get(6));
        MainActivity.GlobalDictionary.AutoL1.setText(MainActivity.GlobalDictionary.AutoL1Int);
        MainActivity.GlobalDictionary.AutoL2.setText(MainActivity.GlobalDictionary.AutoL2Int);
        MainActivity.GlobalDictionary.AutoL3.setText(MainActivity.GlobalDictionary.AutoL3Int);
        MainActivity.GlobalDictionary.AutoL4.setText(MainActivity.GlobalDictionary.AutoL4Int);
        MainActivity.GlobalDictionary.AutoBargeInt = Integer.parseInt(historicallist.get(7));
        MainActivity.GlobalDictionary.AutoProcessorInt = Integer.parseInt(historicallist.get(8));
        MainActivity.GlobalDictionary.AutoBarge.setText(MainActivity.GlobalDictionary.AutoBargeInt);
        MainActivity.GlobalDictionary.AutoProcessor.setText(MainActivity.GlobalDictionary.AutoProcessorInt);
        MainActivity.GlobalDictionary.DefenseInt = Integer.parseInt(historicallist.get(9));
        MainActivity.GlobalDictionary.Defense.setChecked(true);
        MainActivity.GlobalDictionary.TeleL1Int = Integer.parseInt(historicallist.get(10));
        MainActivity.GlobalDictionary.TeleL2Int = Integer.parseInt(historicallist.get(11));
        MainActivity.GlobalDictionary.TeleL3Int = Integer.parseInt(historicallist.get(12));
        MainActivity.GlobalDictionary.TeleL4Int = Integer.parseInt(historicallist.get(13));
        MainActivity.GlobalDictionary.TeleL1.setText(MainActivity.GlobalDictionary.TeleL1Int);
        MainActivity.GlobalDictionary.TeleL2.setText(MainActivity.GlobalDictionary.TeleL2Int);
        MainActivity.GlobalDictionary.TeleL3.setText(MainActivity.GlobalDictionary.TeleL3Int);
        MainActivity.GlobalDictionary.TeleL4.setText(MainActivity.GlobalDictionary.TeleL4Int);
        MainActivity.GlobalDictionary.TeleBargeInt = Integer.parseInt(historicallist.get(14));
        MainActivity.GlobalDictionary.TeleProcessorInt = Integer.parseInt(historicallist.get(15));
        MainActivity.GlobalDictionary.TeleBarge.setText(MainActivity.GlobalDictionary.TeleBargeInt);
        MainActivity.GlobalDictionary.TeleProcessor.setText(MainActivity.GlobalDictionary.TeleProcessorInt);
        MainActivity.GlobalDictionary.HumanPlayerAtttemptedInt = Integer.parseInt(historicallist.get(16));
        MainActivity.GlobalDictionary.HumanPlayerInt = Integer.parseInt(historicallist.get(17));
        MainActivity.GlobalDictionary.HumanPlayerAttempted.setText(MainActivity.GlobalDictionary.HumanPlayerAtttemptedInt);
        MainActivity.GlobalDictionary.HumanPlayer.setText(MainActivity.GlobalDictionary.HumanPlayerInt);
        MainActivity.GlobalDictionary.endgameRadio = Integer.parseInt(historicallist.get(18));
        if(MainActivity.GlobalDictionary.endgameRadio == 0){
            MainActivity.GlobalDictionary.None.setChecked(true);
        } else if (MainActivity.GlobalDictionary.endgameRadio == 1) {
            MainActivity.GlobalDictionary.Parked.setChecked(true);
        }else if (MainActivity.GlobalDictionary.endgameRadio == 2) {
            MainActivity.GlobalDictionary.Shallow.setChecked(true);
        }else if (MainActivity.GlobalDictionary.endgameRadio == 3) {
            MainActivity.GlobalDictionary.Deep.setChecked(true);
        }
        MainActivity.GlobalDictionary.StudentName.setText(historicallist.get(19));

        Intent intent = new Intent(HistoryActivity.this, MainActivity.class);

        // Start the activity
        startActivity(intent);
    }

}
