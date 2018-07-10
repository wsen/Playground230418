/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.looplabel;

/**
 *
 * @author wsen
 */
public class crazyLoop {

    void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
                System.out.println(c);
                if (c > 3) {
                    break JILL;
                } else {
                    c++;
                }
            
        }
    }

    public static void main(String[] args) {
        //crazyLoop cl = 
                new crazyLoop().crazyLoop();
        //<editor-fold defaultstate="collapsed" desc="comment">
    }
//</editor-fold>

}
