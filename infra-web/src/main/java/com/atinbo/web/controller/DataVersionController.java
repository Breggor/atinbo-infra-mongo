package com.atinbo.web.controller;

import com.atinbo.param.DataVersionParam;
import com.atinbo.service.DataVersionService;
import com.atinbo.web.utils.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据版本URL接口
 * Created by Breggor on 2016/3/10.
 */
@RestController
@RequestMapping("/dataVersion")
public class DataVersionController {

    @Autowired
    private DataVersionService dataVersionService;

    /**
     * 获取模块数据版本号
     *
     * @param module 模块名
     * @return
     */
    @RequestMapping(value = "/{module}", method = RequestMethod.GET)
    public Map<String, Object> dataVersion(@PathVariable String module) {
        Map<String, Object> data = new HashMap<>();
        try {
            data.put("result", dataVersionService.findDataVersion(new DataVersionParam(module)));
        } catch (Exception e) {
            data.put("err", ExceptionUtil.procConstraintViolationException(e));
            e.printStackTrace();
        }
        return data;
    }

    /**
     * 更新模块数据版本
     *
     * @param module  模块名
     * @param version 版本
     * @return
     */
    @RequestMapping(value = "/{module}", method = RequestMethod.POST)
    public Map<String, Object> update(@PathVariable String module, @RequestParam Integer version) {
        Map<String, Object> data = new HashMap<>();
        try {
            data.put("result", dataVersionService.updateDataVersion(new DataVersionParam(module, version)));
        } catch (Exception e) {
            data.put("err", ExceptionUtil.procConstraintViolationException(e));
            e.printStackTrace();
        }
        return data;
    }
}
