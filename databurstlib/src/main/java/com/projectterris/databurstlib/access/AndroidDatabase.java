package com.projectterris.databurstlib.access;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.projectterris.databurstlib.IDataburstRecord;
import com.projectterris.databurstlib.IDataburstable;
import com.projectterris.databurstlib.IStackable;

import java.util.List;

/**
 * Created by bensoer on 16/04/16.
 */
public class AndroidDatabase implements ICursorable{

    private DatabaseHelper databaseInstance;

    public AndroidDatabase(Context context){
        databaseInstance = new DatabaseHelper(context);
    }

    @Override
    public void insert(IDataburstRecord entry) {

    }

    @Override
    public void delete(IDataburstRecord entry) {

    }

    @Override
    public void update(IDataburstRecord oldEntry, IDataburstRecord newEntry) {

    }

    @Override
    public List<IDataburstRecord> find(IDataburstRecord search) {
        return null;
    }

    @Override
    public IDataburstRecord findOne(IDataburstRecord search) {
        return null;
    }



    private class DatabaseHelper extends SQLiteOpenHelper{

        private static final int DATABASE_VERSION = 1;
        private static final String DATABASE_NAME = "databurst";

        public DatabaseHelper(Context context){
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            //call queries to create tables
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            //call queries to delete all tables

            //call onCreate


        }
    }
}
