package cours.jee.controllers;

import cours.jee.services.IService;
import cours.jee.services.ISpecialite;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "medecinServlet", urlPatterns = "/medecin")
public class MedecinServlet extends HttpServlet {
    @EJB
    private IService iService;
    @EJB
    private ISpecialite iSpecialite;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("services",iService.findAll());
            request.setAttribute("specialites",iSpecialite.findAll());
            getServletContext().getRequestDispatcher("/WEB-INF/medecin.jsp")
                    .forward(request,response);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
