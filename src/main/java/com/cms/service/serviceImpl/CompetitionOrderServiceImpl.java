package com.cms.service.serviceImpl;

import com.cms.dao.ICompetitionOrderDao;
import com.cms.entity.CompetitionOrder;
import com.cms.service.CompetitorOrderService;
import com.cms.util.JsonUtil;
import com.cms.util.MapperConfig;
import com.cms.util.RandomIdFactory;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CompetitionOrderServiceImpl implements CompetitorOrderService {

    private String msg = null;
    private SqlSession session;

    public CompetitionOrderServiceImpl() {
        session = MapperConfig.getSession();
    }

    @Override
    public JSONArray insertNewOrder(CompetitionOrder newOrder) {
        newOrder.setOid(RandomIdFactory.getRandomId());
        if (isExistOrder(newOrder.getCid())) {
            msg = "赛场秩序册已存在";
            return JsonUtil.returnStatus(false, msg);
        } else {
            int count = session.getMapper(ICompetitionOrderDao.class).insertNewOrder(newOrder);
            if (count >= 0) {
                msg = "添加赛场秩序册成功";
                return JsonUtil.returnStatus(true, msg);
            } else {
                msg = "添加赛场秩序册失败";
                return JsonUtil.returnStatus(false, msg);
            }
        }
    }

    @Override
    public boolean isExistOrder(String cid) {
        CompetitionOrder order = session.getMapper(ICompetitionOrderDao.class).getOrderByCid(cid);
        if (order != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public JSONArray getOrderByCid(String cid) {
        CompetitionOrder order = session.getMapper(ICompetitionOrderDao.class).getOrderByCid(cid);
        if (order != null) {
            return JSONArray.fromObject(order);
        }else {
            msg = "该赛事暂无赛场秩序册";
            return JsonUtil.returnStatus(false, msg);
        }
    }

    @Test
    public void testInsertOrder() {
        CompetitionOrder order = new CompetitionOrder();
        order.setOid(RandomIdFactory.getRandomId());
        order.setCid("1");
        order.setTitle("第十二届蓝桥杯大赛");
        order.setDetail("软件与信息安全学院");
        System.out.println(insertNewOrder(order));
    }

    @Test
    public void testGetOrderByCid() {
        System.out.println(getOrderByCid("202007101135"));
    }
}
