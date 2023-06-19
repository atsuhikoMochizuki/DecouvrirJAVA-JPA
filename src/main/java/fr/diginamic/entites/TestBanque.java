package fr.diginamic.entites;

import fr.diginamic.Main;
import fr.diginamic.mochizukiTools.Utils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBanque {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em;
        try {
            em = emf.createEntityManager();
            Utils.msgResult(em.toString());
        } catch (IllegalStateException e) {
            LOG.error(e.getMessage());
            throw new IllegalStateException(e);
        }



//        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
//            EntityManager em = emf.createEntityManager()){
//            System.out.println(em.toString());
//        }
//        catch(IllegalStateException e)
//        {
//            LOG.error(e.getMessage());
//            throw new RuntimeException(e);
//        }


    }
}
