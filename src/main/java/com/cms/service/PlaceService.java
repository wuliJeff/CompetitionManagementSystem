package com.cms.service;

import com.cms.entity.Place;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlaceService {

    /**
     * 根据赛场id查询所有赛事的赛场安排
     * @param pid
     * @return
     */
    public List<Place> getPlaceByPid(int pid);

    /**
     * 根据赛事id查询所有赛场
     * @param cid
     * @return
     */
    public List<Place> getPlaceByCid(int cid);

    /**
     * 添加赛场安排
     * @param place，赛场对象
     * @return
     */
    public boolean insertPlace(@Param("place") Place place);
}
