package com.example.calculator_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button B1,B2,B3,B4,B5;
    boolean btnadd,btnsub,btnmul,btndiv;
    float num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.text1);
        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);
        B4=(Button)findViewById(R.id.b4);
        B5=(Button)findViewById(R.id.b5);
        B1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                num1 = Float.parseFloat(et1.getText()+" ");
                btnadd = true;
                et1.setText(null);
            }
        });
        B2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                num1 = Float.parseFloat(et1.getText()+" ");
                btnsub = true;
                et1.setText(null);
            }
        });
        B3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                num1 = Float.parseFloat(et1.getText()+" ");
                btnmul = true;
                et1.setText(null);
            }
        });
        B4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                num1 = Float.parseFloat(et1.getText()+" ");
                btndiv = true;
                et1.setText(null);
            }
        });
        B5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                num2 = Float.parseFloat(et1.getText()+" ");
                if(btnadd==true){
                    et1.setText(num1+num2+" ");
                    btnadd=false;
                }
                if(btnsub==true){
                    et1.setText(num1-num2+" ");
                    btnsub=false;
                }
                if(btnmul==true){
                    et1.setText(num1*num2+" ");
                    btnmul=false;
                }
                if(btndiv==true){
                    et1.setText(num1/num2+" ");
                    btndiv=false;
                }


            }
        });

    }
}