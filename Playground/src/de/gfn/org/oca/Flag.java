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
public class Flag {
    boolean isFlagChanged;
    boolean flag;
    public boolean changeFlag(boolean flag) {
         if (flag) {
             flag = !flag;
         } else {
             flag = true;
             isFlagChanged = true;
         }
         return isFlagChanged;
    }
    public static void main(String[] args) {
        Flag t = new Flag();
        t.changeFlag(false);
        System.out.println(t.flag + ", "+ t.isFlagChanged);
    }
}
