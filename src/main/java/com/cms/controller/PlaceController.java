package com.cms.controller;

import com.cms.entity.Place;
import com.cms.service.serviceImpl.PlaceServiceImpl;
import com.cms.util.JsonUtil;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PlaceController")
public class PlaceController extends HttpServlet {

    private PlaceServiceImpl placeService = new PlaceServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();

        if (requestURI.equals("/CompetitionManagementSystem/Place/getPlaceByPid")) {
            String pid = request.getParameter("pid");
            JsonUtil.returnJson(placeService.getPlaceByPid(pid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Place/getPlaceByCid")) {
            String cid = request.getParameter("cid");
            JsonUtil.returnJson(placeService.getPlaceByCid(cid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Place/insertPlace")) {
            String excelData = request.getParameter("excelData");
            String cid = request.getParameter("cid");
            JSONArray placeJsonArray = JSONArray.fromObject(excelData);
            List<Place> places = new ArrayList<>();
            for (int i=0; i<placeJsonArray.size(); i++) {
                JSONObject placeJsonObject = (JSONObject)placeJsonArray.get(i);
                String pid = placeJsonObject.getString("pid");
                String school = placeJsonObject.getString("school");
                String pname = placeJsonObject.getString("pname");
                String pnum = placeJsonObject.getString("pnum");
                String csize = placeJsonObject.getString("csize");
                String manager = placeJsonObject.getString("manager");
                Place place = new Place(pid, school, pname, pnum, cid, csize, manager);
                places.add(place);
            }
            JsonUtil.returnJson(placeService.insertPlace(places), request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
