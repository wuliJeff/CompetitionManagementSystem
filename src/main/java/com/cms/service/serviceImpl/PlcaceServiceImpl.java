package com.cms.service.serviceImpl;

import com.cms.dao.IPlaceDao;
import com.cms.entity.Place;
import com.cms.service.PlaceService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlcaceServiceImpl implements PlaceService {

    private SqlSession session;

    public PlcaceServiceImpl() {
        session = MapperConfig.getSession();
    }
    @Override
    public List<Place> getPlaceByPid(int pid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByPid(pid);
        return places;
    }

    @Override
    public List<Place> getPlaceByCid(int cid) {
        List<Place> places = session.getMapper(IPlaceDao.class).getPlaceByCid(cid);
        return places;
    }

    @Override
    public boolean insertPlace(Place place) {
        int pid = session.getMapper(IPlaceDao.class).insertPlace(place);
        if (pid>=0){
            return true;
        }else {
            return false;
        }
    }

    @Test
    public void testGetPalce() {
        List<Place> places = new ArrayList<Place>();
        places = getPlaceByPid(1);
        if (places != null) {
            for (Place place : places){
                System.out.println(place.toString());
            }
        } else {
            System.out.println("null");
        }
    }

    @Test
    public void testInsertPlace(){
        Place place = new Place();
        place.setPid(1);
        boolean isInsertOK = insertPlace(place);
        System.out.println(isInsertOK);
    }
}
