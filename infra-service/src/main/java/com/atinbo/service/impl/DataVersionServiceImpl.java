package com.atinbo.service.impl;

import com.atinbo.dao.DataVersionDao;
import com.atinbo.entity.DataVersion;
import com.atinbo.param.DataVersionParam;
import com.atinbo.service.DataVersionService;
import com.atinbo.vo.DataVersionVO;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Breggor on 2019/3/30.
 */
@Service("dataVersionService")
public class DataVersionServiceImpl implements DataVersionService {
    @Autowired
    private DataVersionDao dataVersionDao;

    @Override
    public DataVersionVO findDataVersion(DataVersionParam param) {
        if (param == null) {
            throw new IllegalArgumentException("param is null or empty");
        }
        DataVersionVO result = null;
        DataVersion entity = dataVersionDao.findOne("module", param.getModule());
        if (entity != null) {
            result = new DataVersionVO(entity.getModule(), entity.getDesc(), entity.getVersion());
        }
        return result;
    }

    @Override
    public boolean updateDataVersion(DataVersionParam param) {
        boolean result = false;
        Query<DataVersion> query = dataVersionDao.createQuery().field("module").equal(param.getModule());
        if (query.count() > 0) {
            UpdateResults ur = dataVersionDao.updateFirst(query, dataVersionDao.createUpdateOperations().inc("version", param.getVersion() == null ? 1 : param.getVersion()));
            if (ur.getUpdatedExisting()) {
                result = true;
            }
        } else {
            Key<DataVersion> key = dataVersionDao.save(new DataVersion(param.getModule(), new Date(), new Date(), param.getVersion()));
            result = key.getId() != null ? true : false;
        }
        return result;
    }
}
