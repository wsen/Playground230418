/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.generics.insel;

/**
 *
 * @author student
 */
public class Pocket {
    private Object value; //Typ Object sehr allgemein! -> bsp: Long
    public Pocket() {} //Constructor
    public Pocket( Object value ) { this.value = value; } //Constructor
    public void set( Object value ) { this.value = value; } //setter
    public Object get() { return value; } //getter  //Typ Long (Annahme) ->
    //Compilet:.. auf jeden Fall ein Long ist, dann könnte die Typumwandlung wegfallen
    public boolean isEmpty() { return value == null; }
    public void empty() { value = null; }
    
    public static void main(String[] args) {
        Player michael = new Player();
        michael.name = "Omar Arnold";
        Pocket pocket = new Pocket();
        Long aBigNumber = 11111111111111L;
        pocket.set( aBigNumber ); // (1)
        michael.leftPocket = pocket;
        michael.rightPocket = new Pocket( 2222222222222222222L );
        System.out.println( michael.name + " hat in den Taschen " +
        michael.leftPocket.get() + " und " + michael.rightPocket.get() );
        Long val1 = (Long) michael.leftPocket.get(); // (2)
        Long val2 = (Long) michael.rightPocket.get();
        System.out.println( val1.compareTo( val2 ) > 0 ? "Links" : "Rechts" );
    }
}

class Player {
    public String name;
    public Pocket rightPocket;
    public Pocket leftPocket;
}