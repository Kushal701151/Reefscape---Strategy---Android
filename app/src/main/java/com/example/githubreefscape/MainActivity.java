 package com.example.githubreefscape;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.util.DisplayMetrics;
import android.content.Intent;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONObject;


import android.content.Intent;
import java.util.Dictionary;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    public Button historyselect;
    public Button AutoL1Minus;
    public Button AutoL1Plus;
    public Button AutoL2Minus;
    public Button AutoL2Plus;
    public Button AutoL3Minus;
    public Button AutoL3Plus;
    public Button AutoL4Minus;
    public Button AutoL4Plus;


    public Button AutoBargeMinus;
    public Button AutoBargePlus;
    public Button AutoProcessorMinus;
    public Button AutoProcessorPlus;


    public Button TeleL1Minus;
    public Button TeleL1Plus;
    public Button TeleL2Minus;
    public Button TeleL2Plus;
    public Button TeleL3Minus;
    public Button TeleL3Plus;
    public Button TeleL4Minus;
    public Button TeleL4Plus;

    public Button TeleBargeMinus;
    public Button TeleBargePlus;

    public Button TeleProcessorMinus;
    public Button TeleProcessorPlus;

    public Button HumanPlayerMinus;
    public Button HumanPlayerPlus;

    public Button HumanPlayerAttemptedMinus;
    public Button HumanPlayerAttemptedPlus;

    public  EditText StudentName;
    public  CheckBox Defense;
    public  EditText MatchNumber;
    public  EditText EditTextComments;
    public TextView HumanPlayerAttempted;
    public  TextView HumanPlayer;
    public  TextView TeleBarge;
    public  TextView TeleProcessor;
    public  TextView TeleL4;
    public  TextView TeleL3;
    public  TextView TeleL2;
    public  TextView TeleL1;
    public  TextView AutoL4;
    public  TextView AutoL3;
    public  TextView AutoL2;
    public  TextView AutoL1;
    public  RadioButton None;
    public  RadioButton Parked;
    public  RadioButton Shallow;
    public  RadioButton Deep;
    public  TextView AutoProcessor;
    public  TextView AutoBarge;
    public  CheckBox LeftStarting;

    public  EditText TeamNumber;


  public static class GlobalDictionary {
      public static HashMap<String, String> historydict = new HashMap<>();
      public static List<String> keylist = new ArrayList<>();;
      public static int LeftStartingInt = 0;
      public static int endgameRadio = 0;
      public static int HumanPlayerInt =0;
      public static int TeleProcessorInt =0;
      public static int TeleBargeInt =0;
      public static int TeleL4Int =0;
      public static int TeleL3Int =0;
      public static int TeleL2Int =0;
      public static int TeleL1Int =0;
      public static int AutoProcessorInt =0;
      public static int AutoBargeInt =0;
      public static int AutoL4Int =0;
      public static int AutoL3Int =0;
      public static int AutoL2Int =0;
      public static int AutoL1Int =0;
      public static int DefenseInt =0;
      public static int HumanPlayerAtttemptedInt =0;
  }
    public Button done;


    public String data;
    @Override
    protected void onResume() {
        super.onResume();
        Intent pager = getIntent();
        ArrayList<String> historicallist = pager.getStringArrayListExtra("historicallist");

        String pagers = getIntent().getStringExtra("FROM_WINDOW");
        Log.d("Debug", "Aut" + pagers);

        if(Objects.equals(pagers, "Historical")){
            // Update other fields as needed
            // Update UI elements
            if (historicallist != null && historicallist.size() >= 20) {
                StudentName.setText(historicallist.get(0));
                TeamNumber.setText(historicallist.get(1));
                MatchNumber.setText(historicallist.get(2));

                GlobalDictionary.LeftStartingInt = Integer.parseInt(historicallist.get(3));
                Log.d( "DefenseInt: ", String.valueOf(GlobalDictionary.DefenseInt));
                if (GlobalDictionary.LeftStartingInt== 1){
                    LeftStarting.setChecked(true);
                }

                GlobalDictionary.AutoL1Int = Integer.parseInt(historicallist.get(4));
                GlobalDictionary.AutoL2Int = Integer.parseInt(historicallist.get(5));
                GlobalDictionary.AutoL3Int = Integer.parseInt(historicallist.get(6));
                GlobalDictionary.AutoL4Int = Integer.parseInt(historicallist.get(7));
                AutoL1.setText(String.valueOf(GlobalDictionary.AutoL1Int));
                AutoL2.setText(String.valueOf(GlobalDictionary.AutoL2Int));
                AutoL3.setText(String.valueOf(GlobalDictionary.AutoL3Int));
                AutoL4.setText(String.valueOf(GlobalDictionary.AutoL4Int));

                GlobalDictionary.AutoBargeInt = Integer.parseInt(historicallist.get(8));
                GlobalDictionary.AutoProcessorInt = Integer.parseInt(historicallist.get(9));
                AutoBarge.setText(String.valueOf(GlobalDictionary.AutoBargeInt));
                AutoProcessor.setText(String.valueOf(GlobalDictionary.AutoProcessorInt));

                GlobalDictionary.DefenseInt = Integer.parseInt(historicallist.get(10));
                Log.d( "DefenseInt: ", String.valueOf(GlobalDictionary.DefenseInt));
                if (GlobalDictionary.DefenseInt== 1){
                    Defense.setChecked(true);
                }

                GlobalDictionary.TeleL1Int = Integer.parseInt(historicallist.get(11));
                GlobalDictionary.TeleL2Int = Integer.parseInt(historicallist.get(12));
                GlobalDictionary.TeleL3Int = Integer.parseInt(historicallist.get(13));
                GlobalDictionary.TeleL4Int = Integer.parseInt(historicallist.get(14));
                TeleL1.setText(String.valueOf(GlobalDictionary.TeleL1Int));
                TeleL2.setText(String.valueOf(GlobalDictionary.TeleL2Int));
                TeleL3.setText(String.valueOf(GlobalDictionary.TeleL3Int));
                TeleL4.setText(String.valueOf(GlobalDictionary.TeleL4Int));

                GlobalDictionary.TeleBargeInt = Integer.parseInt(historicallist.get(15));
                GlobalDictionary.TeleProcessorInt = Integer.parseInt(historicallist.get(16));
                TeleBarge.setText(String.valueOf(GlobalDictionary.TeleBargeInt));
                TeleProcessor.setText(String.valueOf(GlobalDictionary.TeleProcessorInt));

                GlobalDictionary.HumanPlayerAtttemptedInt = Integer.parseInt(historicallist.get(17));
                GlobalDictionary.HumanPlayerInt = Integer.parseInt(historicallist.get(18));
                HumanPlayerAttempted.setText(String.valueOf(GlobalDictionary.HumanPlayerAtttemptedInt));
                HumanPlayer.setText(String.valueOf(GlobalDictionary.HumanPlayerInt));

                GlobalDictionary.endgameRadio = Integer.parseInt(historicallist.get(19));
                if (GlobalDictionary.endgameRadio == 0) {
                    None.setChecked(true);
                } else if (GlobalDictionary.endgameRadio == 1) {
                    Parked.setChecked(true);
                } else if (GlobalDictionary.endgameRadio == 2) {
                    Shallow.setChecked(true);
                } else if (GlobalDictionary.endgameRadio == 3) {
                    Deep.setChecked(true);
                }
                EditTextComments.setText(historicallist.get(20));
            } else {
                // Handle error if the list is empty or smaller than expected
            }

        }else{
            GlobalDictionary.AutoL1Int = 0;
            GlobalDictionary.AutoL2Int = 0;
            GlobalDictionary.AutoL3Int = 0;
            GlobalDictionary.AutoL4Int = 0;
            GlobalDictionary.AutoBargeInt = 0;
            GlobalDictionary.AutoProcessorInt = 0;
            GlobalDictionary.TeleL1Int = 0;
            GlobalDictionary.TeleL2Int = 0;
            GlobalDictionary.TeleL3Int = 0;
            GlobalDictionary.TeleL4Int = 0;
            GlobalDictionary.TeleBargeInt = 0;
            GlobalDictionary.TeleProcessorInt = 0;
            GlobalDictionary.HumanPlayerAtttemptedInt = 0;
            GlobalDictionary.HumanPlayerInt = 0;
        }



    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenwidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;

        StudentName = (EditText) findViewById(R.id.StudentName);
        MatchNumber = (EditText) findViewById(R.id.MatchNumber);
        TeamNumber = (EditText) findViewById(R.id.TeamNumber);

        LeftStarting= (CheckBox) findViewById(R.id.LeftStarting);
        historyselect = (Button) findViewById(R.id.HistoryAcess);

        AutoL1Minus = (Button) findViewById(R.id.AutoL1Minus);
        AutoL1 = (TextView) findViewById(R.id.AutoL1);
        AutoL1Plus = (Button) findViewById(R.id.AutoL1Plus);

        AutoL2Minus = (Button) findViewById(R.id.AutoL2Minus);
        AutoL2 = (TextView) findViewById(R.id.AutoL2);
        AutoL2Plus = (Button) findViewById(R.id.AutoL2Plus);

        AutoL3Minus = (Button) findViewById(R.id.AutoL3Minus);
        AutoL3 = (TextView) findViewById(R.id.AutoL3);
        AutoL3Plus = (Button) findViewById(R.id.AutoL3Plus);

        AutoL4Minus = (Button) findViewById(R.id.AutoL4Minus);
        AutoL4 = (TextView) findViewById(R.id.AutoL4);
        AutoL4Plus = (Button) findViewById(R.id.AutoL4Plus);

        AutoBargeMinus = (Button) findViewById(R.id.AutoBargeMinus);
        AutoBarge = (TextView) findViewById(R.id.AutoBarge);
        AutoBargePlus = (Button) findViewById(R.id.AutoBargePlus);

        AutoProcessorMinus = (Button) findViewById(R.id.AutoProcessorMinus);
        AutoProcessor = (TextView) findViewById(R.id.AutoProcessor);
        AutoProcessorPlus = (Button) findViewById(R.id.AutoProcessorPlus);

        Defense= (CheckBox) findViewById(R.id.Defense);

        TeleL1Minus = (Button) findViewById(R.id.TeleL1Minus);
        TeleL1 = (TextView) findViewById(R.id.TeleL1);
        TeleL1Plus = (Button) findViewById(R.id.TeleL1Plus);

        TeleL2Minus = (Button) findViewById(R.id.TeleL2Minus);
        TeleL2 = (TextView) findViewById(R.id.TeleL2);
        TeleL2Plus = (Button) findViewById(R.id.TeleL2Plus);

        TeleL3Minus = (Button) findViewById(R.id.TeleL3Minus);
        TeleL3 = (TextView) findViewById(R.id.TeleL3);
        TeleL3Plus = (Button) findViewById(R.id.TeleL3Plus);

        TeleL4Minus = (Button) findViewById(R.id.TeleL4Minus);
        TeleL4 = (TextView) findViewById(R.id.TeleL4);
        TeleL4Plus = (Button) findViewById(R.id.TeleL4Plus);

        TeleBargeMinus = (Button) findViewById(R.id.TeleBargeMinus);
        TeleBarge = (TextView) findViewById(R.id.TeleBarge);
        TeleBargePlus = (Button) findViewById(R.id.TeleBargePlus);

        TeleProcessorMinus = (Button) findViewById(R.id.TeleProcessorMinus);
        TeleProcessor = (TextView) findViewById(R.id.TeleProcessor);
        TeleProcessorPlus = (Button) findViewById(R.id.TeleProcessorPlus);
        HumanPlayerMinus = (Button) findViewById(R.id.HumanPlayerMinus);

        HumanPlayer = (TextView) findViewById(R.id.HumanPlayer);
        HumanPlayerPlus = (Button) findViewById(R.id.HumanPlayerPlus);

        HumanPlayerAttemptedMinus = (Button) findViewById(R.id.HumanPlayerAttemptedMinus);
        HumanPlayerAttempted = (TextView) findViewById(R.id.HumanAttemptedPlayer);
        HumanPlayerAttemptedPlus = (Button) findViewById(R.id.HumanPlayerAttemptedPlus);

        None = (RadioButton) findViewById(R.id.none);
        Parked = (RadioButton) findViewById(R.id.Parked);
        Shallow = (RadioButton) findViewById(R.id.Shallow);
        Deep = (RadioButton) findViewById(R.id.Deep);

        EditTextComments = (EditText) findViewById(R.id.EditTextComments);
        done= (Button) findViewById(R.id.done);
    }

    // Auto Levels 1-4
    public void AutoL1Minus(View view){
        if ((!AutoL1.getText().toString().equals("0"))&&(GlobalDictionary.AutoL1Int!=0)){ //Prevents negative values
            GlobalDictionary.AutoL1Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.AutoL1Int);
            AutoL1.setText(AutoLowerDisplay);
        }
    }

    public void AutoL1Plus(View view){
        GlobalDictionary.AutoL1Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.AutoL1Int);
        AutoL1.setText(AutoLowerDisplay);
    }

    public void AutoL2Minus(View view){
        if ((!AutoL2.getText().toString().equals("0"))&&(GlobalDictionary.AutoL2Int!=0)){ //Prevents negative values
            GlobalDictionary.AutoL2Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.AutoL2Int);
            AutoL2.setText(AutoLowerDisplay);
        }
    }

    public void AutoL2Plus(View view){
        GlobalDictionary.AutoL2Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.AutoL2Int);
        AutoL2.setText(AutoLowerDisplay);
    }
    public void AutoL3Minus(View view){
        if ((!AutoL3.getText().toString().equals("0"))&&(GlobalDictionary.AutoL3Int!=0)){ //Prevents negative values
            GlobalDictionary.AutoL3Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.AutoL3Int);
            AutoL3.setText(AutoLowerDisplay);
        }
    }

    public void AutoL3Plus(View view){
        GlobalDictionary.AutoL3Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.AutoL3Int);
        AutoL3.setText(AutoLowerDisplay);
    }

    public void AutoL4Minus(View view){
        if ((!AutoL4.getText().toString().equals("0"))&&(GlobalDictionary.AutoL4Int!=0)){ //Prevents negative values
            GlobalDictionary.AutoL4Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.AutoL4Int);
            AutoL4.setText(AutoLowerDisplay);
        }
    }

    public void AutoL4Plus(View view){
        GlobalDictionary.AutoL4Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.AutoL4Int);
        AutoL4.setText(AutoLowerDisplay);
    }

    // Auto Barge


    public void AutoBargeMinus(View view){
        if ((!AutoBarge.getText().toString().equals("0"))&&(GlobalDictionary.AutoBargeInt!=0)){ //Prevents negative values
            GlobalDictionary.AutoBargeInt--;
            String AutoLowerDisplay = " " + (GlobalDictionary.AutoBargeInt);
            AutoBarge.setText(AutoLowerDisplay);
        }
    }
    public void AutoBargePlus (View view){
        GlobalDictionary.AutoBargeInt ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.AutoBargeInt);
        AutoBarge.setText(AutoLowerDisplay);
    }

    // Auto Processor
    public void AutoProcessorMinus(View view){
        if ((!AutoProcessor.getText().toString().equals("0"))&&(GlobalDictionary.AutoProcessorInt!=0)){ //Prevents negative values
            GlobalDictionary.AutoProcessorInt--;
            String AutoLowerDisplay = " " + (GlobalDictionary.AutoProcessorInt);
            AutoProcessor.setText(AutoLowerDisplay);
        }
    }
    public void AutoProcessorPlus (View view){
        GlobalDictionary.AutoProcessorInt ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.AutoProcessorInt);
        AutoProcessor.setText(AutoLowerDisplay);
    }



    // Tele Levels 1-4
    public void TeleL1Minus(View view){
        if ((!TeleL1.getText().toString().equals("0"))&&(GlobalDictionary.TeleL1Int!=0)){ //Prevents negative values
            GlobalDictionary.TeleL1Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.TeleL1Int);
            TeleL1.setText(AutoLowerDisplay);
        }
    }

    public void TeleL1Plus(View view){
        GlobalDictionary.TeleL1Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.TeleL1Int);
        TeleL1.setText(AutoLowerDisplay);
    }

    public void TeleL2Minus(View view){
        if ((!TeleL2.getText().toString().equals("0"))&&(GlobalDictionary.TeleL2Int!=0)){ //Prevents negative values
            GlobalDictionary.TeleL2Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.TeleL2Int);
            TeleL2.setText(AutoLowerDisplay);
        }
    }

    public void TeleL2Plus(View view){
        GlobalDictionary.TeleL2Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.TeleL2Int);
        TeleL2.setText(AutoLowerDisplay);
    }
    public void TeleL3Minus(View view){
        if ((!TeleL3.getText().toString().equals("0"))&&(GlobalDictionary.TeleL3Int!=0)){ //Prevents negative values
            GlobalDictionary.TeleL3Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.TeleL3Int);
            TeleL3.setText(AutoLowerDisplay);
        }
    }

    public void TeleL3Plus(View view){
        GlobalDictionary.TeleL3Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.TeleL3Int);
        TeleL3.setText(AutoLowerDisplay);
    }

    public void TeleL4Minus(View view){
        if ((!TeleL4.getText().toString().equals("0"))&&(GlobalDictionary.TeleL4Int!=0)){ //Prevents negative values
            GlobalDictionary.TeleL4Int--;
            String AutoLowerDisplay = " " + (GlobalDictionary.TeleL4Int);
            TeleL4.setText(AutoLowerDisplay);
        }
    }

    public void TeleL4Plus(View view){
        GlobalDictionary.TeleL4Int ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.TeleL4Int);
        TeleL4.setText(AutoLowerDisplay);
    }

    // Tele Barge
    public void TeleBargeMinus(View view){
        if ((!TeleBarge.getText().toString().equals("0"))&&(GlobalDictionary.TeleBargeInt!=0)){ //Prevents negative values
            GlobalDictionary.TeleBargeInt--;
            String AutoLowerDisplay = " " + (GlobalDictionary.TeleBargeInt);
            TeleBarge.setText(AutoLowerDisplay);
        }
    }

    public void TeleBargePlus (View view){
        GlobalDictionary.TeleBargeInt ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.TeleBargeInt);
        TeleBarge.setText(AutoLowerDisplay);
    }

    // Tele Processor
    public void TeleProcessorMinus(View view){
        if ((!TeleProcessor.getText().toString().equals("0"))&&(GlobalDictionary.TeleProcessorInt!=0)){ //Prevents negative values
            GlobalDictionary.TeleProcessorInt--;
            String AutoLowerDisplay = " " + (GlobalDictionary.TeleProcessorInt);
            TeleProcessor.setText(AutoLowerDisplay);
        }
    }

    public void TeleProcessorPlus (View view){
        GlobalDictionary.TeleProcessorInt ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.TeleProcessorInt);
        TeleProcessor.setText(AutoLowerDisplay);
    }

    //Tele Human Player
    public void HumanPlayerMinus(View view){
        if ((!HumanPlayer.getText().toString().equals("0"))&&(GlobalDictionary.HumanPlayerInt!=0)){ //Prevents negative values
            GlobalDictionary.HumanPlayerInt--;
            String AutoLowerDisplay = " " + (GlobalDictionary.HumanPlayerInt);
            HumanPlayer.setText(AutoLowerDisplay);
        }
    }
    public void HumanPlayerPlus (View view){
        GlobalDictionary.HumanPlayerInt ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.HumanPlayerInt);
        HumanPlayer.setText(AutoLowerDisplay);
    }

    public void HumanPlayerAttemptedMinus(View view){
        if ((!HumanPlayerAttempted.getText().toString().equals("0"))&&(GlobalDictionary.HumanPlayerAtttemptedInt!=0)){ //Prevents negative values
            GlobalDictionary.HumanPlayerAtttemptedInt--;
            String AutoLowerDisplay = " " + (GlobalDictionary.HumanPlayerAtttemptedInt);
            HumanPlayerAttempted.setText(AutoLowerDisplay);
        }
    }
    public void HumanPlayerAttemptedPlus (View view){
        GlobalDictionary.HumanPlayerAtttemptedInt ++;
        String AutoLowerDisplay = " " + (GlobalDictionary.HumanPlayerAtttemptedInt);
        HumanPlayerAttempted.setText(AutoLowerDisplay);
    }

    public void onHistory (View view){
        Intent intent = new Intent(MainActivity.this, HistoryActivity.class);

        // Start the activity
        startActivity(intent);

    }

    // LeftStarting
    public void LeftStaring(View view){
        if(LeftStarting.isChecked()){
            GlobalDictionary.LeftStartingInt = 1;
        }
        else{
            GlobalDictionary.LeftStartingInt = 0;
        }
    }

    // Defense

    public void Defense (View view){
        if (Defense.isChecked()){
            GlobalDictionary.DefenseInt = 1;
        }
        else {
            GlobalDictionary.DefenseInt = 0;
        }
    }

    // Endgame Radio Group
    public void endgameRadioGroup(View view) {
        if (None.isChecked()) {
            GlobalDictionary.endgameRadio = 0;
        } else if (Parked.isChecked()) {
            GlobalDictionary.endgameRadio = 1;
        } else if (Shallow.isChecked()) {
            GlobalDictionary.endgameRadio = 2;
        } else if (Deep.isChecked()) {
            GlobalDictionary.endgameRadio = 3;
        }
    }

    public boolean fieldChecker() {
        String fieldIncomplete = "";

        if (StudentName.getText().toString().equals("") || (StudentName.getText().toString().equals(" "))) {
            fieldIncomplete = " \n\tStudent Name ";
        }

        if (TeamNumber.getText().toString().equals("")) {
            fieldIncomplete = fieldIncomplete + "\n\tTeam Number, ";
        }
        if (MatchNumber.getText().toString().equals("")) {
            fieldIncomplete = fieldIncomplete + "\n\tMatch Number, ";
        }
        if (!fieldIncomplete.equals("")) {
            android.app.AlertDialog alertDialog = new android.app.AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("These fields are not selected: " + fieldIncomplete);
            alertDialog.show();
            return false;
        } else return true;
    }
    public String commaRemover(EditText editText){
        if(EditTextComments.getText().toString().isEmpty()){
            EditTextComments.setText("0");
        }

        return editText.getText().toString().replace(","," ");


    }



    public void onSubmit(View view) {
        boolean checked = fieldChecker();
        if (checked) {
            if(EditTextComments.getText().toString().isEmpty()){
                EditTextComments.setText("0");
            }
            android.app.AlertDialog alertDialog = new android.app.AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("Are you sure you want to submit? Tap anywhere outside of this box to go back.");
            alertDialog.setButton(alertDialog.BUTTON_NEUTRAL, "SUBMIT",
                    (dialog, which) -> {
                        dialog.dismiss();

                         data =
                                StudentName.getText().toString() + ","
                                        + TeamNumber.getText().toString() + ","
                                        + MatchNumber.getText().toString() + ","
                                        + GlobalDictionary.LeftStartingInt + ","
                                        + GlobalDictionary.AutoL1Int + ","
                                        + GlobalDictionary.AutoL2Int + ","
                                        + GlobalDictionary.AutoL3Int + ","
                                        + GlobalDictionary.AutoL4Int + ","
                                        + GlobalDictionary.AutoBargeInt + ","
                                        + GlobalDictionary.AutoProcessorInt + ","
                                        + GlobalDictionary.DefenseInt + ","
                                        + GlobalDictionary.TeleL1Int + ","
                                        + GlobalDictionary.TeleL2Int + ","
                                        + GlobalDictionary.TeleL3Int + ","
                                        + GlobalDictionary.TeleL4Int + ","
                                        + GlobalDictionary.TeleBargeInt + ","
                                        + GlobalDictionary.TeleProcessorInt + ","
                                        + GlobalDictionary.HumanPlayerAtttemptedInt + ","
                                        + GlobalDictionary.HumanPlayerInt + ","
                                        + GlobalDictionary.endgameRadio + ","
                                        + EditTextComments.getText().toString();

                        Intent dataSend = new Intent(MainActivity.this, DisplayActivity.class); //Sends data to "Display Activity"
                        dataSend.putExtra("dat", data);
                        startActivity(dataSend);
                    });

            //addded string to local file


            String Hdata =
                    StudentName.getText().toString() + ","
                    + TeamNumber.getText().toString() + ","
                    + MatchNumber.getText().toString() + ","
                    + GlobalDictionary.LeftStartingInt + ","
                    + GlobalDictionary.AutoL1Int + ","
                    + GlobalDictionary.AutoL2Int + ","
                    + GlobalDictionary.AutoL3Int + ","
                    + GlobalDictionary.AutoL4Int + ","
                    + GlobalDictionary.AutoBargeInt + ","
                    + GlobalDictionary.AutoProcessorInt + ","
                    + GlobalDictionary.DefenseInt + ","
                    + GlobalDictionary.TeleL1Int + ","
                    + GlobalDictionary.TeleL2Int + ","
                    + GlobalDictionary.TeleL3Int + ","
                    + GlobalDictionary.TeleL4Int + ","
                    + GlobalDictionary.TeleBargeInt + ","
                    + GlobalDictionary.TeleProcessorInt + ","
                    + GlobalDictionary.HumanPlayerAtttemptedInt + ","
                    + GlobalDictionary.HumanPlayerInt + ","
                    + GlobalDictionary.endgameRadio + ","
                    + EditTextComments.getText().toString();
            Log.d("Mydata", Hdata);
            //history code
            GlobalDictionary.historydict.put(MatchNumber.getText().toString(), Hdata);
            GlobalDictionary.keylist.add(MatchNumber.getText().toString());
            Log.d("ListCheck", "List contents: " + GlobalDictionary.historydict.toString());

            alertDialog.show();
        }
    }



}