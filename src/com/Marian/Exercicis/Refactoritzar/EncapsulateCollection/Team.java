package com.Marian.Exercicis.Refactoritzar.EncapsulateCollection;

import java.util.ArrayList;
import java.util.Date;

public class Team {
    private String name;
    private Date creation;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name, Date creation) {
        this.name = name;
        this.creation = creation;
    }

    public String getName() {
        return name;
    }

    public Date getCreation() {
        return creation;
    }

    public ArrayList<Player> getPlayers() {
        return copyArray(players);
    }
    public ArrayList<Player> copyArray( ArrayList<Player> player){

        ArrayList<Player> arrayAux = new ArrayList<Player>();

        for (int i = 0; i < player.size(); i++) {

            arrayAux.add(player.get(i));
        }
        return arrayAux;
    }

    public int totalPlayers() {
        return players.size();
    }
}
