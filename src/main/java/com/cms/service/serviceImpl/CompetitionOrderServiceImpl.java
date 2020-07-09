package com.cms.service.serviceImpl;

import com.cms.dao.ICompetitionOrderDao;
import com.cms.entity.CompetitionOrder;
import com.cms.service.CompetitorOrderService;
import com.cms.util.MapperConfig;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CompetitionOrderServiceImpl implements CompetitorOrderService {

    private SqlSession session;

    public CompetitionOrderServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public boolean insertNewOrder(CompetitionOrder newOrder) {
        if (isExistOrder(newOrder.getOid())) {
            return false;
        } else {
            int oid = session.getMapper(ICompetitionOrderDao.class).insertNewOrder(newOrder);
            System.out.println(oid);
            if (oid >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean isExistOrder(String oid) {
        CompetitionOrder order = session.getMapper(ICompetitionOrderDao.class).getOrderById(oid);
        if (order != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CompetitionOrder getOrderById(String oid) {
        CompetitionOrder order = session.getMapper(ICompetitionOrderDao.class).getOrderById(oid);
        return order;
    }

    @Test
    public void testInsertOrder() {
        CompetitionOrder order = new CompetitionOrder();
        order.setOid("10");
        order.setCid("1");
        order.setTitle("第十二届蓝桥杯大赛");
        order.setDetail("软件与信息安全学院");
        boolean isInsertOK = insertNewOrder(order);
        System.out.println(isInsertOK);
    }

    @Test
    public void testGetOrderByid() {
        CompetitionOrder order = getOrderById("1");
        System.out.println(order.toString());
    }
}