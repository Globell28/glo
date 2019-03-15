package com.example.gloriaj.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Addition, Subtraction,Multiplication,Division,equal;
    private Button button1, button2, button3, button4, button5, clear ;
    private Button button6, button7, button8, button9, button0;
    private TextView info, Result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private double val1 = Double.NaN;
    private double val2 = Double.NaN;
    private char ACTION;
    private final char EQU = 0;

            @Override
    protected  void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                setupUIViews();

                button0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "0");
                    }
                });

                button1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "1");
                    }
                });

                button2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "2");
                    }
                });

                button3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "3");
                    }
                });

                button4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "4");
                    }
                });

                button5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "5");
                    }
                });

                button6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "6");
                    }
                });

                button7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "7");
                    }
                });

                button8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "8");
                    }
                });

                button9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        info.setText(info.getText().toString() + "9");
                    }
                });

                Addition.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        compute();
                        ACTION = ADDITION;
                        Result.setText(String.valueOf(val1 + "+" ));
                        info.setText(null);
                    }
                });
                Subtraction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        compute();
                        ACTION = SUBTRACTION;
                        Result.setText(String.valueOf(val1 + "-" ));
                        info.setText(null);
                    }
                });
                Multiplication.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        compute();
                        ACTION = MULTIPLICATION;
                        Result.setText(String.valueOf(val1 + "*" ));
                        info.setText(null);
                    }
                });
                Division.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        compute();
                        ACTION = DIVISION;
                        Result.setText(String.valueOf(val1 + "/" ));
                        info.setText(null);
                    }
                });
                equal.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        compute();
                        ACTION = EQU;
                        Result.setText(Result.getText().toString() + String.valueOf(val2)+ "=" + String.valueOf(val1));
                        //stores the value in val1
                        info.setText(null);
                    }
                });
                clear.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (info.getText().length() > 0){
                            CharSequence name = info.getText().toString();
                            info.setText(name.subSequence(0, name.length()-1));
                        }
                        else{
                            val1 = Double.NaN;
                            val2 = Double.NaN;
                            info.setText(null);
                            Result.setText(null);
                        }
                    }
                });


            }
            private void setupUIViews(){
                button0 = (Button)findViewById(R.id.btn0);
                button1 = (Button)findViewById(R.id.btn1);
                button2 = (Button)findViewById(R.id.btn2);
                button3 = (Button)findViewById(R.id.btn3);
                button4 = (Button)findViewById(R.id.btn4);
                button5 = (Button)findViewById(R.id.btn5);
                button6 = (Button)findViewById(R.id.btn6);
                button7 = (Button)findViewById(R.id.btn7);
                button8 = (Button)findViewById(R.id.btn8);
                button9 = (Button)findViewById(R.id.btn9);
                Addition = (Button)findViewById(R.id.addbtn);
                Subtraction = (Button)findViewById(R.id.minus);
                Multiplication = (Button)findViewById(R.id.btn_mul);
                Division = (Button)findViewById(R.id.btndivide);
                equal = (Button)findViewById(R.id.btn_equal);
                clear = (Button)findViewById(R.id.btnClear);
                info = (TextView)findViewById(R.id.info);
                Result = (TextView)findViewById(R.id.txtResult);
            }

            private void compute(){
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(info.getText().toString());

                    switch(ACTION){
                        case ADDITION:
                            val1=val1+val2;
                            break;
                        case SUBTRACTION:
                            val1=val1 - val2;
                            break;
                        case MULTIPLICATION:
                            val1=val1 * val2;
                            break;
                        case DIVISION:
                            val1=val1/val2;
                            break;
                        case EQU:
                            break;


                    }
                }
                else{
                    val1 = Double.parseDouble(info.getText().toString());
                }
            }

}