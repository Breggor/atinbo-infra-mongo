package com.atinbo.service;

import com.atinbo.param.DataVersionParam;
import com.atinbo.vo.DataVersionVO;

/**
 * 数据版本信息
 * Created by Breggor on 2016/3/30.
 */
public interface DataVersionService {
    /**
     * 查询数据版本信息
     *
     * @param param
     * @return
     */
    DataVersionVO findDataVersion(DataVersionParam param);

    /**
     * 更新版本号
     * version 默认：加1
     */
    boolean updateDataVersion(DataVersionParam param);
}
