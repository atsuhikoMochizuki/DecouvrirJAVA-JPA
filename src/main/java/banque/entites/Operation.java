package banque.entites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="date")
    private LocalDate date;
    @Column(name="montant")
    private double montant;
    @Column(name="motif")
    private String motif;

     @ManyToOne
     @JoinColumn(name="COMPTE_ID")
     private Compte compte;

    public Operation()
    {

    }

    public Operation(Integer id, LocalDate date, double montant, String motif) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
