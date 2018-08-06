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
public class PocketG<T> {
    private T value; //Typ Object sehr allgemein! -> bsp: Long
    public PocketG() {} //Constructor
    public PocketG( Object value ) { this.value = value; } //Constructor
    public void set( Object value ) { this.value = value; } //setter
    public Object get() { return value; } //getter  //Typ Long (Annahme) ->
    //Compilet:.. auf jeden Fall ein Long ist, dann könnte die Typumwandlung wegfallen
    public boolean isEmpty() { return value == null; }
    public void empty() { value = null; }
    
    public static void main(String[] args) {
        Player michael = new Player();
        michael.name = "Omar Arnold";
        PocketG pocket = new PocketG();
        Long aBigNumber = 11111111111111L;
        pocket.set( aBigNumber ); // (1)
        michael.leftPocket = pocket;
        michael.rightPocket = new PocketG( 2222222222222222222L );
        System.out.println( michael.name + " hat in den Taschen " +
        michael.leftPocket.get() + " und " + michael.rightPocket.get() );
        Long val1 = (Long) michael.leftPocket.get(); // (2)
        Long val2 = (Long) michael.rightPocket.get();
        System.out.println( val1.compareTo( val2 ) > 0 ? "Links" : "Rechts" );
    }
}

class PlayerG {
    public String name;
    public PocketG rightPocket;
    public PocketG leftPocket;
}