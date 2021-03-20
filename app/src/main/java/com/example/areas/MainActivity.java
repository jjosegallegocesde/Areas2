package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText horasTrabajadas;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horasTrabajadas=findViewById(R.id.horas);
        resultado=findViewById(R.id.resultado);


    }

    public void calcular(View view) {
        int horas=Integer.parseInt(horasTrabajadas.getText().toString());
        Double.parseDouble(horasTrabajadas.getText().toString());

    }
}