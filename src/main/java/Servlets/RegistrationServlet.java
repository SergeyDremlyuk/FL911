package Servlets;

import DB.DAO.LanguageDAO;
import DB.DAO.LanguageDAOImpl;
import POJO.Language;
import Services.RegistratiomServiceImpl;
import Services.RegistrationService;
import org.json.JSONObject;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class RegistrationServlet extends HttpServlet {


    private static LanguageDAO languageDAO = new LanguageDAOImpl();
    private static RegistrationService registrationService = new RegistratiomServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if (req.getParameter("registerForm") != null) {


            String result = registrationService.regUser(req.getParameter("firstName"),
                    req.getParameter("lastName"),
                    req.getParameter("bday"),
                    req.getParameter("sex"),
                    req.getParameter("nativeLanguage"),
                    req.getParameter("login"),
                    req.getParameter("password"));


            if (result.equals("User exists")) {
                resp.getWriter().print("Login is already taken");
            } else {

                ((HttpServletResponse)resp).sendRedirect("/web");
                // req.getRequestDispatcher("index.jsp").forward(req, resp);
            }


        } else {
            List<Language> languageList = new ArrayList<>();
            try {
                languageList = languageDAO.getAll();
            } catch (LanguageDAOImpl.LanguageDAOException e) {
                e.printStackTrace();
            }
            req.setAttribute("languageList", languageList);
            req.getRequestDispatcher("registrationForm.jsp").forward(req, resp);
        }
    }
}

