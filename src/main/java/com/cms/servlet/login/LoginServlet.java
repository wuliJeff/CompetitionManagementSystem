package com.cms.servlet.login;

import com.cms.entity.UserInfo;
import com.cms.service.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        UserServiceImpl service = new UserServiceImpl();
        String existAccount = service.isExistAccount(account);

        if (existAccount == null || existAccount.equals("")) {
            request.getSession().setAttribute("msg", "errorAccount");
        } else {
            UserInfo checkPwdOK = service.checkPwd(account, password);
            if (checkPwdOK == null) {
                request.getSession().setAttribute("msg", "errorPwd");
            } else {
                //查询成功，可以登录,把账号放到session中
                request.getSession().setAttribute("msg", "loginOK");
                request.getSession().setAttribute("account", account);
            }
        }
        // 跳转至验证界面
        response.sendRedirect("pages/loginValidate.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
