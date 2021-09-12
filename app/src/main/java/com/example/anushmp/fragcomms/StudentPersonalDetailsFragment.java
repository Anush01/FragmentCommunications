package com.example.anushmp.fragcomms;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class StudentPersonalDetailsFragment extends Fragment {


    EditText Studentname,studentage;
    Button go;
    CommunicationListner cl2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_personal_details, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        cl2 = (CommunicationListner) context;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        go = view.findViewById(R.id.btnNext);
        Studentname = view.findViewById(R.id.etStudentName);
        studentage = view.findViewById(R.id.etStudentAge);


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Studentname.getText().toString();
                int age = Integer.parseInt(studentage.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putInt("age", age);

                cl2.launchPerformanceFragment(bundle);



            }
        });



    }
}