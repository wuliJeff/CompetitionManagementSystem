package com.cms.service.serviceImpl;

import com.cms.dao.IPlaceDao;
import com.cms.entity.Place;
import com.cms.service.PlaceService;
import com.cms.util.JsonUtil;
import com.cms.util.MapperConfig;
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
    public JSONArray insertPlace(Place place) {
        if (isUsedPlace(place.getPid(), place.getCid())) {
            msg = "赛场已被安排";
            return JsonUtil.returnStatus(false, msg);
        } else {
            int pid = session.getMapper(IPlaceDao.class).insertPlace(place);
            if (pid >= 0) {
                msg = "赛场安排成功";
                return JsonUtil.returnStatus(true, msg);
            } else {
                msg = "赛场安排失败";
                return JsonUtil.returnStatus(false, msg);
            }
        }
    }

    @Override
    public boolean isUsedPlace(String pid, String cid) {
        Place place = session.getMapper(IPlaceDao.class).isUsedPlace(pid, cid);
        if (place != null) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testGetPalce() {
        System.out.println(getPlaceByPid("1"));
        System.out.println(getPlaceByCid("1"));
    }

    @Test
    public void testInsertPlace() {
        Place place = new Place();
        place.setPid("1");
        place.setCid("2");
        System.out.println(insertPlace(place));
    }
}
