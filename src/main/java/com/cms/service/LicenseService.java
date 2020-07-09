package com.cms.service;

import com.cms.entity.License;

public interface LicenseService {

    /**
     * 添加参赛证
     *
     * @param license
     * @return
     */
    public boolean insertLicense(License license);

    /**
     * 查找是否已存在参赛证，避免重复插入
     *
     * @param license
     * @return
     */
    public boolean isExistLicense(License license);

    /**
     * 获取参赛证
     *
     * @return License对象
     */
    public License getLicenseById(String competitorId);
}