package com.cms.service;

import com.cms.entity.License;
import net.sf.json.JSONArray;

import java.util.List;

public interface LicenseService {

    /**
     * 添加参赛证
     *
     * @param license
     * @return
     */
    public JSONArray insertLicense(License license);

    /**
     * 查找是否已存在参赛证，避免重复插入
     *
     *
     * @return
     */
    public boolean isExistLicense(String competitorId, String cid);

    /**
     * 获取参赛证
     *
     * @return License对象
     */
    public JSONArray getLicense(String competitorId, String cid);

    public JSONArray updateLicense(License l);

    public List<License> getLicenseByCid(String cid);
}
