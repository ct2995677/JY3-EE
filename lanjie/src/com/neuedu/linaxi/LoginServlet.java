package com.neuedu.linaxi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@SuppressWarnings("ALL")
@WebServlet(name = "LoginServlet",urlPatterns ="/lo.do")
public class LoginServlet extends HttpServlet {
    @SuppressWarnings("ControlFlowStatementWithoutBraces")
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String psw = req.getParameter("psw");


        if (null != username && username.length()>0 && null != psw && psw.length()>0)
        {
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            resp.sendRedirect("welcome.jsp");
        }else{
            resp.sendRedirect("login.jsp");
        }


    }
}
