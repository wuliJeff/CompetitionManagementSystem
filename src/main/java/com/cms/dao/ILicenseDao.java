package com.cms.dao;

import com.cms.entity.Information;
import com.cms.entity.License;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ILicenseDao {
    /**
     * 添加参赛证
     *
     * @param license
     * @return
     */
    public int insertLicense(@Param("license") License license);

    /**
     * 查找是否已存在参赛证，避免重复插入
     *
     * @return
     */
    public License isExistLicense(@Param("competitorId") String competitorId, @Param("cid") String cid);

    /**
     * 获取参赛证
     *
     * @return License对象
     */
    public List<License> getLicense(@Param("competitorId") String competitorId, @Param("cid") String cid);


    public int updateLicense(@Param("license") License license);

    public List<License> getLicenseByCid(@Param("cid") String cid);
}
