package com.cms.service.serviceimpl;

import com.cms.dao.IUserDao;
import com.cms.entity.UserInfo;
import com.cms.service.UserService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;

public class UserServiceImpl implements UserService {

    private SqlSession session;

    public UserServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public String isExistAccount(String account) {
        if (account == null || account.trim().equals("")) {
            return null;
        } else {
            // 判断是否存在该用户
            String s = session.getMapper(IUserDao.class).isExistAccount(account);
            session.commit();
            return s;
        }
    }

    @Override
    public UserInfo checkPwd(String account, String password) {
        if (account == null || account.trim().equals("")
                || password == null || password.trim().equals("")) {
            return null;
        } else {
            //检查密码是否正确
            UserInfo userInfo = session.getMapper(IUserDao.class).checkPwd(account, password);
            session.commit();
            return userInfo;
        }
    }

    @Override
    public int register(String account, String password, String tel) {
        int registerAccountOK = session.getMapper(IUserDao.class).register(account, password, tel);
        session.commit();
        return registerAccountOK;
    }

    @Override
    public String checkTel(String account, String tel) {
        if (account == null || account.trim().equals("")
                || tel == null || tel.trim().equals("")) {
            return null;
        } else {
            String s = session.getMapper(IUserDao.class).checkTel(account, tel);
            session.commit();
            return s;
        }
    }

    @Override
    public int resetPwd(String account, String password) {
        int resetPwdOK = session.getMapper(IUserDao.class).resetPwd(account, password);
        session.commit();
        return resetPwdOK;
    }
}