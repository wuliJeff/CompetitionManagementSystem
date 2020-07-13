package com.cms.controller;

import com.cms.entity.Information;
import com.cms.entity.License;
import com.cms.entity.Place;
import com.cms.entity.Schedule;
import com.cms.service.serviceImpl.LicenseServiceImpl;
import com.cms.service.serviceImpl.PlaceServiceImpl;
import com.cms.service.serviceImpl.ScheduleServiceImpl;
import com.cms.util.JsonUtil;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author thrity
 */
@WebServlet(name = "LicenseController")
public class LicenseController extends HttpServlet {

    private LicenseServiceImpl licenseService = new LicenseServiceImpl();
    private PlaceServiceImpl placeService = new PlaceServiceImpl();
    private ScheduleServiceImpl scheduleService = new ScheduleServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        if (requestURI.equals("/CompetitionManagementSystem/License/getLicense")) {
            String competitorId = request.getParameter("competitorId");
            String cid = request.getParameter("cid");
            JsonUtil.returnJson(licenseService.getLicense(competitorId, cid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/License/insertLicense")) {
            String competitorId = request.getParameter("competitorId");
            String name = request.getParameter("name");
            String teamName = request.getParameter("teamName");
            String cid = request.getParameter("cid");
            String cname = request.getParameter("cname");
            String pid = request.getParameter("pid");
            License license = new License(competitorId, name, teamName, cid, cname, pid);
            JsonUtil.returnJson(licenseService.insertLicense(license), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/License/getInformation")) {
            String cid = request.getParameter("cid");
            List<Information> informationList = new ArrayList<>();
            List<License> licenseList = new ArrayList<>();
            Place place = null;
            Schedule schedules = null;
            licenseList = licenseService.getLicenseByCC("", cid);
            System.out.println(licenseList);
            if (licenseList.size() != 0) {
                for (License license : licenseList) {
                    if (license.getPid()==null) {
                        JsonUtil.returnJson(JsonUtil.returnStatus(false, "暂未分配座位"), request,response);
                    }
                        place = placeService.getPlaceByCAndP(cid, license.getPid());
                        schedules = scheduleService.getSchedule(cid, license.getCompetitorId());
                        Information information = new Information(license.getLicenseId(), license.getCompetitorId(),
                                cid, place.getPid(), license.getName(), license.getTeamName(), license.getCname(),
                                place.getPname(), place.getPnum(), place.getManager(), schedules.getSeat(),
                                schedules.getGrade());
                        informationList.add(information);
                    }
                }
            JsonUtil.returnJson(JSONArray.fromObject(informationList), request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
