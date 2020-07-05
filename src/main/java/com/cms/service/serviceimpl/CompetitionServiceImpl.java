package com.cms.service.serviceimpl;

import com.cms.dao.ICompetitionDao;
import com.cms.entity.Competition;
import com.cms.service.CompetitionService;
import com.cms.service.HosterService;
import com.cms.service.UserService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
/**
 * @author 陈磊
 */
public class CompetitionServiceImpl implements CompetitionService {
    private boolean flag = false;
    private UserService us = new UserServiceImpl();
    private HosterService hs=new HosterServiceImpl();
    private SqlSession session;

    public CompetitionServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public Competition getCompetition(int cid) {
        Competition competition=session.getMapper(ICompetitionDao.class).getCompetition(cid);
        MapperConfig.getSession().commit();
        return competition;
    }

    @Override
    public List<Competition> getAllCompetition() {
        List<Competition> list = session.getMapper(ICompetitionDao.class).getAllCompetition();
        return list;
    }

    @Override
    public boolean addCompetition(Competition competition) {

        boolean flag = session.getMapper(ICompetitionDao.class).addCompetition(competition);
        return flag;
    }

    @Override
    public boolean updateCompetition(Competition competition) {
        boolean flag = session.getMapper(ICompetitionDao.class).updateCompetition(competition);
        return flag;
    }

    @Test
    public void test1() {
      Competition competition=new Competition("英语四级","陈磊","广西民族大学","团体赛",500,5,"2020年6月30日","2020年6月31日","2020年6月30日","2020年6月31日");
       // System.out.println(getCompetition(1));

        System.out.println( addCompetition(competition));
        System.out.println(getAllCompetition());
    }
}
