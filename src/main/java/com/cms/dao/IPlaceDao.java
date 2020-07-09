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
     * 判断该赛场是否被安排
     *
     * @param pid，赛场号
     * @param cid，赛事编号
     * @return 返回Place对象
     */
    public Place isUsedPlace(@Param("pid") String pid, @Param("cid") String cid);
}
