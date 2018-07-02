/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class MultiCatch {
    public static void main(String[] args) {
        System.out.print("a");
        try {
           System.out.print("b");
           throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
           System.out.print("c");
           throw new RuntimeException("1");
        } catch (RuntimeException e) {
           System.out.print("d");
           throw new RuntimeException("2");
        } finally {
           System.out.print(" finally e");
           throw new RuntimeException("3");
        }
    }
}
