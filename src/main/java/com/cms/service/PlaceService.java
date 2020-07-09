package com.cms.service;

import com.cms.entity.Place;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlaceService {

    /**
     * 根据赛场id查询所有赛事的赛场安排
     *
     * @param pid
     * @return
     */
    public List<Place> getPlaceByPid(String pid);

    /**
     * 根据赛事id查询所有赛场
     *
     * @param cid
     * @return
     */
    public List<Place> getPlaceByCid(String cid);

    /**
     * 添加赛场安排
     *
     * @param place，赛场对象
     * @return
     */
    public boolean insertPlace(Place place);

    /**
     * 判断该赛场是否被安排
     *
     * @param pid，赛场号
     * @param cid，赛事编号
     * @return
     */
    public boolean isUsedPlace(String pid, String cid);
}
