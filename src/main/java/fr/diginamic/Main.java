package fr.diginamic;

import fr.diginamic.entites.Livres;
import fr.diginamic.mochizukiTools.Params;
import fr.diginamic.mochizukiTools.Utils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.List;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {

        Connection db = null;
        Utils.clearConsole();
        Params.welcomePrompt();

        Utils.msgTitle("TP1 : Prise en main de JPA");
        Utils.msgConsign("Configuration de JPA et de son implémentation Hibernate");
        Utils.msgInfo("Création d'un EntityManager");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEMO-JPA");
        EntityManager em;
        try {
            em = emf.createEntityManager();
            Utils.msgResult(em.toString());
        } catch (IllegalStateException e) {
            LOG.error(e.getMessage());
            throw new IllegalStateException(e);
        }

        Utils.msgResult("Connection à la base de données OK");
        Utils.msgInfo("Affichage des éléments de la table LIVRES:");
        TypedQuery<Livres> requete_listing = em.createQuery("select l from Livres l", Livres.class);
        List<Livres> liste = requete_listing.getResultList();
        for (Livres livre : liste) {
            Utils.msgResult(String.format("|| %03d || %40s || %25s ||", livre.getId(), livre.getTitre(), livre.getAuteur()));
        }

        Utils.msgTitle("TP2 : Utiliser les entités avec JPA");
        Utils.msgInfo("Extraction du livre possédant l'identifiant 1");
        Livres livre = em.find(Livres.class, 1);
        if (livre != null) {
            Utils.msgResult(String.format("Extraction du livre(ID = %d, TITRE=%s, AUTEUR=%s) OK", livre.getId(), livre.getTitre(), livre.getAuteur()));
        }
//
        Utils.msgConsign("Insertion d'un nouveau livre");
        Utils.msgInfo("Début de la transaction");
        em.getTransaction().begin();
        Livres livreAinserer = new Livres();
        livreAinserer.setTitre("Les misérables");
        livreAinserer.setAuteur("Victor Hugo");
        em.persist(livreAinserer);
        em.getTransaction().commit();
        Utils.msgResult("Transaction commitée avec succès");

        Utils.msgConsign("Modification du livre n°5");
        em.getTransaction().begin();
        Livres livreAmodifier = em.find(Livres.class, 5);
        if (livreAmodifier != null) {
            livreAmodifier.setTitre("Du plaisir dans la cuisine");
            em.persist(livreAmodifier);
            em.getTransaction().commit();
        }
        Utils.msgResult("Correction du titre du livre n°5 OK");

        Utils.msgConsign("Extraction de la base d'un livre en fonction de son titre à l'aide d'une queryJPQL");
        TypedQuery<Livres> requete1 = em.createQuery("SELECT l FROM Livres l WHERE l.titre='Les misérables'", Livres.class);
        Livres livreExtrait = requete1.getSingleResult();
        if (livreExtrait != null)
            System.out.println(livreExtrait.toString());

        Utils.msgConsign("Extraction de la base d'un livre en fonction de son auteur à l'aide d'une queryJPQL");
        Integer bookNbr = 0;
        requete1 = em.createQuery("SELECT l FROM Livres l WHERE l.Auteur='Victor Hugo'", Livres.class);
        livreExtrait = requete1.getSingleResult();
        if (livreExtrait != null) {
            System.out.println(livreExtrait.toString());
            bookNbr = livreExtrait.getId();
        }
        Utils.msgConsign("Suppression d'un livre");
        Livres livreAsupprimer = em.find(Livres.class, bookNbr);
        if (livre != null) {
            em.getTransaction().begin();
            em.remove(livreAsupprimer);
            em.getTransaction().commit();
        }
        Utils.msgInfo("Affichage des éléments de la table LIVRES:");
        requete_listing = em.createQuery("select l from Livres l", Livres.class);
        liste = requete_listing.getResultList();
        for (Livres book : liste) {
            Utils.msgResult(String.format("|| %03d || %40s || %25s ||", book.getId(), book.getTitre(), book.getAuteur()));
        }

        Utils.msgTitle("TP3: Savoir utiliser des entités");




        em.close();
    }
}