package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

//        Intent i=new Intent(Intent.ACTION_DIAL);
//        i.setData(Uri.parse("tel:0592552050"));
//        if (i.resolveActivity(getPackageManager())!=null){
//            startActivity(i);
//        }




//        Intent i=new Intent(Intent.ACTION_SEND);
//        Uri uri=Uri.parse("smsto:0592552051");
//        i.setData(uri);
//        i.putExtra("sms_body","محتوى الرسالة");
//        if (i.resolveActivity(getPackageManager())!=null){
//            startActivity(i);
//        }


        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.ps")));
    }
}