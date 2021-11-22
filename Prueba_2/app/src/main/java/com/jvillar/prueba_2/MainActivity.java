package com.jvillar.prueba_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jvillar.prueba_2.BD.BD_help;
import com.jvillar.prueba_2.BD.Db_sensores;
import com.jvillar.prueba_2.Entidades.Sensores;
import com.jvillar.prueba_2.adaptador.lista_sensores_adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView lista_Sensores;
    ArrayList<Sensores> listaArraySensores;
    private LocationManager ubicacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_Sensores = findViewById(R.id.lista_Sensores);
        lista_Sensores.setLayoutManager(new LinearLayoutManager(this));

        Db_sensores db_sensores = new Db_sensores(MainActivity.this);

        listaArraySensores = new ArrayList<>();

        lista_sensores_adapter adapter = new lista_sensores_adapter(db_sensores.mostrarsensores());
        lista_Sensores.setAdapter(adapter);

    }

    private void localizacion() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION
            },100);

        }
        ubicacion = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location log = ubicacion.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_Nuevo:
                RegistroNuevo();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void RegistroNuevo(){
        Intent intent = new Intent(this, Nuevo_Activity.class);
        startActivity(intent);
    }


}