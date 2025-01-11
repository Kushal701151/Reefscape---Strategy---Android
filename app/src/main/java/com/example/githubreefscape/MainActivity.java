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

public class MainActivity extends AppCompatActivity {
    public EditText StudentName;
    public EditText MatchNumber;
    public EditText TeamNumber;

    public CheckBox LeftStarting;
    public int LeftStartingInt = 0;
    public Button AutoL1Minus;
    public TextView AutoL1;
    public int AutoL1Int = 0;
    public Button AutoL1Plus;
    public Button AutoL2Minus;
    public TextView AutoL2;
    public int AutoL2Int=0;
    public Button AutoL2Plus;
    public Button AutoL3Minus;
    public TextView AutoL3;
    public int AutoL3Int =0;
    public Button AutoL3Plus;
    public Button AutoL4Minus;
    public TextView AutoL4;
    public int AutoL4Int= 0;
    public Button AutoL4Plus;


    public Button AutoBargeMinus;
    public TextView AutoBarge;
    public int AutoBargeInt=0;
    public Button AutoBargePlus;
    public Button AutoProcessorMinus;
    public TextView AutoProcessor;
    public int AutoProcessorInt = 0;
    public Button AutoProcessorPlus;


    public CheckBox Defense;
    public int DefenseInt =0;

    public Button TeleL1Minus;
    public TextView TeleL1;
    public int TeleL1Int =0;
    public Button TeleL1Plus;
    public Button TeleL2Minus;
    public TextView TeleL2;
    public int TeleL2Int =0;
    public Button TeleL2Plus;
    public Button TeleL3Minus;
    public TextView TeleL3;
    public int TeleL3Int =0;
    public Button TeleL3Plus;
    public Button TeleL4Minus;
    public TextView TeleL4;
    public int TeleL4Int =0;
    public Button TeleL4Plus;

    public Button TeleBargeMinus;
    public TextView TeleBarge;
    public int TeleBargeInt =0;
    public Button TeleBargePlus;

    public Button TeleProcessorMinus;
    public TextView TeleProcessor;
    public int TeleProcessorInt =0;
    public Button TeleProcessorPlus;

    public Button HumanPlayerMinus;
    public TextView HumanPlayer;
    public int HumanPlayerInt =0;
    public Button HumanPlayerPlus;


    public RadioButton None;
    public RadioButton Parked;
    public RadioButton Shallow;
    public RadioButton Deep;
    public int endgameRadio = 0;


    public EditText EditTextComments;
    public Button done;
    @Override
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

        None = (RadioButton) findViewById(R.id.none);
        Parked = (RadioButton) findViewById(R.id.Parked);
        Shallow = (RadioButton) findViewById(R.id.Shallow);
        Deep = (RadioButton) findViewById(R.id.Deep);

