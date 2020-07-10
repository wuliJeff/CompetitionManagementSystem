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

    ScheduleServiceImpl scheduleService = new ScheduleServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String data = (String) request.getAttribute("data");
        JSONObject jsb = JSONObject.fromObject(data);
        if (requestURI.equals("/CompetitionManagementSystem/Schedule/selectGradeByCompetitorId")) {
            String competitorId = null;
            if (jsb.containsKey("competitorId")) {
                competitorId = jsb.getString("competitorId");
                JsonUtil.returnJson(scheduleService.selectGradeByCompetitorId(competitorId), request, response);
            }
        } else if (requestURI.equals("/CompetitionManagementSystem/Schedule/selectGradeByCid")) {
            String cid = null;
            if (jsb.containsKey("cid")) {
                cid = jsb.getString("cid");
                JsonUtil.returnJson(scheduleService.selectGradeByCid(cid), request, response);
            }
        } else if (requestURI.equals("/CompetitionManagementSystem/Schedule/getAllLevelCount")) {
            JsonUtil.returnJson(scheduleService.getAllLevelCount(), request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
