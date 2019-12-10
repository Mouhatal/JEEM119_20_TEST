package cours.jee.controllers;

import cours.jee.models.Medecin;
import cours.jee.services.IService;
import cours.jee.services.ISpecialite;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

@WebServlet(name = "medecinServlet", urlPatterns = "/medecin")
public class MedecinServlet extends HttpServlet {
    @EJB
    private IService iService;
    @EJB
    private ISpecialite iSpecialite;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action!=null){
            switch (action)
            {
                case "add":
                    Medecin m= new Medecin();
                    m.setMatricule(request.getParameter("matricule"));
                    m.setNom(request.getParameter("nom"));
                    m.setPrenom(request.getParameter("prenom"));
                    m.setEmail(request.getParameter("email"));
                    m.setTel(request.getParameter("tel"));
                    try {
                        String date= request.getParameter("datenaiss");
                        m.setDatenaiss(new SimpleDateFormat("yyyy-MM-dd").parse(date)) ;
                        int id_service=Integer.parseInt(request.getParameter("service"));
                        m.setService(iService.findById(id_service));
                        String[] sps=request.getParameterValues("specialite");
                        for (String:
                             ) {
                            String
                        }
                    }
                    catch (Exception e){
                            e.printStackTrace();
                    }
                    break;
            }
        }
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
