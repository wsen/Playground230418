/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp2.xtest;

/**
 *
 * @author student
 */
class Xtest {

}

public class Card {

    private String rank;
    private String suit;

    public Card(String r, String s) {
        if (r == null || s == null) {
            throw new IllegalArgumentException();
        }
        rank = r;
        suit = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {
            return false;
        }
        Card c = (Card) obj;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    public int hashCode() {
        return rank.hashCode();
    }
}

class Lion {

    private int idNumber;
    private int age;
    private String name;

    public Lion(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Lion)) {
            return false;
        }
        Lion otherLion = (Lion) obj;
        return this.idNumber == otherLion.idNumber;
    }
}
