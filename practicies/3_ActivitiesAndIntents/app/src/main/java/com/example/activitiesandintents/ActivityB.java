package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        if (getIntent()!=null){
            Intent i2 = getIntent();

            if (i2.hasExtra("username")&&i2.hasExtra("phoneNumber")){
                String username= i2.getStringExtra("username");
                int phone= i2.getIntExtra("phoneNumber",0);

                Toast toast = new Toast(this);
                toast.setText("welcome'"+username+"'\nphone:"+phone);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

//                Toast.makeText(this, ("welcome'"+username+"'\nphone:"+phone),
//                        Toast.LENGTH_SHORT).show();

            }

        }
    }
}