package com.cms.dao;

import com.cms.entity.CompetitionOrder;
import org.apache.ibatis.annotations.Param;

public interface ICompetitionOrderDao {
    /**
     * 对赛事添加赛场秩序册
     *
     * @param newOrder，赛场秩序册对象
     * @return 插入成功返回大于等于0的数
     */
    public int insertNewOrder(@Param("newOrder") CompetitionOrder newOrder);

    /**
     * 根据对应的cid查询得到赛场秩序册
     *
     * @param cid，赛事id
     * @return CompetitionOrder对象
     */
    public CompetitionOrder getOrderByCid(@Param("cid") String cid);
}
