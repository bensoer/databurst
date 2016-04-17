package com.projectterris.databurstlib;

import java.util.List;

/**
 * Created by bensoer on 16/04/16.
 */
public interface IDataburstable {

    void insert(IDataburstRecord entry);

    void delete(IDataburstRecord entry);

    void update(IDataburstRecord oldEntry, IDataburstRecord newEntry);

    List<IDataburstRecord> find(IDataburstRecord search);

    IDataburstRecord findOne(IDataburstRecord search);
}
