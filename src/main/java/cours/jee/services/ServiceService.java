package cours.jee.services;

import cours.jee.models.Service;
import cours.jee.utils.HibernateUtil;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ServiceService implements IService{
     private Session session;
     public ServiceService(){
         session = HibernateUtil.getSession();
     }
    @Override
    public List<Service> findAll() {

         return session.createQuery("SELECT s FROM Service s ").list();
    }

    @Override
    public Service findById(int id) {
        return session.find(Service.class,id);
    }
}

