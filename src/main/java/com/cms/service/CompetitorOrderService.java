package com.cms.service;

import com.cms.entity.CompetitionOrder;
import net.sf.json.JSONArray;

public interface CompetitorOrderService {
    /**
     * 对赛事添加赛场秩序册
     *
     * @param newOrder ，赛场秩序册对象
     * @return
     */
    public JSONArray insertNewOrder(CompetitionOrder newOrder);

    /**
     * 判断当前赛事是否存在赛场秩序册
     *
     * @param cid
     * @return
     */
    public boolean isExistOrder(String cid);

    /**
     * 根据对应的oid查询得到赛场秩序册
     *
     * @param cid ，赛事id
     * @return CompetitionOrder对象
     */
    public JSONArray getOrderByCid(String cid);
}
