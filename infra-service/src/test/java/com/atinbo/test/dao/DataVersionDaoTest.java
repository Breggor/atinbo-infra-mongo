package com.atinbo.test.dao;

import com.atinbo.dao.DataVersionDao;
import com.atinbo.entity.DataVersion;
import com.atinbo.test.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by Breggor on 2016/3/30.
 */
public class DataVersionDaoTest extends BaseTest {
    @Autowired
    private DataVersionDao dataVersionDao;

    @Test
    public void testSave() {
        DataVersion entity = new DataVersion();
        entity.setCreateDate(new Date());
        entity.setModifyDate(new Date());
        entity.setModule("Test");
        entity.setVersion(1);
        entity.setDesc("测试数据模块版本");
        try {
            Key<DataVersion> key = dataVersionDao.save(entity);
        } catch (Exception e) {
            Assert.assertNotNull(e);
//            e.printStackTrace();
        }
    }


}