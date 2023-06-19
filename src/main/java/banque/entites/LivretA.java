package banque.entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="LivretA")
public class LivretA extends Compte{
    @Column(name="taux")
    private double taux;

    public LivretA(Integer id, String numero, double solde, Set<Client> client, Set<Operation> operations, double taux) {
        super(id, numero, solde, client, operations);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "LivretA{" +
                "taux=" + taux +
                '}';
    }
}
