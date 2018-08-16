/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.immutableTest;

/**
 * boya OCA 208 Chapter 4 ■ Methods and Encapsulation
 *
 * @author student
 */
public class NotImmutable {

    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
    }


    //Defensive Copy
    public Mutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }

//    public StringBuilder getBuilder() {
//        return builder;
//    }
    
    
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
}

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());
    }
}
