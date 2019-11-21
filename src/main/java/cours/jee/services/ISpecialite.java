package cours.jee.services;

import cours.jee.models.Specialite;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ISpecialite {
    public List<Specialite> findAll();

}
