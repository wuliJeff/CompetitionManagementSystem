package com.cms.service.serviceImpl;

import com.cms.dao.IScheduleDao;
import com.cms.entity.Schedule;
import com.cms.service.ScheduleService;
import com.cms.util.MapperConfig;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class ScheduleServiceImpl implements ScheduleService {

    private SqlSession session;

    public ScheduleServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public JSONArray selectGradeByCompetitorId(String competitorId) {
        List<Schedule> schedules = session.getMapper(IScheduleDao.class).selectGradeByCompetitorId(competitorId);
        return JSONArray.fromObject(schedules);
    }

    @Override
    public JSONArray selectGradeByCid(String cid) {
        List<Schedule> schedules = session.getMapper(IScheduleDao.class).selectGradeByCid(cid);
        return JSONArray.fromObject(schedules);
    }

    @Override
    public int selectGradeAByCid(String cid) {
        return session.getMapper(IScheduleDao.class).selectGradeAByCid(cid);
    }

    @Override
    public int selectGradeBByCid(String cid) {
        return session.getMapper(IScheduleDao.class).selectGradeBByCid(cid);
    }

    @Override
    public int selectGradeCByCid(String cid) {
        return session.getMapper(IScheduleDao.class).selectGradeCByCid(cid);
    }

    @Override
    public int selectGradeDByCid(String cid) {
        return session.getMapper(IScheduleDao.class).selectGradeDByCid(cid);
    }

    @Override
    public JSONArray getAllLevelCountByCid(String cid) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", selectGradeAByCid(cid));
        map.put("B", selectGradeBByCid(cid));
        map.put("C", selectGradeCByCid(cid));
        map.put("D", selectGradeDByCid(cid));
        return JSONArray.fromObject(map);
    }

    @Override
    public JSONArray findSeat(String cid, String competitorId) {
        String seat = session.getMapper(IScheduleDao.class).findSeat(cid, competitorId);
        Map<String, String> map = new HashMap<>();
        map.put("seat", seat);
        return JSONArray.fromObject(map);
    }

    @Test
    public void testFindSeat() {
        System.out.println(findSeat("1", "1"));
    }

    @Test
    public void testSelectGradeByCompetitorId() {
        System.out.println(selectGradeByCompetitorId("1"));
    }

    @Test
    public void testSelectGradeByCid() {
        System.out.println(selectGradeByCid("1"));
    }

    @Test
    public void testGetGradeForAllLevel() {
        String cid = "1";
        System.out.println(selectGradeAByCid(cid));
        System.out.println(selectGradeBByCid(cid));
        System.out.println(selectGradeCByCid(cid));
        System.out.println(selectGradeDByCid(cid));
        System.out.println(getAllLevelCountByCid(cid));
    }
}