package cours.jee.services;

import cours.jee.models.Specialite;
import cours.jee.utils.HibernateUtil;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class SpecialiteService implements ISpecialite{
    private Session session;
    public SpecialiteService(){
        session= HibernateUtil.getSession();
    }

    @Override
    public List<Specialite> findAll() {
        return session.createQuery("SELECT s FROM Specialite s ").list();
    }
}
