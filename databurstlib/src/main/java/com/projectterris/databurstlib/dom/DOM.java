package com.projectterris.databurstlib.dom;

import com.projectterris.databurstlib.IDataburstRecord;
import com.projectterris.databurstlib.IStackable;
import com.projectterris.databurstlib.access.ICursorable;

import java.util.List;

/**
 * Created by bensoer on 16/04/16.
 */
public class DOM implements IActiveRecord {

    private ICursorable childLayer;

    public DOM(ICursorable layer){
        childLayer = layer;
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
}
