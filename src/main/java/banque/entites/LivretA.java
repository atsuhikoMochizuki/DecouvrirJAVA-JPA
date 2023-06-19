package banque.entites;

import jakarta.persistence.*;

@Entity
@Table(name="LivretA")
public class LivretA extends Compte{
    @Column(name="taux")
    private double taux;

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
