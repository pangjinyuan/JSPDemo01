package cn.edu.guet.servlet;

import cn.edu.guet.bean.User;
import cn.edu.guet.dao.IUserDao;
import cn.edu.guet.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uri = request.getRequestURI();
        if(uri.contains("viewUser")) {
            IUserDao userDao = new UserDaoImpl();
            List<User> userList = userDao.viewUser();
            request.setAttribute("userList", userList);
            request.getRequestDispatcher("/user/viewUser.jsp").forward(request, response);
        }else if (uri.contains("deleteUser")){
            String id = request.getParameter("id");
            IUserDao userDao = new UserDaoImpl();
            userDao.deleteUser(Integer.parseInt(id));
            request.getRequestDispatcher("/user/viewUser").forward(request, response);
        }else if (uri.contains("updataUser")){
            request.setCharacterEncoding("UTF-8");
            String id = request.getParameter("id");
            String name=request.getParameter("name");
            String address=request.getParameter("address");
            User user =new User(Integer.parseInt(id),name,address);
            IUserDao userDao = new UserDaoImpl();
            userDao.updataUser(user);
            request.getRequestDispatcher("/user/viewUser").forward(request, response);
        }else if (uri.contains("addUser")){
            request.setCharacterEncoding("UTF-8");
            String id = request.getParameter("id");
            String name=request.getParameter("name");
            String address=request.getParameter("address");
            User user =new User(Integer.parseInt(id),name,address);
            IUserDao userDao = new UserDaoImpl();
            userDao.addUser(user);
            request.getRequestDispatcher("/user/viewUser").forward(request, response);
        }else if (uri.contains("select")){
            String select = request.getParameter("select");
            System.out.println(select);
            IUserDao userDao = new UserDaoImpl();
            List<User> userList=userDao.selectUser(select);
            request.setAttribute("userList", userList);
            request.getRequestDispatcher("/user/viewUser.jsp").forward(request, response);

        }
    }
}
