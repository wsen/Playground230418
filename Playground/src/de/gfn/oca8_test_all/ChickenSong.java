/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca8_test_all;

/**
 *
 * @author wsen
 */
class Chicken {
}

interface HenHouse {

    public java.util.List<Chicken> getChickens();
}

public class ChickenSong {

    public static void main(String[] args) {
        HenHouse house = null;//new HenHouse; //assumed to be valid
        Chicken chicken = house.getChickens().get(0);
        for (int i = 0; i < house.getChickens().size(); chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }

    }
}
