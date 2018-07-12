/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.nio;

/**
 *
 * @author tlubowiecki
 */
public class SteckerProvider {
    
    public static Stecker getStecker(String typ) {
        
        switch(typ) {
            
            case "EU":
                return new Stecker() {
                    @Override
                    public void gibStrom() {
                        System.out.println("EU Stecker");
                    }
                };
                
                
            case "GB":
                return new Stecker() {
                    @Override
                    public void gibStrom() {
                        System.out.println("GB Stecker");
                    }
                };
                
            case "US":
                return new Stecker() {
                    @Override
                    public void gibStrom() {
                        System.out.println("US Stecker");
                    }
                };
                
            default:
                return null;
        }
    }
}
