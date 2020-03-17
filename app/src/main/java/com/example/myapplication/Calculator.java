package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    private EditText in1;
    private EditText in2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Toast.makeText(Calculator.this,"Calculator", Toast.LENGTH_SHORT).show();
        in1=(EditText)findViewById(R.id.in1);
        in2=(EditText)findViewById(R.id.in2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        t1=(TextView)findViewById(R.id.t1);
    }
    public void add(View v)
    {
        double v1=Double.parseDouble(in1.getText().toString());
        double v2=Double.parseDouble(in2.getText().toString());
        double v3=v1+v2;
        t1.setText(Double.toString(v3));
    }
    public void sub(View v)
    {
        double v1=Double.parseDouble(in1.getText().toString());
        double v2=Double.parseDouble(in2.getText().toString());
        double v3=v1-v2;
        t1.setText(Double.toString(v3));
    }
    public void mul(View v)
    {
        double v1=Double.parseDouble(in1.getText().toString());
        double v2=Double.parseDouble(in2.getText().toString());
        double v3=v1*v2;
        t1.setText(Double.toString(v3));
    }
    public void div(View v)
    {
        double v1=Double.parseDouble(in1.getText().toString());
        double v2=Double.parseDouble(in2.getText().toString());
        double v3=v1/v2;
        t1.setText(Double.toString(v3));
    }
}
