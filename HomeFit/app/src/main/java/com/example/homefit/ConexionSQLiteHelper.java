package com.example.homefit;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.homefit.utilidades.Utilidades;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {


    public ConexionSQLiteHelper(@Nullable Context context) {
        super(context, Utilidades.DATABASE_NAME, null, Utilidades.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.tablaUsuarios.CREAR_TABLA);

    }

    private void insertUsuario(SQLiteDatabase bd, int id, String nombre,String correo,String contraseña, String edad, String sexo, String estatura,String peso,String dificultad_deseada,String objetivo){
        ContentValues registro= new ContentValues();
        registro.put(Utilidades.tablaUsuarios.CAMPO_ID, id);
        registro.put(Utilidades.tablaUsuarios.CAMPO_NOMBRE, nombre);
        registro.put(Utilidades.tablaUsuarios.CAMPO_CONTRASENA, contraseña);
        registro.put(Utilidades.tablaUsuarios.CAMPO_EDAD,edad);
        registro.put(Utilidades.tablaUsuarios.CAMPO_SEXO,sexo);
        registro.put(Utilidades.tablaUsuarios.CAMPO_ESTATURA,estatura);
        registro.put(Utilidades.tablaUsuarios.CAMPO_PESO,peso);
        registro.put(Utilidades.tablaUsuarios.CAMPO_DIFICULTAD_DESEADA,dificultad_deseada);
        registro.put(Utilidades.tablaUsuarios.CAMPO_OBJETIVO,objetivo);

        bd.insert(Utilidades.tablaUsuarios.TABLA_NOMBRE,null, registro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS usuario");
        onCreate(db);
    }
}
