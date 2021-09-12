package com.example.anushmp.fragcomms;

import java.io.Serializable;

public class previewmodel implements Serializable {

    String name,grade,percentage;

    int age;


    public previewmodel(String name, String grade, String percentage, int age) {
        this.name = name;
        this.grade = grade;
        this.percentage = percentage;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getPercentage() {
        return percentage;
    }

    public int getAge() {
        return age;
    }
}
