package com.example.anushmp.fragcomms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;


public class StudentPerformanceDetailsFragment extends Fragment implements Serializable {

    EditText studentgrade,studentpercentage;
    Button btnpreview;
    private CommunicationListner cl;

    String name;
    int age;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            name = getArguments().getString("name");
            age = getArguments().getInt("age");
        }

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        cl = (CommunicationListner) context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_performance_details, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnpreview = view.findViewById(R.id.btnPreview);
        studentgrade = view.findViewById(R.id.etStudentGrade);
        studentpercentage = view.findViewById(R.id.etStudentPercentage);

        btnpreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String grade,percent;
               // grade = studentgrade.getText().toString();

                previewmodel studentpreview = new previewmodel(name,studentgrade.getText().toString(),
                        studentpercentage.getText().toString(),age);

                Intent i = new Intent(getContext(),previewact.class);
                //i.putExtra("model",studentpreview);

               i.putExtra("model", (Serializable) studentpreview);

                //i.putExtra("model", String.valueOf(studentpreview));

                startActivity(i);


                //commit
            }
        });


    }
}