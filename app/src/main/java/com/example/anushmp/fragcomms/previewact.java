package com.example.anushmp.fragcomms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class previewact extends AppCompatActivity {

    TextView name,age,grade,percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previewact);

        name = findViewById(R.id.tvStudentName);
        age = findViewById(R.id.tvStudentAge);
        grade = findViewById(R.id.tvStudentGrade);
        percent = findViewById(R.id.tvStudentPercentage);

        getDatafromIntent();
    }

    private void getDatafromIntent() {
        previewmodel pm = (previewmodel) getIntent().getSerializableExtra("model");

        name.setText(pm.getName());
        age.setText(pm.getAge() + "");
        grade.setText(pm.getGrade());
        percent.setText(pm.getPercentage());

    }
}