package com.example.student.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityOne extends AppCompatActivity {

    Button btnOk;
    EditText etx1;
    EditText etx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        btnOk = findViewById(R.id.btn1);

        etx1 = findViewById(R.id.editText1);
        etx2 = findViewById(R.id.editText2);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btnOk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intend01 = new Intent(MainActivityOne.this, SecondActivity.class);

//                int msg1 = Integer.parseInt(etx1.getText().toString());
//                int msg2 = Integer.parseInt(etx2.getText().toString());

                intend01.putExtra("Number1", etx1.getText().toString());
                intend01.putExtra("Number2", etx2.getText().toString());


                startActivity(intend01);
            }
        });
    }
}
