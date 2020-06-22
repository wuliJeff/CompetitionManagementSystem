package com.cms.servlet.login;

import com.cms.service.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ForgetPwdServlet")
public class ForgetPwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String tel = request.getParameter("tel");
        UserServiceImpl service = new UserServiceImpl();
        String existAccount = service.isExistAccount(account);

        if (existAccount == null || existAccount.equals("")) {
            request.getSession().setAttribute("msg", "NotExistAccount");
        } else { // 不存在该账号
            String checkTelIsRight = service.checkTel(account, tel);
            if (checkTelIsRight == null || checkTelIsRight.equals("")) {
                request.getSession().setAttribute("msg", "wrongTel");
            } else {
                int resetPwd = service.resetPwd(account, password);
                System.out.println(resetPwd);
                if (resetPwd >= 0) {
                    request.getSession().setAttribute("msg", "resetPwdOK");
                } else {
                    request.getSession().setAttribute("msg", "resetPwdFail");
                }
            }
        }
        // 跳转至验证界面
        response.sendRedirect("pages/forgetPasswordValidate.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
