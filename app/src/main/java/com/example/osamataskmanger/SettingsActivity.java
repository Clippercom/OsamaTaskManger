package com.example.osamataskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SettingsActivity extends AppCompatActivity {
    private TextView tvSettings,tvEndTasks;
    private ToggleButton tbsettings;
    private Button btnsignout,btnClear;
    private RadioGroup radioGroup;
    private RadioButton rBDelete, rBCross,rBMove_to_end;
    private Switch schKeep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        tvEndTasks=findViewById(R.id.tvEndTasks);
        tvSettings=findViewById(R.id.tvSettings);
        tbsettings=findViewById(R.id.tbsettings);
        btnsignout=findViewById(R.id.btnsignout);
        btnClear=findViewById(R.id.btnClear);
        radioGroup=findViewById(R.id.radioGroup);
        rBDelete=findViewById(R.id.rBDelete);
        rBCross=findViewById(R.id.rBCross);
        rBMove_to_end=findViewById(R.id.rBMove_to_end);
        schKeep=findViewById(R.id.schKeep);
    }
}