package fr.diginamic.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "LIVRES")
public class Livres {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "AUTEUR")
    private String Auteur;

    public Livres()
    {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livres{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                '}';
    }
}
