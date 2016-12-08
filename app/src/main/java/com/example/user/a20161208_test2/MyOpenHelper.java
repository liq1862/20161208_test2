package com.example.user.a20161208_test2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 2016/12/8.
 */

public class MyOpenHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "student.sqlite";
    public static final int version = 2;
    public MyOpenHelper(Context context) {
        super(context, DB_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE \"phone\" (\"ID\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"SName\" VARCHAR, \"Tel\" VARCHAR, \"Addr\" VARCHAR, \"note\" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == 1 && newVersion == 2)
        {
            db.execSQL("ALTER TABLE \"main\".\"phone\" ADD COLUMN \"note\" TEXT");
        }
    }
}