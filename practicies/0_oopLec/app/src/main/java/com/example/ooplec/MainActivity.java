package com.example.ooplec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ooplec.hw.Product;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String nameStudent1="Ahmed";
        int ageStudent1=20;

        Student st1= new Student("Ahmed",20);


        Student st2=new Student();
        st2.setName("Ahmde");
        st2.setAge(33);


        String nameStudent2="Mohammed";
        int ageStudent2=30;


        Product p;


    }
}