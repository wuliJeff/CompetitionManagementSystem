package com.cms.servlet.CompetitionServlet;

import com.cms.service.CompetitionService;
import com.cms.service.serviceimpl.CompetitionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 陈磊
 */
@WebServlet(name = "GetCompetitionServlet")
public class GetCompetitionServlet extends HttpServlet {

    private CompetitionService competitionService=new CompetitionServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int cid=Integer.parseInt(request.getParameter("cid"));
        if (cid>0){
            if (competitionService.getCompetition(cid)==null){
                request.getSession().setAttribute("msg", "查无此竞赛");
            }

        }else {
            competitionService.getAllCompetition();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
