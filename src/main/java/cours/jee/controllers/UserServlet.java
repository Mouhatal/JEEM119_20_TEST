package cours.jee.controllers;

import cours.jee.services.ISpecialite;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "User",urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    @EJB
    private ISpecialite iSpecialite;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        iSpecialite.findAll();
        request.setAttribute("message","M1GL on fait du JEE");
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp")
                .forward(request,response);
    }
}
