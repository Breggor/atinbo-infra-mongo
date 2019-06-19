package com.atinbo.vo;

import java.io.Serializable;

/**
 * 数据版本信息
 * Created by Breggor on 2016/3/30.
 */
public class DataVersionVO implements Serializable {
    private String module;
    private String desc;
    private int version;

    public DataVersionVO() {
    }

    public DataVersionVO(String module, int version) {
        this.module = module;
        this.version = version;
    }

    public DataVersionVO(String module, String desc, int version) {
        this.module = module;
        this.desc = desc;
        this.version = version;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}