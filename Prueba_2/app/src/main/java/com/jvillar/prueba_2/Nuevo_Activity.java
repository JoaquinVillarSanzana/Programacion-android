package com.jvillar.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jvillar.prueba_2.BD.Db_sensores;

public class Nuevo_Activity extends AppCompatActivity {

    EditText txt_Nombre, txt_Tipos, txt_valor, txt_Fecha, txt_Hora;
    Button btn_Guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        txt_Nombre = findViewById(R.id.txt_Nombre);
        txt_Tipos = findViewById(R.id.txt_Tipos);
        txt_valor = findViewById(R.id.txt_valor);
        txt_Fecha = findViewById(R.id.txt_Fecha);
        txt_Hora = findViewById(R.id.txt_Hora);
        btn_Guardar = findViewById(R.id.btn_Guardar);

        btn_Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Db_sensores db_sensores = new Db_sensores(Nuevo_Activity.this );
                long id = db_sensores.insertarSensores(txt_Nombre.getText().toString(), txt_Tipos.getText().toString(), txt_valor.getText().toString(), txt_Fecha.getText().toString(), txt_Hora.getText().toString());

                if(id > 0){
                    Toast.makeText(Nuevo_Activity.this, " REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                    limpiar();
                }else{
                    Toast.makeText(Nuevo_Activity.this, " ERROR AL GUARDAR", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void limpiar(){
        txt_Nombre.setText("");
        txt_Tipos.setText("");
        txt_valor.setText("");
        txt_Fecha.setText("");
        txt_Hora.setText("");
    }
}