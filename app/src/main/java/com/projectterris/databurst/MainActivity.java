package com.projectterris.databurst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.projectterris.databurst.db.ToDoItem;
import com.projectterris.databurst.db.ToDoList;
import com.projectterris.databurstlib.DataburstFactory;
import com.projectterris.databurstlib.IDataburstRecord;
import com.projectterris.databurstlib.IDataburstable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "Creating Tables ArrayList");
        List<IDataburstRecord> tables = new ArrayList<IDataburstRecord>();
        Log.d("MainActivity", "Adding ToDoItem Table");
        tables.add(new ToDoItem());
        Log.d("MainActivity", "Adding ToDoList Table");
        tables.add(new ToDoList());
        Log.d("MainActivity", "Now Creating Database");
        IDataburstable db = DataburstFactory.createDataburst(tables);
        Log.d("MainActivity", "Database Creation Complete");




    }
}
