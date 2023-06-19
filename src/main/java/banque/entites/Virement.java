package banque.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Virement extends Operation{
    @Column(name="beneficiaire")
    private String beneficiaire;

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    @Override
    public String toString() {
        return "Virement{" +
                "beneficiaire='" + beneficiaire + '\'' +
                '}';
    }
}
