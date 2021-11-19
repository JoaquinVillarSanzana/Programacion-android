package com.jvillar.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnAgregarSensores, btnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregarSensores = (Button) findViewById(R.id.Agregar_Sensores);
        btnAgregarSensores.setOnClickListener(this);

        btnMapa=(Button) findViewById(R.id.btn_mapa);
        btnMapa.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Agregar_Sensores:
                Intent agregarSensorIntent = new Intent(this, AgregarSensor.class);
                startActivity(agregarSensorIntent);
                break;

            case R.id.btn_mapa:
                Intent mapActivityIntent = new Intent(this, MapaActivity.class);
                startActivity(mapActivityIntent);
                break;
        }
    }
}