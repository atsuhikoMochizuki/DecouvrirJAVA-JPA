package banque.entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Compte")
public abstract class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="numero")
    private String numero;
    @Column(name="solde")
    private double solde;

    @ManyToMany(mappedBy = "comptes")
    private Set<Client> client;

    @OneToMany(mappedBy = "compte")
    private Set<Operation> operations;

    public Compte() {
    }

    public Compte(Integer id, String numero, double solde, Set<Client> client, Set<Operation> operations) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.client = client;
        this.operations = operations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }
}
