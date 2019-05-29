package com.neuedu.linaxi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AjaxServlet",urlPatterns = "/A.do")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println(name);

        //如果name不为null 认为正确
        //你们这里应该查数据库
        if(null !=name)
        {
            resp.getWriter().write("true");
        }

//        resp.getWriter().write("hello");
    }
}
