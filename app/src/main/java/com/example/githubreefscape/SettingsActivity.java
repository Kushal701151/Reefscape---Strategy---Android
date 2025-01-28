package com.example.githubreefscape;

import android.annotation.SuppressLint;
import android.app.Activity;
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

public class SettingsActivity extends Activity {


    public CheckBox autoDisable;
    public int autoDisableInt = 1;
    public CheckBox teleDisable;
    public int teleDisableInt = 1;
    public CheckBox endgameDisable;
    public int endgameDisableInt = 1;
    public CheckBox coralDisable;
    public int coralDisableInt = 1;
    public CheckBox algaeDisable;
    public int algaeDisableInt = 1;
    public CheckBox parkDisable;
    public int parkDisableInt = 1;
    public CheckBox hpDisable;
    public int hpDisableInt = 1;
    public CheckBox databaseEnable;
    public int databaseEnableInt = 1;
    public RadioButton colorDark;
    public RadioButton colorLight;
    public int colorRadio = 1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenwidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;


        autoDisable = (CheckBox) findViewById(R.id.autoDisableID);
        teleDisable = (CheckBox) findViewById(R.id.teleDisableID);
        endgameDisable = (CheckBox) findViewById(R.id.endgameDisableID);
        coralDisable = (CheckBox) findViewById(R.id.coralDisableID);
        algaeDisable = (CheckBox) findViewById(R.id.algaeDisableID);
        parkDisable = (CheckBox) findViewById(R.id.parkDisableID);
        databaseEnable = (CheckBox) findViewById(R.id.databaseEnableID);
        hpDisable = (CheckBox) findViewById(R.id.hpDisableID);
    }

    public void autoDisable(View view) {
        if (autoDisable.isChecked()) {
            autoDisableInt = 1;
        } else {
            autoDisableInt = 0;
        }
    }

    public void teleDisable(View view) {
        if (teleDisable.isChecked()) {
            teleDisableInt = 1;
        } else {
            teleDisableInt = 0;
        }
    }

    public void endgameDisable(View view) {
        if (endgameDisable.isChecked()) {
            endgameDisableInt = 1;
        } else {
            endgameDisableInt = 0;
        }
    }

    public void coralDisable(View view) {
        if (coralDisable.isChecked()) {
            coralDisableInt = 1;
        } else {
            coralDisableInt = 0;
        }
    }

    public void algaeDisable(View view) {
        if (algaeDisable.isChecked()) {
            algaeDisableInt = 1;
        } else {
            algaeDisableInt = 0;
        }
    }

    public void parkDisable(View view) {
        if (autoDisable.isChecked()) {
            autoDisableInt = 1;
        } else {
            autoDisableInt = 0;
        }
    }

    public void hpDisable(View view) {
        if (hpDisable.isChecked()) {
            hpDisableInt = 1;
        } else {
            hpDisableInt = 0;
        }
    }

    public void databaseEnable(View view) {
        if (databaseEnable.isChecked()) {
            databaseEnableInt = 1;
        } else {
            databaseEnableInt = 0;
        }
    }

    public void colorRadioGroup(View view) {
        if (colorLight.isChecked()) {
            colorRadio = 0;
        } else if (colorDark.isChecked()) {
            colorRadio = 1;
        }
    }
}