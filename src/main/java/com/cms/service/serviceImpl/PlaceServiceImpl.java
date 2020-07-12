package com.cms.service.serviceImpl;

import com.cms.dao.IPlaceDao;
import com.cms.entity.Place;
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
        for (Place place : places) {
            place.setPid(RandomIdFactory.getRandomId());
            if (isExistPlace(place.getSchool(), place.getPname(), place.getPnum(), place.getCid())) {
                continue;
            } else {
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

