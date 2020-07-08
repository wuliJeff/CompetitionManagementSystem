package com.cms.dao;

import com.cms.entity.CompetitionOrder;
import org.apache.ibatis.annotations.Param;

public interface ICompetitionOrderDao {
    /**
     * 对赛事添加赛场秩序册
     * @param newOrder，赛场秩序册对象
     * @return
     */
    public int insertNewOrder(@Param("newOrder")CompetitionOrder newOrder);

    /**
     * 根据对应的oid查询得到赛场秩序册
     * @param oid，赛场秩序册id
     * @return CompetitionOrder对象
     */
    public CompetitionOrder getOrderById(@Param("oid")String oid);
}
