package com.cms.service.serviceimpl;

import com.cms.dao.IHoster;
import com.cms.entity.Hoster;
import com.cms.service.HosterService;
import com.cms.util.MapperConfig;
import com.cms.util.RandomIdFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 陈磊
 */
public class HosterServiceImpl implements HosterService {
    private SqlSession session;
  boolean flag;
    public HosterServiceImpl() {
        session = MapperConfig.getSession();
    }


    @Override
    public Hoster getHoster(String account) {
        Hoster hoster=session.getMapper(IHoster.class).getHoster(account);
        MapperConfig.getSession().commit();
        return hoster;
    }

    @Override
    public Hoster getHosterByName(String name) {
        Hoster hoster=session.getMapper(IHoster.class).getHoster(name);
        MapperConfig.getSession().commit();
        return hoster;
    }

    @Override
    public List<Hoster> getAllHoster() {
        List<Hoster> list =session.getMapper(IHoster.class).getAllHoster();
        MapperConfig.getSession().commit();
        return list;
    }

    @Override
    public boolean addHoster(Hoster hoster) {
        hoster.setAccount(RandomIdFactory.getAccountId());
        flag=session.getMapper(IHoster.class).addHoster(hoster);
        MapperConfig.getSession().commit();
        return flag;
    }

    @Override
    public boolean updateHoster(Hoster hoster) {
        flag=session.getMapper(IHoster.class).updateHoster(hoster);
        return flag;
    }

    @Test
    public void test1() {

        // System.out.println(getCompetition(1));
       Hoster hoster =new Hoster("123456789","陈磊","18507769802","广西民族大学");
        System.out.println(addHoster(hoster));
        // System.out.println(getHoster("202006293489907"));
        //  System.out.println(getAllHoster());
    }
}
