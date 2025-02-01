package com.example.githubreefscape;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.view.View;
import android.util.DisplayMetrics;

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

        autoDisable = findViewById(R.id.autoDisableID);
        teleDisable = findViewById(R.id.teleDisableID);
        endgameDisable = findViewById(R.id.endgameDisableID);
        coralDisable = findViewById(R.id.coralDisableID);
        algaeDisable = findViewById(R.id.algaeDisableID);
        parkDisable = findViewById(R.id.parkDisableID);
        databaseEnable = findViewById(R.id.databaseEnableID);
        hpDisable = findViewById(R.id.hpDisableID);

        colorLight = findViewById(R.id.colorLightID);
        colorDark = findViewById(R.id.colorDarkID);

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
        disableAutoFeatures(!autoDisable.isChecked());
    }
    public void toggleTeleDisable(View view) {
        teleDisableInt = teleDisable.isChecked() ? 1 : 0;
        disableTeleFeatures(!teleDisable.isChecked());
    }
    public void toggleEndgameDisable(View view) {
        endgameDisableInt = endgameDisable.isChecked() ? 1 : 0;
        disableEndgameFeatures(!endgameDisable.isChecked());
    }
    public void toggleCoralDisable(View view) {
        coralDisableInt = coralDisable.isChecked() ? 1 : 0;
        disableCoralFeatures(!coralDisable.isChecked());
    }
    public void toggleAlgaeDisable(View view) {
        algaeDisableInt = algaeDisable.isChecked() ? 1 : 0;
        disableAlgaeFeatures(!algaeDisable.isChecked());
    }

    public void toggleParkDisable(View view) {
        parkDisableInt = parkDisable.isChecked() ? 1 : 0;
        disableParkFeatures(!parkDisable.isChecked());
    }
    public void toggleHpDisable(View view) {
        hpDisableInt = hpDisable.isChecked() ? 1 : 0;
        disableHpFeatures(!hpDisable.isChecked());
    }
    public void toggleDatabaseEnable(View view) {
        databaseEnableInt = databaseEnable.isChecked() ? 1 : 0;
        disableDatabaseFeatures(!databaseEnable.isChecked());
    }
    public void toggleColorRadio(View view) {
        colorRadio = colorLight.isChecked() ? 0 : 1;
        updateColorScheme();
    }

    public void disableAutoFeatures(boolean disable) {
    }

    public void disableTeleFeatures(boolean disable) {
    }

    public void disableEndgameFeatures(boolean disable) {
    }

    public void disableCoralFeatures(boolean disable) {
    }

    public void disableAlgaeFeatures(boolean disable) {
    }

    public void disableParkFeatures(boolean disable) {
    }

    public void disableHpFeatures(boolean disable) {
    }

    public void disableDatabaseFeatures(boolean disable) {

    }


    public void disableInteraction(View element, boolean disable) {
        element.setEnabled(!disable);
        if (element instanceof CheckBox) {
            ((CheckBox) element).setEnabled(!disable);
        }
        if (element instanceof RadioButton) {
            ((RadioButton) element).setEnabled(!disable);
        }
    }

    public void updateColorScheme() {
        if (colorRadio == 0) {
        } else {

        }
    }
}
