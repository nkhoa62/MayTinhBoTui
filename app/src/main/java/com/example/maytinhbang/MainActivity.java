package com.example.maytinhbang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    Button BT1, BT2, BT3, BT4, BT5, BT6, BT7, BT8, BT9, BT0, BTCAL;
    EditText edA, edB;
    TextView PTKQ;
    RadioButton rdCong, rdTru, rdNhan, rdChia;
    boolean flag = false;
    String a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = "";
        b = "";
        PTKQ=(TextView)findViewById(R.id.PTKQ);
        edA=(EditText)findViewById(R.id.edA);
        edB=(EditText)findViewById(R.id.edB);
        BT1=(Button)findViewById(R.id.BT1);
        BT2=(Button)findViewById(R.id.BT2);
        BT3=(Button)findViewById(R.id.BT3);
        BT4=(Button)findViewById(R.id.BT4);
        BT5=(Button)findViewById(R.id.BT5);
        BT6=(Button)findViewById(R.id.BT6);
        BT7=(Button)findViewById(R.id.BT7);
        BT8=(Button)findViewById(R.id.BT8);
        BT9=(Button)findViewById(R.id.BT9);
        BT0=(Button)findViewById(R.id.BT0);
        BTCAL=(Button)findViewById(R.id.BTCAL);
        rdCong=(RadioButton)findViewById(R.id.rdCong);
        rdTru=(RadioButton)findViewById(R.id.rdTru);
        rdNhan=(RadioButton)findViewById(R.id.rdNhan);
        rdChia=(RadioButton)findViewById(R.id.rdChia);
        edA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
            }
        });

        edA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = true;
                }
            }
        });

        edB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
            }
        });

        edB.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = false;
                }
            }
        });
    }


    public void so1(View v)
    {
        if (flag) {
            a += BT1.getText().toString();
            edA.setText(a);
        } else {
            b += BT1.getText().toString();
            edB.setText(b);
        }
    }
    public void so2(View v)
    {
        if (flag) {
            a += BT2.getText().toString();
            edA.setText(a);
        } else {
            b += BT2.getText().toString();
            edB.setText(b);
        }
    }
    public void so3(View v)
    {
        if (flag) {
            a += BT3.getText().toString();
            edA.setText(a);
        } else {
            b += BT3.getText().toString();
            edB.setText(b);
        }
    }
    public void so4(View v)
    {
        if (flag) {
            a += BT4.getText().toString();
            edA.setText(a);
        } else {
            b += BT4.getText().toString();
            edB.setText(b);
        }
    }
    public void so5(View v)
    {
        if (flag) {
            a += BT5.getText().toString();
            edA.setText(a);
        } else {
            b += BT5.getText().toString();
            edB.setText(b);
        }
    }
    public void so6(View v)
    {
        if (flag) {
            a += BT6.getText().toString();
            edA.setText(a);
        } else {
            b += BT6.getText().toString();
            edB.setText(b);
        }
    }
    public void so7(View v)
    {
        if (flag) {
            a += BT7.getText().toString();
            edA.setText(a);
        } else {
            b += BT7.getText().toString();
            edB.setText(b);
        }
    }
    public void so8(View v)
    {
        if (flag) {
            a += BT8.getText().toString();
            edA.setText(a);
        } else {
            b += BT8.getText().toString();
            edB.setText(b);
        }
    }
    public void so9(View v)
    {
        if (flag) {
            a += BT9.getText().toString();
            edA.setText(a);
        } else {
            b += BT9.getText().toString();
            edB.setText(b);
        }
    }
    public void so0(View v)
    {
        if (flag) {
            a += BT0.getText().toString();
            edA.setText(a);
        } else {
            b += BT0.getText().toString();
            edB.setText(b);
        }
    }



    public void display(View v){
        Double a = Double.parseDouble(edA.getText().toString());
        Double b = Double.parseDouble(edB.getText().toString());
        Double s;
        if (rdCong.isChecked() == true)
            s = a + b;
        else if (rdTru.isChecked() == true)
            s= a-b;
        else if (rdNhan.isChecked() == true)
            s= a*b;
        else
            s= a/b;
        PTKQ.setText(String.valueOf(s));
    }

    public void reset(View view){
        a="";
        b="";
        edA.setText("");
        edB.setText("");
    }


    public void exit(View view) {
        System.exit(0);
    }
}