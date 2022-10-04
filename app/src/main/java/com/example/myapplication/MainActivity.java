package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ladoA, ladoB, ladoC;
    TextView result, result3;
    Button verificar;
    public float triangulo, triangulo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoA = (EditText) findViewById(R.id.ladoa);
        ladoB = (EditText) findViewById(R.id.ladob);
        ladoC = (EditText) findViewById(R.id.ladoc);
        verificar = (Button) findViewById(R.id.verificar);
        result = (TextView) findViewById(R.id.result);
      //  result3 = (TextView) findViewById(R.id.result3);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ladoAn = Float.parseFloat((ladoA.getText().toString()));
                float ladoBn = Float.parseFloat((ladoB.getText().toString()));
                float ladoCn = Float.parseFloat((ladoC.getText().toString()));

                if (ladoAn > ladoBn && ladoAn > ladoCn){
                    triangulo = ladoBn+ladoCn;
                    if(triangulo > ladoAn){
                        result.setText("isto é um triangulo");

                       if (ladoAn == ladoBn && ladoAn == ladoCn && ladoBn == ladoCn){
                            result3.setText("Equilatero");
                        }

                    }
                    else{
                        result.setText("isto não é um triangulo");
                    }
                }


                if (ladoBn > ladoAn && ladoBn > ladoCn){
                    triangulo = ladoAn+ladoCn;
                    if(triangulo > ladoBn){
                        result.setText("isto é um triangulo");
                    }
                    else{
                        result.setText("isto não é um triangulo");
                    }

                }


                if (ladoCn > ladoAn && ladoCn > ladoBn){
                    triangulo = ladoBn+ladoAn;
                    if(triangulo > ladoCn){
                        result.setText("isto é um triangulo");
                    }
                    else{
                        result.setText("isto não é um triangulo");
                    }

                }

            }
        });


    }
}