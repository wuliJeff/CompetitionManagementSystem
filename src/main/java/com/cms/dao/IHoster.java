package com.cms.dao;

import com.cms.entity.Hoster;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 陈磊
 */
public interface IHoster {
    /**
     * 获取当前赛事主办方
     *
     * @param account
     * @return 存在则返回赛事，不存在则返回空
     */
    public Hoster getHoster(@Param("account") String account);

    /**
     * 获取当前赛事主办方
     *
     * @param name
     * @return 存在则返回赛事，不存在则返回空
     */
    public Hoster getHosterByName(@Param("name") int name);
    /**
     * 添加赛事主办方
     *
     * @param hoster
     * @return 添加成功则返回true，失败则返回false
     */
    public boolean addHoster(@Param("hoster") Hoster hoster);

    /**
     * 获取所有赛事主办方
     *
     * @return 存在则返回赛事主办方，不存在则返回空
     */
    public List<Hoster> getAllHoster();

    /**
     * 修改赛事主办方信息
     * @param hoster
     * @return 修改成功则返回true，失败则返回false
     */
    public boolean updateHoster(@Param("hoster")Hoster hoster);
}
