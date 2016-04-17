package com.projectterris.databurstlib;

import android.content.Context;

import com.projectterris.databurstlib.access.AndroidDatabase;
import com.projectterris.databurstlib.access.ICursorable;
import com.projectterris.databurstlib.cache.Cache;
import com.projectterris.databurstlib.cache.ICacheable;
import com.projectterris.databurstlib.dom.DOM;
import com.projectterris.databurstlib.dom.IActiveRecord;

import java.util.List;

/**
 * Created by bensoer on 16/04/16.
 */
public class DataburstFactory {

    private static IDataburstable instance = null;
    private static IStackable stack = null;

    private DataburstFactory(){}


    public static IDataburstable createDataburst(List<IDataburstRecord> tables, Context context){

        //create the stack
        AndroidDatabase adb = new AndroidDatabase(context);
        DOM dom = new DOM(adb);
        Cache cache = new Cache(dom);
        instance = cache;
        stack = cache;

        //parse each table to get attributes which will become columns in table


        //run queries down the stack to create these tables


        return instance;
    }

    public static IDataburstable createDataburst(List<IDataburstRecord> tables, Context context, IDataburstable stack){
        instance = stack;
        //DataburstFactory.stack = stack;

        //TODO: configuration steps with the stack

        //parse each table to get attributes which will become columns in table

        //run queries down the stack to create these tables




        return
    }

    /**
     * getDataburst is a helper method that will get the last instance that was created with the
     * createDataburst call
     * @return
     */
    public static IDataburstable getDataburst(){
        return instance;
    }
}
