package com.projectterris.databurstlib;

import java.util.List;

/**
 * Created by bensoer on 16/04/16.
 */
public interface IDataburstable {

    void insert(IDataburstRecord entry);

    void delete(IDataburstable entry);

    void update(IDataburstable oldEntry, IDataburstable newEntry);

    List<IDataburstRecord> find(IDataburstable search);

    IDataburstRecord findOne(IDataburstable search);
}
