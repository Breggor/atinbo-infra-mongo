package com.atinbo.param;


import java.io.Serializable;

/**
 * Created by Breggor on 2016/3/30.
 */
public class DataVersionParam implements Serializable {
    private String module;
    private Integer version;

    public DataVersionParam() {
    }

    public DataVersionParam(String module) {
        this.module = module;
    }

    public DataVersionParam(String module, int version) {
        this.module = module;
        this.version = version;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
