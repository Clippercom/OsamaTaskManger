package com.example.osamataskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class AddTaskActivity extends AppCompatActivity {
    private TextInputEditText etTitle,etSubject;
    private SeekBar sBTask;
    private Button btnSave;
    private ImageView imgvLogo;
    private Spinner spnimportant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        sBTask=findViewById(R.id.sBTask);
        etTitle=findViewById(R.id.etTitle);
        etSubject=findViewById(R.id.etSubject);
        btnSave=findViewById(R.id.btnSave);
        imgvLogo=findViewById(R.id.imgvLogo);
        spnimportant=findViewById(R.id.spnImportant);
    }
}