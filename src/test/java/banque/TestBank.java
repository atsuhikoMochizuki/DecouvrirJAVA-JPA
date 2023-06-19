package banque;

import banque.entites.*;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class TestBank {
    @Test
    public void testCreateClient() {
        //Création d'une banque
        Banque banque1 = new Banque(1,"Crédit Agricole");
//        Création de 2 clients
        Adresse adresseClient1 = new Adresse(15,"passage des Alouettes",46000,"Niort");
        Client client1 = new Client(1,"Luther","Martin",LocalDate.parse("1923-10-23"),adresseClient1,null,banque1);
        Adresse adresseClient2 = new Adresse(425,"Boulevard de Genève",75000,"Paris");
        Client client2 = new Client(1,"Rochefort","Jean",LocalDate.parse("1928-08-12"),adresseClient2,null,banque1);





        //        Compte cpt1 = new LivretA(1,"1245A",1505.25,null,null,0.04);


        //A -> Action


        //A -> Assertion

//        //A -> Arrangement
//
//
//        //A -> Action
//        int result = Main.addition (3,3);
//
//        //A -> Assertion

//        int i = 6;
//        assertEquals(result,i);
    }
}
