package com.cms.controller;

import com.cms.entity.CompetitionOrder;
import com.cms.service.serviceImpl.CompetitionOrderServiceImpl;
import com.cms.util.JsonUtil;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CompetitionOrderController extends HttpServlet {

    private CompetitionOrderServiceImpl competitionOrderService = new CompetitionOrderServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String data = (String) request.getAttribute("data");
        JSONObject jsb = JSONObject.fromObject(data);
        if (requestURI.equals("/CompetitionManagementSystem/CompetitionOrder/getOrderById")) {
            String oid = null;
            String cid = null;
            if (jsb.containsKey("oid")) {
                oid = jsb.getString("oid");
                JsonUtil.returnJson(competitionOrderService.getOrderById(oid), request, response);
            }
        } else if (requestURI.equals("/CompetitionManagementSystem/CompetitionOrder/insertNewOrder")) {
            String oid = jsb.getString("oid");
            String cid = jsb.getString("cid");
            String title = jsb.getString("title");
            String detail = jsb.getString("detail");
            CompetitionOrder competitionOrder = new CompetitionOrder(oid, cid, title, detail);
            JsonUtil.returnJson(competitionOrderService.insertNewOrder(competitionOrder), request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
