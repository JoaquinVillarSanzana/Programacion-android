package com.jvillar.prueba_2.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.jvillar.prueba_2.Entidades.Sensores;

import java.util.ArrayList;

public class Db_sensores extends BD_help{

    Context context;

    public Db_sensores(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarSensores (String Nombre, String Tipo, String valor_medida, String Fecha, String Hora) {

        long id = 0;
        try{
            BD_help bd_help = new BD_help(context);
            SQLiteDatabase db = bd_help.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nonbre",Nombre);
            values.put("tipo",Tipo);
            values.put("Valor_Medida",valor_medida);
            values.put("Fecha",Fecha);
            values.put("Hora",Hora);

            id  = db.insert(TABLE_SENSORES, null, values);

        }catch (Exception exception){
            exception.toString();

        }
        return id;




    }

    public ArrayList<Sensores> mostrarsensores(){
        BD_help bd_help = new BD_help(context);
        SQLiteDatabase db = bd_help.getWritableDatabase();

        ArrayList<Sensores> listasensores = new ArrayList<>();
        Sensores sensores = null;
        Cursor cursorsensores = null;

        cursorsensores = db.rawQuery("SELECT * FROM "+ TABLE_SENSORES, null);

        if(cursorsensores.moveToFirst()){
            do {
                sensores = new Sensores();
                sensores.setNombre(cursorsensores.getString(1));
                sensores.setTipo(cursorsensores.getString(2));
                sensores.setValor(cursorsensores.getString(3));
                listasensores.add(sensores);

            }while (cursorsensores.moveToNext());
        }

        cursorsensores.close();

        return listasensores;
    }
}
