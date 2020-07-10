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
        String data = (String) request.getAttribute("data");
        JSONObject jsb = JSONObject.fromObject(data);
        if (requestURI.equals("/CompetitionManagementSystem/License/getLicenseById")) {
            String competitorId = null;
            if (jsb.containsKey("competitorId")) {
                competitorId = jsb.getString("oid");
                JsonUtil.returnJson(licenseService.getLicenseById(competitorId), request, response);
            }
        } else if (requestURI.equals("/CompetitionManagementSystem/License/insertLicense")) {
            String competitorId = jsb.getString("competitorId");
            String name = jsb.getString("name");
            String teamName = jsb.getString("teamName");
            String school = jsb.getString("school");
            String cid = jsb.getString("cid");
            String cname = jsb.getString("cname");
            String pid = jsb.getString("pid");
            String oid = jsb.getString("oid");
            License license = new License(competitorId, name, teamName, school, cid, cname, pid, oid);
            JsonUtil.returnJson(licenseService.insertLicense(license), request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}