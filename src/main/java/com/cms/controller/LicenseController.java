package com.cms.controller;

import com.cms.entity.License;
import com.cms.service.serviceImpl.LicenseServiceImpl;
import com.cms.util.JsonUtil;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LicenseController")
public class LicenseController extends HttpServlet {

    private LicenseServiceImpl licenseService = new LicenseServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        if (requestURI.equals("/CompetitionManagementSystem/License/getLicenseById")) {
            String competitorId = request.getParameter("competitorId");
            JsonUtil.returnJson(licenseService.getLicenseById(competitorId), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/License/insertLicense")) {
            String competitorId = request.getParameter("competitorId");
            String name = request.getParameter("competitorId");
            String teamName =request.getParameter("teamName");
            String school = request.getParameter("school");
            String cid = request.getParameter("cid");
            String cname = request.getParameter("cname");
            String pid = request.getParameter("pid");
            String oid = request.getParameter("oid");
            License license = new License(competitorId, name, teamName, school, cid, cname, pid, oid);
            JsonUtil.returnJson(licenseService.insertLicense(license), request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
