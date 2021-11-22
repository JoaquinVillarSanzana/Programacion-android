package com.jvillar.prueba_2.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BD_help extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 9;
    private static final String DATABASE_NOMBRE = "lista.db";
    public static final String TABLE_SENSORES = "t_sensores";

    public BD_help(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_SENSORES + "(" +
                "Nombre TEXT NOT NULL,"+
                "Tipo TEXT NOT NULL," +
                "Valor_medida TEXT NOT NULL,"+
                "Fecha DATE," +
                "Hora DATE) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE "+ TABLE_SENSORES);
        onCreate(sqLiteDatabase);
    }
}
