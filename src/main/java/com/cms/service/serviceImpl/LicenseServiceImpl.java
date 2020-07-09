package com.cms.service.serviceImpl;

import com.cms.dao.ILicenseDao;
import com.cms.entity.License;
import com.cms.service.LicenseService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class LicenseServiceImpl implements LicenseService {

    private SqlSession session;

    public LicenseServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public boolean insertLicense(License license) {
        /**
         * 存在参赛证则不重复插入
         */
        if (isExistLicense(license)) {
            return false;
        } else {
            int competitorId = session.getMapper(ILicenseDao.class).insertLicense(license);
            if (competitorId >= 0) {
                return true;
            } else {
                return false;
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
    public License getLicenseById(String competitorId) {
        License license = session.getMapper(ILicenseDao.class).getLicenseById(competitorId);
        return license;
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
        boolean isInsertOK = insertLicense(license);
        System.out.println(isInsertOK);
    }

    @Test
    public void testGetLicenseById() {
        License license = getLicenseById("1");
        if (license != null) {
            System.out.println(license.toString());
        } else {
            System.out.println("null");
        }
    }
}
