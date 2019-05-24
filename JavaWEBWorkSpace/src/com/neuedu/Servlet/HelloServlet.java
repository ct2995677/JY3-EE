package com.neuedu.Servlet;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet",urlPatterns = "/Hello.do")
public class HelloServlet extends HttpServlet {

    //初始化UserDao对象
    private UserDao ud;
    //初始化方法
    @Override
    public void init() throws ServletException {
        ud = new UserDaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        ud.register(user,pass);
        //跳转页面,请求转发
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
}
