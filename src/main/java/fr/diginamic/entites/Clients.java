package fr.diginamic.entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "CLIENTS")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;

    @OneToMany(mappedBy = "client")
    private Set<Emprunts> emprunts;


    public Clients() {

    }

    public Clients(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
