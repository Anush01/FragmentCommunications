package com.example.anushmp.fragcomms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CommunicationListner {

    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchpersonaldetailsfragment();
    }

    private void launchpersonaldetailsfragment() {

        FragmentTransaction ft = fm.beginTransaction();

        StudentPersonalDetailsFragment spdeef = new StudentPersonalDetailsFragment();

        ft.replace(R.id.container,spdeef,"personaldetailsfragment").commit();

    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {

        FragmentTransaction ft = fm.beginTransaction();
        StudentPerformanceDetailsFragment spdf = new StudentPerformanceDetailsFragment();
        spdf.setArguments(bundle);
        ft.replace(R.id.container,spdf,"personaldetailsfragment").commit();


    }
}