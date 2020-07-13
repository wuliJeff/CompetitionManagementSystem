package com.cms.service.serviceImpl;

import com.cms.dao.ILicenseDao;
import com.cms.entity.License;
import com.cms.service.LicenseService;
import com.cms.util.JsonUtil;
import com.cms.util.MapperConfig;
import com.cms.util.RandomIdFactory;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
        if (isExistLicense(license.getCompetitorId(),license.getCid())) {
            msg = "参赛证已存在";
            return JsonUtil.returnStatus(false, msg);
        } else {
           license.setLicenseId(RandomIdFactory.getRandomId());
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
    public boolean isExistLicense(String competitorId, String cid) {
       License  license = session.getMapper(ILicenseDao.class).isExistLicense(competitorId,cid);
        if (license != null) {
            return true;
        }
        return false;
    }

    @Override
    public JSONArray getLicense(String competitorId, String cid) {
        List<License> license = session.getMapper(ILicenseDao.class).getLicense(competitorId, cid);
        if(license.size() == 0){
            msg = "无此参赛证信息";
            return JsonUtil.returnStatus(false, msg);
        }else{
            msg="查询成功";
            return JSONArray.fromObject(license);
        }
    }

    @Override
    public JSONArray updateLicense(License l) {
        if (session.getMapper(ILicenseDao.class).UpdateLicense(l)>0){
            msg = "更新成功";
        }
        return JsonUtil.returnStatus(false, msg);
    }

    @Override
    public List<License> getLicenseByCid(String cid) {
        List<License> license = session.getMapper(ILicenseDao.class).getLicenseByCid(cid);
        return license;
    }

    @Test
    public void testInsertLicense() {
//        License license = new License();
//        license.setCompetitorId("7");
//        license.setName("lulu");
//        license.setTeamName("null");
//        license.setCid("202007101135");
//        license.setCname("程序设计竞赛");
//        license.setPid("1");

//        System.out.println(getLicense("","202007101262"));
        System.out.println(getLicense("202007102028","202007101135"));
//        System.out.println(getLicense("202007102028",""));
    }

    @Test
    public void testGetLicenseById() {
        System.out.println(getLicense("1", "2"));
    }
}
