package org.example.servletdemo.servlet;

import org.example.servletdemo.dao.UserDao;
import org.example.servletdemo.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private final UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<User> users = userDao.getAllUsers();
            req.setAttribute("users", users);
            req.getRequestDispatcher("/pages/user.jsp").forward(req, resp);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}

