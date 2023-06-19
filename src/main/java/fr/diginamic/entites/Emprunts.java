package fr.diginamic.entites;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "EMPRUNTS")
public class Emprunts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATE_DEBUT")
    private Date dateDebut;

    @Column(name="DATE_FIN")
    private Date dateFin;
    @Column(name="DELAI")
    private int delai;

    //Client
    @ManyToOne
    @JoinColumn(name="ID")
    private Clients client;




}
