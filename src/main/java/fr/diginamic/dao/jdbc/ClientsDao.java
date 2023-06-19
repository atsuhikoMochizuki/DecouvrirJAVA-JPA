package fr.diginamic.dao.jdbc;

import fr.diginamic.dao.IClientsDao;
import fr.diginamic.entites.Clients;

import java.util.ArrayList;

public class ClientsDao implements IClientsDao {

    @Override
    public ArrayList<Clients> extraire() {
        return null;
    }

    @Override
    public void insert(Clients client) {

    }

    @Override
    public int update(String ancienNom, String nouveauNom) {
        return 0;
    }

    @Override
    public boolean delete(Clients client) {
        return false;
    }
}
