package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // Context mensager = getApplicationContext();
   // String mensM = "hello world";
   // int duration = Toast.LENGTH_SHORT;
   // Toast finish = Toast.makeText(mensager,mensM,duration);
   // finish.show();





    EditText ladoA, ladoB, ladoC;
    TextView result, result2;
    Button verificar;
    public float trianguloA, trianguloB, trianguloC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoA = (EditText) findViewById(R.id.ladoa);
        ladoB = (EditText) findViewById(R.id.ladob);
        ladoC = (EditText) findViewById(R.id.ladoc);
        verificar = (Button) findViewById(R.id.verificar);
        result = (TextView) findViewById(R.id.result);
        result2 = (TextView) findViewById(R.id.result2);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ladoAn = Float.parseFloat((ladoA.getText().toString()));
                float ladoBn = Float.parseFloat((ladoB.getText().toString()));
                float ladoCn = Float.parseFloat((ladoC.getText().toString()));
                trianguloA = ladoBn+ladoCn;
                trianguloB = ladoAn+ladoCn;
                trianguloC = ladoAn+ladoBn;


                if ((ladoAn >= ladoBn && ladoAn >= ladoCn && trianguloA >= ladoAn ) || (ladoBn >= ladoAn && ladoBn >= ladoCn && trianguloB >= ladoBn) || (ladoCn >= ladoAn && ladoCn >= ladoBn && trianguloC >= ladoCn)) {
                    result.setText("Isto é um triangulo");
                    Toast.makeText(getApplicationContext(),"hello world", Toast.LENGTH_LONG).show();


                    if ((ladoAn == ladoBn && ladoAn == ladoCn && ladoBn == ladoCn)) {
                        result2.setText("isto é um equilatero");


                    } else if(ladoAn != ladoBn && ladoAn != ladoCn && ladoBn != ladoCn) {
                        result2.setText("isto é um escaleno");

                    }else{
                        result2.setText("isto é um isoceles");


                    }
                }
                else {
                    result.setText("Isto não é um triangulo");
                    result2.setText("");


                }



                }




        });


    }
}
