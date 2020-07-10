package com.cms.controller;

import com.cms.service.serviceImpl.ScheduleServiceImpl;
import com.cms.util.JsonUtil;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ScheduleController")
public class ScheduleController extends HttpServlet {

    private ScheduleServiceImpl scheduleService = new ScheduleServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        if (requestURI.equals("/CompetitionManagementSystem/Schedule/selectGradeByCompetitorId")) {
            String competitorId = request.getParameter("competitorId");
            JsonUtil.returnJson(scheduleService.selectGradeByCompetitorId(competitorId), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Schedule/selectGradeByCid")) {
            String cid = request.getParameter("cid");
            JsonUtil.returnJson(scheduleService.selectGradeByCid(cid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Schedule/getAllLevelCountByCid")) {
            String cid = request.getParameter("cid");
            JsonUtil.returnJson(scheduleService.getAllLevelCountByCid(cid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Schedule/findSeat")){
            String cid = request.getParameter("cid");
            String competitorId = request.getParameter("competitorId");
            JsonUtil.returnJson(scheduleService.findSeat(cid, competitorId), request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