        EditTextComments = (EditText) findViewById(R.id.EditTextComments);
        done= (Button) findViewById(R.id.done);
    }

    // Auto Levels 1-4
    public void AutoL1Minus(View view){
        if ((!AutoL1.getText().toString().equals("0"))&&(AutoL1Int!=0)){ //Prevents negative values
            AutoL1Int--;
            String AutoLowerDisplay = " " + (AutoL1Int);
            AutoL1.setText(AutoLowerDisplay);
        }
    }

    public void AutoL1Plus(View view){
        AutoL1Int ++;
        String AutoLowerDisplay = " " + (AutoL1Int);
        AutoL1.setText(AutoLowerDisplay);
    }

    public void AutoL2Minus(View view){
        if ((!AutoL2.getText().toString().equals("0"))&&(AutoL2Int!=0)){ //Prevents negative values
            AutoL2Int--;
            String AutoLowerDisplay = " " + (AutoL2Int);
            AutoL2.setText(AutoLowerDisplay);
        }
    }

    public void AutoL2Plus(View view){
        AutoL2Int ++;
        String AutoLowerDisplay = " " + (AutoL2Int);
        AutoL2.setText(AutoLowerDisplay);
    }
    public void AutoL3Minus(View view){
        if ((!AutoL3.getText().toString().equals("0"))&&(AutoL3Int!=0)){ //Prevents negative values
            AutoL3Int--;
            String AutoLowerDisplay = " " + (AutoL3Int);
            AutoL3.setText(AutoLowerDisplay);
        }
    }

    public void AutoL3Plus(View view){
        AutoL3Int ++;
        String AutoLowerDisplay = " " + (AutoL3Int);
        AutoL3.setText(AutoLowerDisplay);
    }

    public void AutoL4Minus(View view){
        if ((!AutoL4.getText().toString().equals("0"))&&(AutoL4Int!=0)){ //Prevents negative values
            AutoL4Int--;
            String AutoLowerDisplay = " " + (AutoL4Int);
            AutoL4.setText(AutoLowerDisplay);
        }
    }

    public void AutoL4Plus(View view){
        AutoL4Int ++;
        String AutoLowerDisplay = " " + (AutoL4Int);
        AutoL4.setText(AutoLowerDisplay);
    }

    // Auto Barge


    public void AutoBargeMinus(View view){
        if ((!AutoBarge.getText().toString().equals("0"))&&(AutoBargeInt!=0)){ //Prevents negative values
            AutoBargeInt--;
            String AutoLowerDisplay = " " + (AutoBargeInt);
            AutoBarge.setText(AutoLowerDisplay);
        }
    }
    public void AutoBargePlus (View view){
        AutoBargeInt ++;
        String AutoLowerDisplay = " " + (AutoBargeInt);
        AutoBarge.setText(AutoLowerDisplay);
    }

    // Auto Processor
    public void AutoProcessorMinus(View view){
        if ((!AutoProcessor.getText().toString().equals("0"))&&(AutoProcessorInt!=0)){ //Prevents negative values
            AutoProcessorInt--;
            String AutoLowerDisplay = " " + (AutoProcessorInt);
            AutoProcessor.setText(AutoLowerDisplay);
        }
    }
    public void AutoProcessorPlus (View view){
        AutoProcessorInt ++;
        String AutoLowerDisplay = " " + (AutoProcessorInt);
        AutoProcessor.setText(AutoLowerDisplay);
    }



    // Tele Levels 1-4
    public void TeleL1Minus(View view){
        if ((!TeleL1.getText().toString().equals("0"))&&(TeleL1Int!=0)){ //Prevents negative values
            TeleL1Int--;
            String AutoLowerDisplay = " " + (TeleL1Int);
            TeleL1.setText(AutoLowerDisplay);
        }
    }

    public void TeleL1Plus(View view){
        TeleL1Int ++;
        String AutoLowerDisplay = " " + (TeleL1Int);
        TeleL1.setText(AutoLowerDisplay);
    }

    public void TeleL2Minus(View view){
        if ((!TeleL2.getText().toString().equals("0"))&&(TeleL2Int!=0)){ //Prevents negative values
            TeleL2Int--;
            String AutoLowerDisplay = " " + (TeleL2Int);
            TeleL2.setText(AutoLowerDisplay);
        }
    }

    public void TeleL2Plus(View view){
        TeleL2Int ++;
        String AutoLowerDisplay = " " + (TeleL2Int);
        TeleL2.setText(AutoLowerDisplay);
    }
    public void TeleL3Minus(View view){
        if ((!TeleL3.getText().toString().equals("0"))&&(TeleL3Int!=0)){ //Prevents negative values
            TeleL3Int--;
            String AutoLowerDisplay = " " + (TeleL3Int);
            TeleL3.setText(AutoLowerDisplay);
        }
    }

    public void TeleL3Plus(View view){
        TeleL3Int ++;
        String AutoLowerDisplay = " " + (TeleL3Int);
        TeleL3.setText(AutoLowerDisplay);
    }

    public void TeleL4Minus(View view){
        if ((!TeleL4.getText().toString().equals("0"))&&(TeleL4Int!=0)){ //Prevents negative values
            TeleL4Int--;
            String AutoLowerDisplay = " " + (TeleL4Int);
            TeleL4.setText(AutoLowerDisplay);
        }
    }

    public void TeleL4Plus(View view){
        TeleL4Int ++;
        String AutoLowerDisplay = " " + (TeleL4Int);
        TeleL4.setText(AutoLowerDisplay);
    }

    // Tele Barge
    public void TeleBargeMinus(View view){
        if ((!TeleBarge.getText().toString().equals("0"))&&(TeleBargeInt!=0)){ //Prevents negative values
            TeleBargeInt--;
            String AutoLowerDisplay = " " + (TeleBargeInt);
            TeleBarge.setText(AutoLowerDisplay);
        }
    }

    public void TeleBargePlus (View view){
        TeleBargeInt ++;
        String AutoLowerDisplay = " " + (TeleBargeInt);
        TeleBarge.setText(AutoLowerDisplay);
    }

    // Tele Processor
    public void TeleProcessorMinus(View view){
        if ((!TeleProcessor.getText().toString().equals("0"))&&(TeleProcessorInt!=0)){ //Prevents negative values
            TeleProcessorInt--;
            String AutoLowerDisplay = " " + (TeleProcessorInt);
            TeleProcessor.setText(AutoLowerDisplay);
        }
    }

    public void TeleProcessorPlus (View view){
        TeleProcessorInt ++;
        String AutoLowerDisplay = " " + (TeleProcessorInt);
        TeleProcessor.setText(AutoLowerDisplay);
    }

    //Tele Human Player
    public void HumanPlayerMinus(View view){
        if ((!HumanPlayer.getText().toString().equals("0"))&&(HumanPlayerInt!=0)){ //Prevents negative values
            HumanPlayerInt--;
            String AutoLowerDisplay = " " + (HumanPlayerInt);
            HumanPlayer.setText(AutoLowerDisplay);
        }
    }
    public void HumanPlayerPlus (View view){
        HumanPlayerInt ++;
        String AutoLowerDisplay = " " + (HumanPlayerInt);
        HumanPlayer.setText(AutoLowerDisplay);
    }

    // LeftStarting
    public void LeftStaring(View view){
        if(LeftStarting.isChecked()){
            LeftStartingInt = 1;
        }
        else{
            LeftStartingInt = 0;
        }
    }

    // Defense

    public void Defense (View view){
        if (Defense.isChecked()){
            DefenseInt = 1;
        }
        else {
            DefenseInt = 0;
        }
    }

    // Endgame Radio Group
    public void endgameRadioGroup(View view) {
        if (None.isChecked()) {
            endgameRadio = 0;
        } else if (Parked.isChecked()) {
            endgameRadio = 1;
        } else if (Shallow.isChecked()) {
            endgameRadio = 2;
        } else if (Deep.isChecked()) {
            endgameRadio = 3;
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
        if (EditTextComments.getText().toString().equals("")){
            EditTextComments.setText("0");
        }

        return editText.getText().toString().replace(","," ");
    }
    public void onSubmit(View view) {
        boolean checked = fieldChecker();
        if (checked) {
            android.app.AlertDialog alertDialog = new android.app.AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("Are you sure you want to submit? Tap anywhere outside of this box to go back.");
            alertDialog.setButton(alertDialog.BUTTON_NEUTRAL, "SUBMIT",
                    (dialog, which) -> {
                        dialog.dismiss();

                        String data;
                        data =
                                commaRemover(StudentName) + ","
                                        + TeamNumber.getText().toString() + ","
                                        + MatchNumber.getText().toString() + ","
                                        + LeftStartingInt + ","
                                        + AutoL1Int + ","
                                        + AutoL2Int + ","
                                        + AutoL3Int + ","
                                        + AutoL4Int + ","
                                        + AutoBargeInt + ","
                                        + AutoProcessorInt + ","
                                        + DefenseInt + ","
                                        + TeleL1Int + ","
                                        + TeleL2Int + ","
                                        + TeleL3Int + ","
                                        + TeleL4Int + ","
                                        + TeleBargeInt + ","
                                        + TeleProcessorInt + ","
                                        + HumanPlayerInt + ","
                                        + endgameRadio + ","
                                        + commaRemover(EditTextComments);

                        Intent dataSend = new Intent(MainActivity.this, DisplayActivity.class); //Sends data to "Display Activity"
                        dataSend.putExtra("dat", data);
                        startActivity(dataSend);
                    });
            alertDialog.show();
        }
    }
}