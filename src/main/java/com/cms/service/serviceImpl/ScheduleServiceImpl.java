package com.cms.service.serviceImpl;

import com.cms.dao.IScheduleDao;
import com.cms.entity.Schedule;
import com.cms.service.ScheduleService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {

    private SqlSession session;

    public ScheduleServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public List<Schedule> selectGradeByCompetitorId(String competitorId) {
        List<Schedule> schedules = new ArrayList<Schedule>();
        schedules = session.getMapper(IScheduleDao.class).selectGradeByCompetitorId(competitorId);
        return schedules;
    }

    @Override
    public List<Schedule> selectGradeByCid(String cid) {
        List<Schedule> schedules = new ArrayList<Schedule>();
        schedules = session.getMapper(IScheduleDao.class).selectGradeByCid(cid);
        return schedules;
    }

    @Override
    public int selectGradeA() {
        int sum = 0;
        sum = session.getMapper(IScheduleDao.class).selectGradeA();
        return sum;
    }
    @Override
    public int selectGradeB() {
        int sum = 0;
        sum = session.getMapper(IScheduleDao.class).selectGradeB();
        return sum;
    }
    @Override
    public int selectGradeC() {
        int sum = 0;
        sum = session.getMapper(IScheduleDao.class).selectGradeC();
        return sum;
    }
    @Override
    public int selectGradeD() {
        int sum = 0;
        sum = session.getMapper(IScheduleDao.class).selectGradeD();
        return sum;
    }
    @Test
    public void testSelectGradeByCompetitorId(){
        List<Schedule> schedules = selectGradeByCompetitorId("1");
        if (schedules != null) {
            for(Schedule schedule : schedules){
                System.out.println(schedule.toString());
            }
        }else{
            System.out.println("null");
        }
    }
    @Test
    public void testSelectGradeByCid(){
        List<Schedule> schedules = selectGradeByCid("1");
        if (schedules != null) {
            for(Schedule schedule : schedules){
                System.out.println(schedule.toString());
            }
        }else{
            System.out.println("null");
        }
    }
}
