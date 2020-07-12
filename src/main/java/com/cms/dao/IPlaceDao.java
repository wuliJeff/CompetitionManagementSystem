package com.cms.dao;

import com.cms.entity.Place;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPlaceDao {

    /**
     * 根据赛场id查询所有赛事的赛场安排
     *
     * @param pid
     * @return
     */
    public List<Place> getPlaceByPid(@Param("pid") String pid);

    /**
     * 根据赛事id查询所有赛场
     *
     * @param cid
     * @return
     */
    public List<Place> getPlaceByCid(@Param("cid") String cid);

    /**
     * 添加赛场安排
     *
     * @param place，赛场对象
     * @return
     */
    public int insertPlace(@Param("place") Place place);

    /**
     * 判断赛场是否已存在
     * @param school
     * @param pname
     * @param pnum
     * @param cid
     * @return
     */
    public Place isExistPlace(@Param("school") String school, @Param("pname") String pname, @Param("pnum") String pnum,@Param("cid") String cid);
}
