package cours.jee.services;

import cours.jee.models.Medecin;
import cours.jee.utils.HibernateUtil;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MedecinService implements IMedecin {

    private Session session;
    public MedecinService(){
        session= HibernateUtil.getSession();
    }
    @Override
    public List<Medecin> findAll() {
        return session.createQuery("SELECT s FROM Medecin s ").list();
    }

    @Override
    public void add(Medecin m) {
        try {
            session.save(m);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
