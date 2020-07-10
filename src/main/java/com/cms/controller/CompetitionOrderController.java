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
        if (requestURI.equals("/CompetitionManagementSystem/CompetitionOrder/getOrderByCid")) {
            String cid = request.getParameter("cid");
            System.out.println(cid);
            JsonUtil.returnJson(competitionOrderService.getOrderByCid(cid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/CompetitionOrder/insertNewOrder")) {
            String cid = request.getParameter("cid");
            String title = request.getParameter("title");
            String detail = request.getParameter("detail");
            CompetitionOrder competitionOrder = new CompetitionOrder(null, cid, title, detail);
            JsonUtil.returnJson(competitionOrderService.insertNewOrder(competitionOrder), request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
