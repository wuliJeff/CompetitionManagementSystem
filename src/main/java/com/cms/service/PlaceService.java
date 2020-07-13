package com.cms.service;

import com.cms.entity.Place;
import net.sf.json.JSONArray;

import java.util.List;

public interface PlaceService {

    public JSONArray getPlaceByCidAndPid(String cid, String pid);

    public Place getPlaceByCAndP(String cid, String pid);

    /**
     * 根据赛场id查询所有赛事的赛场安排
     *
     * @param pid
     * @return
     */
    public JSONArray getPlaceByPid(String pid);

    /**
     * 根据赛事id查询所有赛场
     *
     * @param cid
     * @return
     */
    public JSONArray getPlaceByCid(String cid);

    /**
     * 添加赛场安排
     *
     * @param place ，赛场对象
     * @return
     */
    public JSONArray insertPlace(List<Place> place);

    /**
     * 判断赛场是否存在
     *
     * @param school
     * @param pname
     * @param pnum
     * @param cid
     * @return
     */
    public boolean isExistPlace(String school, String pname, String pnum, String cid);
}
