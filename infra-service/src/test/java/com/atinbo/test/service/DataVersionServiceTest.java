package com.atinbo.test.service;

import com.atinbo.param.DataVersionParam;
import com.atinbo.service.DataVersionService;
import com.atinbo.test.base.BaseTest;
import com.atinbo.vo.DataVersionVO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Breggor on 2016/3/30.
 */
public class DataVersionServiceTest extends BaseTest {
    @Autowired
    private DataVersionService dataVersionService;

    @Test
    public void testFindDataVersion() throws Exception {
        DataVersionVO result = dataVersionService.findDataVersion(new DataVersionParam("Breggor"));
        Assert.assertNotNull(result);
    }

    @Test
    public void testUpdateDataVersion() throws Exception {
        boolean result = dataVersionService.updateDataVersion(new DataVersionParam("Breggor", 1));
        Assert.assertEquals(result, true);
    }
}