package com.cms.controller;

import com.cms.entity.Place;
import com.cms.service.serviceImpl.PlaceServiceImpl;
import com.cms.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PlaceController")
public class PlaceController extends HttpServlet {

    private PlaceServiceImpl placeService = new PlaceServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();

        if (requestURI.equals("/CompetitionManagementSystem/Place/getPlaceByPid")) {
            String pid = request.getParameter("pid");
            JsonUtil.returnJson(placeService.getPlaceByPid(pid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Place/getPlaceByCid")) {
            String cid = request.getParameter("cid");
            JsonUtil.returnJson(placeService.getPlaceByCid(cid), request, response);
        } else if (requestURI.equals("/CompetitionManagementSystem/Place/insertPlace")) {
            String pid = request.getParameter("cid");
            String school = request.getParameter("school");
            String pname = request.getParameter("pname");
            String pnum = request.getParameter("pnum");
            String cid = request.getParameter("cid");
            String csize = request.getParameter("csize");
            String manager = request.getParameter("manager");
            Place place = new Place(pid, school, pname, pnum, cid, csize, manager);
            JsonUtil.returnJson(placeService.insertPlace(place), request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
