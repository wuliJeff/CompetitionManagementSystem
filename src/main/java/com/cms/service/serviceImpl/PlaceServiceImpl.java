package com.cms.service.serviceImpl;

import com.cms.dao.IPlaceDao;
import com.cms.entity.Place;
import com.cms.service.PlaceService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlaceServiceImpl implements PlaceService {

    private SqlSession session;

    public PlaceServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public List<Place> getPlaceByPid(String pid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByPid(pid);
        return places;
    }

    @Override
    public List<Place> getPlaceByCid(String cid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByCid(cid);
        return places;
    }

    @Override
    public boolean insertPlace(Place place) {
        if (isUsedPlace(place.getPid(), place.getCid())) {
            return false;
        } else {
            int pid = session.getMapper(IPlaceDao.class).insertPlace(place);
            if (pid >= 0) {
                return true;
            } else {
                return false;
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
        List<Place> places = new ArrayList<Place>();
        //places = getPlaceByPid("1");
        places = getPlaceByCid("1");
        if (places != null) {
            for (Place place : places) {
                System.out.println(place.toString());
            }
        } else {
            System.out.println("null");
        }
    }

    @Test
    public void testInsertPlace() {
        Place place = new Place();
        place.setPid("1");
        place.setCid("2");
        boolean isInsertOK = insertPlace(place);
        System.out.println(isInsertOK);
    }
}
