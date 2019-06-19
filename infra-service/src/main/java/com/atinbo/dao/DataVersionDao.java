package com.atinbo.dao;

import com.atinbo.entity.DataVersion;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by Breggor on 2016/3/30.
 */
@Repository
public class DataVersionDao extends BasicDAO<DataVersion,ObjectId> {

    @Autowired
    protected DataVersionDao(@Qualifier("datastore") Datastore ds) {
        super(ds);
    }
}
