package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstOne;
    EditText SecondOne;
    Button plus;
    Button minus;
    Button multiple;
    Button divide;
    Button equal;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstOne = (EditText) findViewById(R.id.EditTextOne);
        SecondOne = (EditText) findViewById(R.id.EditTextTwo);
        plus = (Button)findViewById(R.id.plusButton);
        minus = (Button)findViewById(R.id.minusButton);
        multiple= (Button)findViewById(R.id.multipleButton);
        divide= (Button)findViewById(R.id.divideButton);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstOne.getText().toString();
                SecondOne.getText().toString();

                int a;

            }
        });





    }
}
