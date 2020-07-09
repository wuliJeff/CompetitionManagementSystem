package com.cms.service;

import com.cms.entity.CompetitionOrder;

public interface CompetitorOrderService {
    /**
     * 对赛事添加赛场秩序册
     *
     * @param newOrder，赛场秩序册对象
     * @return
     */
    public boolean insertNewOrder(CompetitionOrder newOrder);

    /**
     * 判断当前赛事是否存在赛场秩序册
     *
     * @param oid
     * @return
     */
    public boolean isExistOrder(String oid);

    /**
     * 根据对应的oid查询得到赛场秩序册
     *
     * @param oid，赛场秩序册id
     * @return CompetitionOrder对象
     */
    public CompetitionOrder getOrderById(String oid);
}
