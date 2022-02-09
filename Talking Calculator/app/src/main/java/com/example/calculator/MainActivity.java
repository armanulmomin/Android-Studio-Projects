package com.example.calculator;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBack,btnclear,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnSubtruct,btnMultiply,btnDot,btnDivide,btnzero,
            btnEqual,btnSqrt,btnXpowerTwo,btnXpowerY,btnFactorial;
         EditText edtResult;
         double firstValue,secondValue,result;
         String op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        typeCast();


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnzero.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnXpowerTwo.setOnClickListener(this);
        btnFactorial.setOnClickListener(this);

    }

    public void typeCast()
    {
        edtResult=(EditText) findViewById(R.id.mytext);
        btnBack=(Button) findViewById(R.id.backspace);
        btnclear=(Button) findViewById(R.id.clear);
        btn1=(Button) findViewById(R.id.one);
        btn2=(Button) findViewById(R.id.two);
        btn3=(Button) findViewById(R.id.three);
        btn4=(Button) findViewById(R.id.four);
        btn5=(Button) findViewById(R.id.five);
        btn6=(Button) findViewById(R.id.six);
        btn7=(Button) findViewById(R.id.seven);
        btn8=(Button) findViewById(R.id.eight);
        btn9=(Button) findViewById(R.id.nine);
        btnzero=(Button) findViewById(R.id.zero);
        btnPlus=(Button) findViewById(R.id.plus);
        btnSubtruct=(Button) findViewById(R.id.minus);
        btnMultiply=(Button) findViewById(R.id.multiply);
        btnDivide=(Button) findViewById(R.id.divide);
        btnDot=(Button) findViewById(R.id.dot);
        btnSqrt=(Button) findViewById(R.id.squareroot);
        btnXpowerTwo=(Button) findViewById(R.id.xpower2);
        btnXpowerY=(Button) findViewById(R.id.xpowery);
        btnFactorial=(Button) findViewById(R.id.nfactorial);
        btnEqual=(Button)findViewById(R.id.equal);
        btnSubtruct.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnSqrt.setOnClickListener(this);
        btnXpowerY.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.one)
        {
            final MediaPlayer mp1=MediaPlayer.create(this,R.raw.one);
            mp1.start();
            edtResult.setText(edtResult.getText()+"1");


        }
        else if(v.getId()==R.id.two)
        {
            final MediaPlayer mp2=MediaPlayer.create(this,R.raw.two);
            mp2.start();
            edtResult.setText(edtResult.getText()+"2");
        }
        else if(v.getId()==R.id.three)
        {
            final MediaPlayer mp3=MediaPlayer.create(this,R.raw.three);
            mp3.start();
            edtResult.setText(edtResult.getText()+"3");
        }
        else if(v.getId()==R.id.four)
        {
            final MediaPlayer mp4=MediaPlayer.create(this,R.raw.four);
            mp4.start();
            edtResult.setText(edtResult.getText()+"4");
        }
        else if(v.getId()==R.id.five)
        {
            final MediaPlayer mp5=MediaPlayer.create(this,R.raw.five);
            mp5.start();
            edtResult.setText(edtResult.getText()+"5");
        }
        else if(v.getId()==R.id.six)
        {
            final MediaPlayer mp6=MediaPlayer.create(this,R.raw.six);
            mp6.start();
            edtResult.setText(edtResult.getText()+"6");
        }
        else if(v.getId()==R.id.seven)
        {
            final MediaPlayer mp7=MediaPlayer.create(this,R.raw.seven);
            mp7.start();
            edtResult.setText(edtResult.getText()+"7");
        }
        else if(v.getId()==R.id.eight)
        {
            final MediaPlayer mp8=MediaPlayer.create(this,R.raw.eight);
            mp8.start();
            edtResult.setText(edtResult.getText()+"8");
        }
        else if(v.getId()==R.id.nine)
        {
            final MediaPlayer mp9=MediaPlayer.create(this,R.raw.nine);
            mp9.start();
            edtResult.setText(edtResult.getText()+"9");
        }
        else if (v.getId()==R.id.zero)
        {
            final MediaPlayer mp0=MediaPlayer.create(this,R.raw.zero);
            mp0.start();
            edtResult.setText(edtResult.getText()+"0");
        }
        else if (v.getId()==R.id.dot)
        {
            final MediaPlayer mpdecimal=MediaPlayer.create(this,R.raw.decimalpoint);
            mpdecimal.start();
            edtResult.setText(edtResult.getText()+".");
        }
        else if(v.getId()==R.id.backspace)
        {
            final MediaPlayer mpback=MediaPlayer.create(this,R.raw.backspace);
            mpback.start();
            if(!edtResult.getText().toString().equals(""))
            {
                String value=edtResult.getText().toString();
                if(value.length()>0)
                {
                    value=value.substring(0,value.length()-1);
                    edtResult.setText(value);
                }
            }
        }
        else if (v.getId()==R.id.clear)
        {
            final MediaPlayer mpclear=MediaPlayer.create(this,R.raw.clear);
            mpclear.start();
            edtResult.setText("");
        }
        else if(v.getId()==R.id.plus)
        {
            final MediaPlayer mpplus=MediaPlayer.create(this,R.raw.plus);
            mpplus.start();
            if (edtResult.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this,"please enter a valid number",Toast.LENGTH_SHORT).show();
        }
        else {
            firstValue = Double.parseDouble(edtResult.getText().toString());
            op = "+";
            edtResult.setText("");
        }
        }
        else if(v.getId()==R.id.minus) {

            final MediaPlayer mpminus=MediaPlayer.create(this,R.raw.minus);
            mpminus.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            } else {
                firstValue = Double.parseDouble(edtResult.getText().toString());
                op = "-";
                edtResult.setText("");
            }
        }
        else if(v.getId()==R.id.multiply) {
            final MediaPlayer mpmultiply=MediaPlayer.create(this,R.raw.multiply);
            mpmultiply.start();

            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            } else {
                firstValue = Double.parseDouble(edtResult.getText().toString());
                op = "*";
                edtResult.setText("");
            }
        }
        else if(v.getId()==R.id.divide)
        {
            final MediaPlayer mpdivide=MediaPlayer.create(this,R.raw.divide);
            mpdivide.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            }
            else {

                {
                    firstValue = Double.parseDouble(edtResult.getText().toString());
                    op = "/";
                    edtResult.setText("");
                }
            }
        }


        else if(v.getId()==R.id.equal)
        {
            final MediaPlayer mpequal=MediaPlayer.create(this,R.raw.equal);
            mpequal.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            }


            else {

                {
                    secondValue = Double.parseDouble(edtResult.getText().toString());
                    switch (op) {
                        case "+":
                            result = firstValue + secondValue;
                            edtResult.setText(result + "");
                            break;
                        case "-":
                            result = firstValue - secondValue;
                            edtResult.setText(result + "");
                            break;
                        case "*":
                            result = firstValue * secondValue;
                            edtResult.setText(result + "");
                            break;
                        case "/":
                            result = firstValue / secondValue;
                            edtResult.setText(result + "");
                            break;
                        case "xpowery":
                            double x = Math.pow(firstValue, secondValue);
                            edtResult.setText(x + "");
                            break;


                    }
                }
            }
        }





        else if(v.getId()==R.id.squareroot)
        {
            final MediaPlayer mpsqrt=MediaPlayer.create(this,R.raw.squareroot);
            mpsqrt.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            }
            else {

                {
                    double value = Double.parseDouble(edtResult.getText().toString());
                    double res = Math.sqrt(value);
                    edtResult.setText(res + "");
                }
            }
        }


        else if (v.getId()==R.id.xpower2)
        {
            final MediaPlayer mpsqr=MediaPlayer.create(this,R.raw.square);
            mpsqr.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            }
            else {

                {
                    Double value = Double.parseDouble(edtResult.getText().toString());
                    edtResult.setText(value * value + "");
                }
            }
        }

        else if(v.getId()==R.id.xpowery)
        {
            final MediaPlayer mppower=MediaPlayer.create(this,R.raw.power);
            mppower.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            }
            else {
                {
                    firstValue = Double.parseDouble(edtResult.getText().toString());
                    op = "xpowery";
                    edtResult.setText("");
                }
            }
        }

        else if(v.getId()==R.id.nfactorial)
        {
            final MediaPlayer mpfact=MediaPlayer.create(this,R.raw.factorial);
            mpfact.start();
            if (edtResult.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "please enter a valid number", Toast.LENGTH_SHORT).show();
            }
            else {
                {
                    double factt = Double.parseDouble(edtResult.getText().toString());

                    double fact = 1;
                    for (int i = 2; i <= factt; i++) {
                        fact *= i;
                        edtResult.setText(fact + "");
                    }


                }
            }
        }

        




    }
}

