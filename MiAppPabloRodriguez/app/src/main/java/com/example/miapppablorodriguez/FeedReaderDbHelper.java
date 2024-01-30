package com.example.miapppablorodriguez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FeedReaderDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 5;
    public static final String DATABASE_NAME = "FeedReader.db";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedReaderContract.FeedEntry.TABLE_NAME + " (" +
                    FeedReaderContract.FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_NOMBRE + " TEXT," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_TIPO + " TEXT," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_DIRECCION + " TEXT," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_URL + " TEXT," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_TFNO + " TEXT," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_DATE + " TEXT," +
                    //FeedReaderContract.FeedEntry.COLUMN_VALORACION + " REAL," +  // Modificado
                    FeedReaderContract.FeedEntry.COLUMN_NAME_RUTA_FOTO + " TEXT" +
                    ")";



    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedReaderContract.FeedEntry.TABLE_NAME;

    public FeedReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
