package com.atinbo.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据版本信息
 * Created by Breggor on 2016/3/30.
 */
@Entity(value = "data_version", noClassnameStored = true)
public class DataVersion implements Serializable {
    @Id
    private ObjectId id;

    @Indexed(options = @IndexOptions(name = "idx_module", unique = true))
    private String module;

    private String desc;

    @Property("create_date")
    private Date createDate;

    @Property("modify_date")
    private Date modifyDate;

    private int version;

    public DataVersion() {
    }

    public DataVersion(String module, Date createDate, Date modifyDate, int version) {
        this.module = module;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.version = version;
    }

    public DataVersion(String module, Date createDate, Date modifyDate, int version, String desc) {
        this.module = module;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.version = version;
        this.desc = desc;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
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