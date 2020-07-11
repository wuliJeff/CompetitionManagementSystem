package com.cms.service.serviceImpl;

import com.cms.dao.ILicenseDao;
import com.cms.entity.License;
import com.cms.service.LicenseService;
import com.cms.util.JsonUtil;
import com.cms.util.MapperConfig;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class LicenseServiceImpl implements LicenseService {

    private String msg = null;
    private SqlSession session;

    public LicenseServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public JSONArray insertLicense(License license) {
        /**
         * 存在参赛证则不重复插入
         */
        if (isExistLicense(license)) {
            msg = "参赛证已存在";
            return JsonUtil.returnStatus(false, msg);
        } else {
            int competitorId = session.getMapper(ILicenseDao.class).insertLicense(license);
            if (competitorId >= 0) {
                msg = "参赛证添加成功";
                return JsonUtil.returnStatus(true, msg);
            } else {
                msg = "参赛证添加失败";
                return JsonUtil.returnStatus(false, msg);
            }
        }
    }

    @Override
    public boolean isExistLicense(License license) {
        License license1 = session.getMapper(ILicenseDao.class).isExistLicense(license);
        if (license1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public JSONArray getLicense(String competitorId, String cid) {
        License license = session.getMapper(ILicenseDao.class).getLicense(competitorId, cid);
        if(license == null){
            msg = "无此参赛者信息";
            return JsonUtil.returnStatus(false, msg);
        }
        return JSONArray.fromObject(license);
    }

    @Test
    public void testInsertLicense() {
        License license = new License();
        license.setCompetitorId("7");
        license.setName("lulu");
        license.setTeamName("null");
        license.setSchool("广西民族大学");
        license.setCid("1");
        license.setCname("程序设计竞赛");
        license.setPid("1");
        license.setOid("1");
        System.out.println(insertLicense(license));
    }

    @Test
    public void testGetLicenseById() {
        System.out.println(getLicense("1", "2"));
    }
}
