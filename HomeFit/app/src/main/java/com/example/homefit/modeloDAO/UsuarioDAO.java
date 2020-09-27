package com.example.homefit.modeloDAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.homefit.ConexionSQLiteHelper;
import com.example.homefit.utilidades.Utilidades;
import com.example.homefit.entidades.Usuario;

public class UsuarioDAO {
    ConexionSQLiteHelper conexionSQLiteHelper;
    SQLiteDatabase db;

    public void UsuarioDAO(Context context){
        conexionSQLiteHelper=new ConexionSQLiteHelper(context);
    }

    public long insertarUsuario(Usuario usuario){
        ContentValues registro= new ContentValues();
        registro.put(Utilidades.tablaUsuarios.CAMPO_ID,usuario.getId());

        return 0;
    }
}
