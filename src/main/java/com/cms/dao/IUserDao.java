package com.cms.dao;

import com.cms.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {

    /**
     * 判断是否存在当前账号
     *
     * @param account
     * @return 存在则返回账号，不存在则返回空值
     */
    String isExistAccount(@Param("account") String account);

    /**
     * 判断是否用户密码是否正确
     *
     * @param account，账户
     * @param password，密码
     */
    /**
     * @param account
     * @param password
     * @return
     */
    UserInfo checkPwd(@Param("account") String account, @Param("password") String password);

    /**
     * 注册用户
     *
     * @param account
     * @param password
     */
    int register(@Param("account") String account, @Param("password") String password, @Param("tel") String tel);

    /**
     * 查询电话号码是否正确
     *
     * @param account
     * @param tel
     * @return
     */
    String checkTel(@Param("account") String account, @Param("tel") String tel);

    /**
     * 修改密码
     *
     * @param account
     * @param password
     * @return
     */
    int resetPwd(@Param("account") String account, @Param("password") String password);
}
