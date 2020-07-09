package com.cms.service.serviceImpl;

import com.cms.dao.ICompetitionOrderDao;
import com.cms.entity.CompetitionOrder;
import com.cms.service.CompetitorOrderService;
import com.cms.util.JsonUtil;
import com.cms.util.MapperConfig;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CompetitionOrderServiceImpl implements CompetitorOrderService {
    private String msg = null;
    private boolean flag = false;
    private SqlSession session;

    public CompetitionOrderServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public JSONArray insertNewOrder(CompetitionOrder newOrder) {
        Boolean flag = false;
        if (isExistOrder(newOrder.getOid())) {
            msg="该竞赛已存在";
            return JsonUtil.returnStatus(flag, msg);
        } else {
            int oid = session.getMapper(ICompetitionOrderDao.class).insertNewOrder(newOrder);
            System.out.println(oid);
            if (oid >= 0) {
                flag=true;
                msg="添加竞赛成功";
                return JsonUtil.returnStatus(flag, msg);
            } else {
                flag=false;
                msg="添加竞赛失败";
                return JsonUtil.returnStatus(flag, msg);
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
    public JSONArray getOrderById(String oid) {
        CompetitionOrder order = session.getMapper(ICompetitionOrderDao.class).getOrderById(oid);
        return JSONArray.fromObject(order);
    }

    @Test
    public void testInsertOrder() {
        CompetitionOrder order = new CompetitionOrder();
        order.setOid("10");
        order.setCid("1");
        order.setTitle("第十二届蓝桥杯大赛");
        order.setDetail("软件与信息安全学院");
        System.out.println(insertNewOrder(order));

    }

    @Test
    public void testGetOrderByid() {

        System.out.println( getOrderById("1"));
    }
}
