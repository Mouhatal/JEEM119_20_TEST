package cours.jee.models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String libelle;
    @OneToMany(mappedBy = "service")
    private List<Specialite> specialites;

    @OneToMany(mappedBy = "service")
    private List<Medecin> medecin;

    public List<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(List<Specialite> specialites) {
        this.specialites = specialites;
    }

    public List<Medecin> getMedecin() {
        return medecin;
    }

    public void setMedecin(List<Medecin> medecin) {
        this.medecin = medecin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
