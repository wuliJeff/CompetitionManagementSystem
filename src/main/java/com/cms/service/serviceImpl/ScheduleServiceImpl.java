package com.cms.service.serviceImpl;

import com.cms.dao.IScheduleDao;
import com.cms.service.ScheduleService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ScheduleServiceImpl implements ScheduleService {

    private SqlSession session;

    public ScheduleServiceImpl() {
        session = MapperConfig.getSession();
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
    public void test1(){
        System.out.println(selectGradeB());
    }
}
