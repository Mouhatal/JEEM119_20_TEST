package cours.jee.services;
import cours.jee.models.Medecin;


import javax.ejb.Local;
import java.util.List;

@Local
public interface IMedecin {
    public  List<Medecin> findAll();

    public void add(Medecin m);
}
