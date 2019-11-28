package cours.jee.models;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "specialite")
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String libelle;
    @ManyToMany
    private List<Medecin> medecins;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

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

