package com.cms.service;

import com.cms.entity.UserInfo;

public interface UserService {

    /**
     * 查找账户是否存在
     *
     * @param account：账号
     * @return String：返回账号
     */
    String isExistAccount(String account);

    /**
     * // 验证账号密码是否正确
     *
     * @param account
     * @param password
     * @return
     */
    UserInfo checkPwd(String account, String password);

    /**
     * 注册账号
     *
     * @param account：账号
     * @param password：密码
     * @param tel：电话号码
     * @return :插入成功后返回非null的正值，插入失败返回null
     */
    int register(String account, String password, String tel);

    /**
     * 查询电话号码是否正确
     *
     * @param account
     * @param tel
     * @return
     */
    String checkTel(String account, String tel);

    /**
     * 修改密码
     *
     * @param account
     * @param password
     * @return
     */
    int resetPwd(String account, String password);

}
