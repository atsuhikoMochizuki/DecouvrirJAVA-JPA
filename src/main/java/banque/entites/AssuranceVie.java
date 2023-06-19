package banque.entites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="AssuranceVie")
public class AssuranceVie extends Compte{
    @Column(name="dateFin")
    private LocalDate dateFin;
    @Column(name="taux")
    private double taux;

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "AssuranceVie{" +
                "dateFin=" + dateFin +
                ", taux=" + taux +
                '}';
    }
}
