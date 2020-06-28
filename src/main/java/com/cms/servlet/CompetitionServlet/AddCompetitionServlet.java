package com.cms.servlet.CompetitionServlet;

import com.cms.entity.Competition;
import com.cms.service.CompetitionService;
import com.cms.service.serviceimpl.CompetitionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddCompetitionServlet")
public class AddCompetitionServlet extends HttpServlet {
    private CompetitionService competitionService=new CompetitionServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String cname= request.getParameter("cname");
        String hostName=request.getParameter("hostName");
        String school= request.getParameter("school");
        String type=request.getParameter("type");
        int cnum=Integer.parseInt(request.getParameter("cnum"));
        int gunm=Integer.parseInt(request.getParameter("gunm"));
        String startCompetition= request.getParameter("startCompetition");
        String endCompetition=request.getParameter("endCompetition");
        String enrollStartTime= request.getParameter("enrollStartTime");
        String enrollEndTime=request.getParameter("enrollEndTime");
        Competition competition=new Competition(cname,hostName,school,type,cnum,gunm,startCompetition,endCompetition,enrollStartTime,enrollEndTime);
        if (competitionService.addCompetition(competition)) {
            request.getSession().setAttribute("msg", "添加竞赛成功");
        }else{
            request.getSession().setAttribute("msg", "添加竞赛失败");
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
