package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Calendar extends AppCompatActivity {
private ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Toast.makeText(Calendar.this,"Calendar", Toast.LENGTH_SHORT).show();
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
    }
    public void Show(View v)
    {
        if(v.getId()==R.id.img1)
        {
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }
      else  if(v.getId()==R.id.img2)
        {
            img2.setVisibility(View.GONE);
            img3.setVisibility(View.VISIBLE);
        }
        else  if(v.getId()==R.id.img3)
        {
            img3.setVisibility(View.GONE);
            img4.setVisibility(View.VISIBLE);
        }
        else  if(v.getId()==R.id.img4)
        {
            img4.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }

        }
    }

