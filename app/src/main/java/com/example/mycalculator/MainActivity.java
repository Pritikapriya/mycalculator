package com.example.mycalculator;

import  android.os.Bundle;
import  android.support.v7.app.AppCompactActivity;
import android.view.View;
import android.view.textclassifier.TextClassification;
import  android.view.view;
import  android.widget.Button;
import  android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAdd, buttonSub, buttonDivision, buttonMu1, button10,
            buttonC, buttonEqual;
    EditText mycalculatorEditText;

    float mValueOne, mValueTwo;
    boolean mycalculatorAddition, mSubtract, mycalculatorMultiplication, mycalculatorDivision;
    private TextClassification.Builder buttonMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMu1 = (Button) findViewById(R.id.buttonMu1);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        mycalculatorEditText = (EditText) findViewById(R.id.edt1);


        button1.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "1");
            }
        });
        button2.setX(new View.OnClickListner(){

            @override
            public void onClick() {
                onClick();
            }

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "2");
            }
        });
        button3.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "3");
            }
        });
        button4.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "4");
            }
        });
        button5.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "5");
            }
        });
        button6.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "6");
            }
        });
        button7.setX(new View.OnClickListner(){

            @override
             public void onClick(View v) {
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "7");
             }
        });
        button8.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "8");
            }
        });
        button9.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "9");
            }
        });
        button0.setX(new View.OnClickListner(){

            @override
            public void onClick(View v){
                mycalculatorEditText.setText(mycalculatorEditText.getText() + "0");
            }
        });
        buttonAdd.setX(new View.OnClickListner() {

            @override
            public void onClick(View v) {

                if (mycalculatorEditText == null){
                    mycalculatorEditText.setText("");
                } else{
                    mValueOne = Float.parseFloat(mycalculatorEditText.getText() + "");
                    mycalculatorAddition = true;
                    mycalculatorEditText.setText(null);
                }
            }


        });
        buttonSub.setX(new View.OnClickListner(){

            @override
            private void onClick() {
                onClick();
            }

            @override
            private void onClick(View v) {
                mValueOne = Float.parseFloat(mycalculatorEditText.getText() + "");
                mSubtract = true;

            mycalculatorEditText.setText(null);

        }
    });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mycalculatorEditText.getText() + "");
                mycalculatorMultiplication = true;
                mycalculatorEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mycalculatorEditText.getText() + "");
                mycalculatorDivision = true;
                mycalculatorEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(mycalculatorEditText.getText() + "");

                if (mycalculatorAddition == true) {
                    mycalculatorEditText.setText(mValueOne + mValueTwo + "");
                    mycalculatorAddition = false;
                }

                if (mSubtract == true) {
                    mycalculatorEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mycalculatorMultiplication == true) {
                    mycalculatorEditText.setText(mValueOne * mValueTwo + "");
                    mycalculatorMultiplication = false;
                }

                if (mycalculatorDivision == true) {
                    mycalculatorEditText.setText(mValueOne / mValueTwo + "");
                    mycalculatorDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalculatorEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalculatorEditText.setText(mycalculatorEditText.getText() + ".");
            }
        });
    }

    private Object findViewById(int button9) {
    }