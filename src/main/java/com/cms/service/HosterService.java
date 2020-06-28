package com.cms.service;

import com.cms.entity.Hoster;

import java.util.List;

/**
 * @author 陈磊
 */
public interface HosterService {
    /**
     * 获取当前主办方
     *
     * @param account：主办方account
     * @return String：返回竞赛
     */
    public Hoster getHoster(String account);

    /**
     * 获取当前主办方
     *
     * @param name：主办方name
     * @return String：返回竞赛
     */
    public Hoster getHosterByName(String name);

    /**
     * 获取全部主办方
     *
     * @return List：返回全部主办方
     */
    public List<Hoster> getAllHoster();

    /**
     * 添加主办方
     *
     * @param hoster：主办方
     * @return Boolean：返回是否成功，成功返回true，失败返回false
     */
    public boolean addHoster(Hoster hoster);

    /**
     * 修改主办方信息
     *
     * @param hoster：主办方
     * @return Boolean：返回是否成功，成功返回true，失败返回false
     */
    public boolean updateHoster(Hoster hoster);


}
