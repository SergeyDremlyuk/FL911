package Servlets;

import Services.AuthorizationService;
import Services.AuthorizationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet{

    private static AuthorizationService authorizationService = new AuthorizationServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (authorizationService.auth(login, password)) {
            req.getSession().setAttribute("isAuth", true);
            ((HttpServletResponse)resp).sendRedirect("/web/main");
    //        req.getRequestDispatcher("/main").forward(req, resp);
    //      req.getRequestDispatcher("main.jsp").forward(req, resp);
         //   req.getRequestDispatcher("/main").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/").forward(req, resp);
        }

    }
}
