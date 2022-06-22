package com.example.calculonotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText primeraNota;
    private EditText segundaNota;
    private EditText terceraNota;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conexion de la parte logica con la parte grafica por medio de la clase R y el id asignado
        primeraNota = (EditText)findViewById(R.id.txt_num1);
        segundaNota = (EditText)findViewById(R.id.txt_num2);
        terceraNota = (EditText)findViewById(R.id.txt_num3);
        resultado = (TextView)findViewById(R.id.txt_resultado);
    }

    //Este metodo va a realizar el promedio

    //la libreria view va a permitirme visualizar el elemento en la parte grafica
    public void Promediar(View view){
        //hacemos un parceo de int a string
        String valor1 = primeraNota.getText().toString();
        String valor2 = segundaNota.getText().toString();
        String valor3 = terceraNota.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int num3 = Integer.parseInt(valor3);

        int suma = num1+num2+num3;
        double promedio = (suma/3);

        String resultadoFinal = String.valueOf(promedio);
        resultado.setText(resultadoFinal);

        if (promedio >= 3){
            Toast.makeText(this,"tu nota es aprobatoria!!",Toast.LENGTH_LONG).show();
        }else if (promedio < 3){
            Toast.makeText(this,"lo siento, reprobaste :(",Toast.LENGTH_LONG).show();
        }

    }
}