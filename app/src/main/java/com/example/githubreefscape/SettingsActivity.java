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

        autoDisable.setOnClickListener(this::toggleAutoDisable);
        teleDisable.setOnClickListener(this::toggleTeleDisable);
        endgameDisable.setOnClickListener(this::toggleEndgameDisable);
        coralDisable.setOnClickListener(this::toggleCoralDisable);
        algaeDisable.setOnClickListener(this::toggleAlgaeDisable);
        parkDisable.setOnClickListener(this::toggleParkDisable);
        hpDisable.setOnClickListener(this::toggleHpDisable);
        databaseEnable.setOnClickListener(this::toggleDatabaseEnable);
        colorLight.setOnClickListener(this::toggleColorRadio);
        colorDark.setOnClickListener(this::toggleColorRadio);
    }

    public void toggleAutoDisable(View view) {
        autoDisableInt = autoDisable.isChecked() ? 1 : 0;
    }

    public void toggleTeleDisable(View view) {
        teleDisableInt = teleDisable.isChecked() ? 1 : 0;
    }

    public void toggleEndgameDisable(View view) {
        endgameDisableInt = endgameDisable.isChecked() ? 1 : 0;
    }

    public void toggleCoralDisable(View view) {
        coralDisableInt = coralDisable.isChecked() ? 1 : 0;
    }

    public void toggleAlgaeDisable(View view) {
        algaeDisableInt = algaeDisable.isChecked() ? 1 : 0;
    }

    public void toggleParkDisable(View view) {
        parkDisableInt = parkDisable.isChecked() ? 1 : 0;
    }

    public void toggleHpDisable(View view) {
        hpDisableInt = hpDisable.isChecked() ? 1 : 0;
    }

    public void toggleDatabaseEnable(View view) {
        databaseEnableInt = databaseEnable.isChecked() ? 1 : 0;
    }

    public void toggleColorRadio(View view) {
        colorRadio = colorLight.isChecked() ? 0 : 1;
    }
}