package com.example.student.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText etx3,etx4;
    Button btnp,btns,btnm,btnd;
    TextView answer;
    int i1,i2,ans;
    String val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent02 = getIntent();


        etx3 = findViewById(R.id.editText1);
        etx4 = findViewById(R.id.editText2);
        btnp = findViewById(R.id.buttonp);
        btns = findViewById(R.id.buttons);
        btnm = findViewById(R.id.buttonm);
        btnd = findViewById(R.id.buttond);
        answer = findViewById(R.id.textView5);

        val1 = intent02.getStringExtra("Number1");
        val2 = intent02.getStringExtra("Number2");

        i1 = Integer.parseInt(val1);
        i2 = Integer.parseInt(val2);

        etx3.setText(val1);
        etx4.setText(val2);

        btnp.setOnClickListener(this);
        btns.setOnClickListener(this);
        btnm.setOnClickListener(this);
        btnd.setOnClickListener(this);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        btnp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ans = i1+i2;
//                answer.setText(etx3+" + "+etx4+" = "+ans);
//            }
//        });
//
//        btns.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ans = i1-i2;
//                answer.setText(etx3+" - "+etx4+" = "+ans);
//            }
//        });
//
//        btnm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ans = i1*i2;
//                answer.setText(etx3+" * "+etx4+" = "+ans);
//            }
//        });
//
//        btnd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ans = i1/i2;
//                answer.setText(etx3+" / "+etx4+" = "+ans);
//            }
//        });
//
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonp:ans = i1+i2;
                answer.setText(etx3+" + "+etx4+" = "+ans);
                break;

            case R.id.buttons:ans = i1-i2;
                answer.setText(etx3+" - "+etx4+" = "+ans);
                break;

            case R.id.buttonm:ans = i1*i2;
                answer.setText(etx3+" * "+etx4+" = "+ans);
                break;

            case R.id.buttond:ans = i1/i2;
                answer.setText(etx3+" / "+etx4+" = "+ans);
                break;
        }
    }
}
