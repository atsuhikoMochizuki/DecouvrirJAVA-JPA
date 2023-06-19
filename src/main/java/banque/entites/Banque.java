package banque.entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="banque")
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "banque")
    private Set<Client> clients;

    public Banque() {
    }

    public Banque(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
