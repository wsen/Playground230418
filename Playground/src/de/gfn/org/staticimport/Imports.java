/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticimport;

/**
 *
 * @author wsen
 */
import java.util.*;
// INSERT CODE HERE
import static java.util.Collections.*; // WORKS
// import static java.util.Collections.sort(ArrayList<String>); // NO

public class Imports {

    public void method(ArrayList<String> list) {
        sort(list);
    }
}
/*
A. import static java.util.Collections;
B. import static java.util.Collections.*;
C. import static java.util.Collections.sort(ArrayList<String>);
D. static import java.util.Collections;
E. static import java.util.Collections.*;
F. static import java.util.Collections.sort(ArrayList<String>);
 */
