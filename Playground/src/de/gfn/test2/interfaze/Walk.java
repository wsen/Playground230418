/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.test2.interfaze;

/**
 *
 * @author wsen
 */
public interface Walk {
    public default int getSpeed(){
        return 5;
    }
}
