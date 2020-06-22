package com.cms.servlet.login;

import com.cms.entity.UserInfo;
import com.cms.service.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String tel = request.getParameter("tel");
        UserServiceImpl service = new UserServiceImpl();
        String existAccount = service.isExistAccount(account);

        if (existAccount == null) {
            int registerAccount = service.register(account, password, tel);
            if (registerAccount >= 0) { // 注册成功
                request.getSession().setAttribute("msg", "registerOK");
            } else { // 无效注册信息，无法执行insert触发
                request.getSession().setAttribute("msg", "invalidInfo");
            }
        } else { // 存在该账号
            request.getSession().setAttribute("msg", "existAccount");
        }
        // 跳转至验证界面
        response.sendRedirect("pages/registerValidate.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
