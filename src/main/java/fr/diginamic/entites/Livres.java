package fr.diginamic.entites;

import jakarta.persistence.*;


public class Livres {


    private Integer id;

    private String titre;

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
