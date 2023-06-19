package fr.diginamic.dao;

import fr.diginamic.entites.Clients;

import java.util.ArrayList;

public interface IClientsDao {
    ArrayList<Clients> extraire();
    void insert(Clients client);
    int update(String ancienNom, String nouveauNom);

    boolean delete(Clients client);
}
