package banque.entites;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

    private Integer numero;
    private String rue;
    private int codePostal;
    private String Ville;

    public Adresse(){

    }

    public Adresse(Integer numero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        Ville = ville;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", Ville='" + Ville + '\'' +
                '}';
    }
}
