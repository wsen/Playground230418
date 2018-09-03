/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class MyField {
    int x;
    int y;
    public void doStuff(int x, int y) {
        System.out.println("vorher: "+ this.x+" und y "+y);
        this.x = x; //100
        y = this.y; //0
        System.out.println("nachher: "+ this.x+" und y "+y);
    }
    public void display() {
        System.out.print(x + " " + y + " / ");
        System.out.println("this: " + this.x + " " + this.y + " : ");
    }
    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;
        MyField m2 = new MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display(); //100 200 
        m2.display();
    }
}
