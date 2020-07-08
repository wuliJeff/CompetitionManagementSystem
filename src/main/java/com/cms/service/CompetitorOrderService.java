package com.cms.service;

import com.cms.entity.CompetitionOrder;

public interface CompetitorOrderService {
    /**
     * 对赛事添加赛场秩序册
     * @param newOrder，赛场秩序册对象
     * @return
     */
    public boolean insertNewOrder(CompetitionOrder newOrder);

    public CompetitionOrder getOrderById(String oid);
}
