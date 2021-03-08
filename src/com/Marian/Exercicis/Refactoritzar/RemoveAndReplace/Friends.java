package com.Marian.Exercicis.Refactoritzar.RemoveAndReplace;

public class Friends {

    private String[] friends;

    public Friends (String[] friends) {
        this.friends = friends;
    }

    public int indexOf (String friend) {

        for (int i = 0; i < friends.length; i++) {

            if(friends[i].equalsIgnoreCase(friend)){
                return i-1;
            }
        }
        return -1;
    }
}
