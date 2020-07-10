package com.cms.controller;

import com.cms.entity.Place;
import com.cms.service.serviceImpl.PlaceServiceImpl;
import com.cms.util.JsonUtil;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PlaceController")
public class PlaceController extends HttpServlet {

    PlaceServiceImpl placeService = new PlaceServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String data = (String) request.getAttribute("data");
        JSONObject jsb = JSONObject.fromObject(data);
        if (requestURI.equals("/CompetitionManagementSystem/Place/getPlaceByPid")) {
            String pid = null;
            if (jsb.containsKey("pid")) {
                pid = jsb.getString("oid");
                JsonUtil.returnJson(placeService.getPlaceByPid(pid), request, response);
            }
        } else if (requestURI.equals("/CompetitionManagementSystem/Place/getPlaceByCid")) {
            String cid = null;
            if (jsb.containsKey("cid")) {
                cid = jsb.getString("cid");
                JsonUtil.returnJson(placeService.getPlaceByCid(cid), request, response);
            }
        } else if (requestURI.equals("/CompetitionManagementSystem/Place/insertPlace")) {
            String pid = jsb.getString("pid");
            String school = jsb.getString("school");
            String pname = jsb.getString("pname");
            ;
            String pnum = jsb.getString("pnum");
            ;
            String cid = jsb.getString("cid");
            ;
            String csize = jsb.getString("csize");
            ;
            String manager = jsb.getString("manager");
            ;
            Place place = new Place(pid, school, pname, pnum, cid, csize, manager);
            JsonUtil.returnJson(placeService.insertPlace(place), request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
