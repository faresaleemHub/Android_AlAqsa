package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText ed_username, ed_phoneNumber;
    Button btn_transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed_username=findViewById(R.id.ed_username);
        ed_phoneNumber = findViewById(R.id.ed_phoneNumber);

        btn_transfer=findViewById(R.id.btn_transfer);

        btn_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=ed_username.getText().toString();
                int phone = Integer.parseInt(ed_phoneNumber.getText().toString());

//                Intent i= new Intent(getApplicationContext(),ActivityB.class);
                Intent i= new Intent("show_details");
                i.putExtra("username",username);
                i.putExtra("phoneNumber",phone);
                startActivity(i);

                finish();
            }
        });
    }
}