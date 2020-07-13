package com.cms.service.serviceImpl;

import com.cms.dao.IPlaceDao;
import com.cms.entity.License;
import com.cms.entity.Place;
import com.cms.entity.Schedule;
import com.cms.service.PlaceService;
import com.cms.util.JsonUtil;
import com.cms.util.MapperConfig;
import com.cms.util.RandomIdFactory;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PlaceServiceImpl implements PlaceService {

    private String msg = null;
    private SqlSession session;

    public PlaceServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public JSONArray getPlaceByCidAndPid(String cid, String pid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByCidAndPid(cid,pid);
        return JSONArray.fromObject(places);
    }

    @Override
    public Place getPlaceByCAndP(String cid, String pid) {
        Place  places = session.getMapper(IPlaceDao.class).getPlaceByCAndP(cid,pid);
        return places;
    }

    @Override
    public JSONArray getPlaceByPid(String pid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByPid(pid);
        return JSONArray.fromObject(places);
    }

    @Override
    public JSONArray getPlaceByCid(String cid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByCid(cid);
        return JSONArray.fromObject(places);
    }

    @Override
    public JSONArray insertPlace(List<Place> places) {
        LicenseServiceImpl licenseService = new LicenseServiceImpl();
        ScheduleServiceImpl scheduleService = new ScheduleServiceImpl();
        List<License> licenses = licenseService.getLicenseByCid(places.get(0).getCid());
        int licenseSize = licenses.size();
        int i = 0;
        for (Place place : places) {
            place.setPid(RandomIdFactory.getRandomId());
            int j = Integer.parseInt(place.getCsize());
//            for (int k = 1; k < j; ) {
//                k = k + 2;
//                if (i != licenseSize) {
//                    License license = licenses.get(i);
//                    i++;
//                    license.setPid(place.getPid());
//                    licenseService.updateLicense(license);
//                    Schedule schedule = new Schedule(license.getCid(), license.getCompetitorId(), place.getPid(), String.valueOf(j), -1);
//                    scheduleService.insertSchedule(schedule);
//                }
//            }
            if (!isExistPlace(place.getSchool(), place.getPname(), place.getPnum(), place.getCid())) {
                session.getMapper(IPlaceDao.class).insertPlace(place);
            }
        }
        msg = "赛场导入完成";
        return JsonUtil.returnStatus(true, msg);
    }

    @Override
    public boolean isExistPlace(String school, String pname, String pnum, String cid) {
        Place place = session.getMapper(IPlaceDao.class).isExistPlace(school, pname, pnum, cid);
        if (place != null) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testGetGradeForAllLevel() {
        System.out.println(getPlaceByCid("202007101135"));
        System.out.println(getPlaceByPid("202007127665918"));
    }
}

