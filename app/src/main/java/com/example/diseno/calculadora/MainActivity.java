package com.example.diseno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText info;
    public double primero, segundo, inforesult;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = findViewById(R.id.resultado);
    }

    public void btnpunto (View view){
        String captura = info.getText().toString();
        captura = captura+".";
        info.setText(captura);
    }

    public void btn0 (View view){
        String captura = info.getText().toString();
        captura = captura+"0";
        info.setText(captura);
    }

    public void btn1 (View view){
        String captura = info.getText().toString();
        captura = captura+"1";
        info.setText(captura);
    }

    public void btn2 (View view){
        String captura = info.getText().toString();
        captura = captura+"2";
        info.setText(captura);
    }

    public void btn3 (View view){
        String captura = info.getText().toString();
        captura = captura+"3";
        info.setText(captura);
    }

    public void btn4 (View view){
        String captura = info.getText().toString();
        captura = captura+"4";
        info.setText(captura);
    }

    public void btn5 (View view){
        String captura = info.getText().toString();
        captura = captura+"5";
        info.setText(captura);
    }

    public void btn6 (View view){
        String captura = info.getText().toString();
        captura = captura+"6";
        info.setText(captura);
    }

    public void btn7 (View view){
        String captura = info.getText().toString();
        captura = captura+"7";
        info.setText(captura);
    }

    public void btn8 (View view){
        String captura = info.getText().toString();
        captura = captura+"8";
        info.setText(captura);
    }

    public void btn9 (View view){
        String captura = info.getText().toString();
        captura = captura+"9";
        info.setText(captura);
    }

    public void primerNum(int view){
        try{
            String contadorA = info.getText().toString();
            primero = Double.parseDouble(contadorA);
        }catch(NumberFormatException nfe){};
        info.setText("");
    }

    public void suma(View view){
        primerNum(0);
        operacion=0;
    }

    public void resta(View view){
        primerNum(0);
        operacion=1;
    }

    public void multiplica(View view){
        primerNum(0);
        operacion=2;
    }

    public void dividir(View view){
        primerNum(0);
        operacion=3;
    }

    public void igual (View view){
        try{
            String contadorB = info.getText().toString();
            segundo = Double.parseDouble(contadorB);
        }catch(NumberFormatException nfe){};
        info.setText("");

        switch (operacion){
            case 0:{
                inforesult = primero+segundo;
                info.setText(""+inforesult);
                break;
            }
            case 1:{
                inforesult = primero-segundo;
                info.setText(""+inforesult);
                break;
            }
            case 2:{
                inforesult = primero*segundo;
                info.setText(""+inforesult);
                break;
            }
            case 3:{
                if(segundo==0){
                    info.setText("Error");
                }else{
                    inforesult = primero/segundo;
                    info.setText(""+inforesult);
                }
                break;
            }
        }
        primero=inforesult;
    }

    public void ac (View v){
        info.setText("");
        primero=0.0;
        segundo=0.0;
        inforesult=0.0;
    }
}
