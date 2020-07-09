package com.cms.dao;

import com.cms.entity.License;
import org.apache.ibatis.annotations.Param;

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
     * @param license
     * @return
     */
    public License isExistLicense(@Param("license") License license);

    /**
     * 获取参赛证
     *
     * @return License对象
     */
    public License getLicenseById(@Param("competitorId") String competitorId);
}
