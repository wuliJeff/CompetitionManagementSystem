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
    public int selectGradeA() {
        return session.getMapper(IScheduleDao.class).selectGradeA();
    }

    @Override
    public int selectGradeB() {
        return session.getMapper(IScheduleDao.class).selectGradeB();
    }

    @Override
    public int selectGradeC() {
        return session.getMapper(IScheduleDao.class).selectGradeC();
    }

    @Override
    public int selectGradeD() {
        return session.getMapper(IScheduleDao.class).selectGradeD();
    }

    @Override
    public JSONArray getAllLevelCount() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", selectGradeA());
        map.put("B", selectGradeB());
        map.put("C", selectGradeC());
        map.put("D", selectGradeD());
        return JSONArray.fromObject(map);
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
        System.out.println(selectGradeA());
        System.out.println(selectGradeB());
        System.out.println(selectGradeC());
        System.out.println(selectGradeD());
        System.out.println(getAllLevelCount());
    }
}
