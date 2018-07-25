package de.gfn.org.oca;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wsen
 */

class AgeOutOfRangeException extends Exception {}

class Candidate {
    int age;
    Candidate(int age) throws Exception {
        if (age <= 10 || age >= 150 ) {throw new AgeOutOfRangeException();}
        else { this.age = age;}
    }
    @Override
    public String toString() {
        return "Age: " + age;
    }
}


public class CandidateErrorTest {
    public static void main(String[] args) throws Exception { 
//        try {
            Candidate c = new Candidate(92);       
            Candidate c1 = new Candidate(32);
            System.out.println(c);
            System.out.println(c1);
//        } catch (AgeOutOfRangeException e2) {
            //Logger.getLogger(CandidateErrorTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
