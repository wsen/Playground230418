/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.herritage;

/**
 *
 * @author wsen
 */

class Person{

}

class Child {

}

class Student extends Person{
    public void read(){System.out.println("Reading");}
}

public class CallSubStudent {
    public static void main(String[] args) {
        Person stu = new Student();
        ((Student)stu).read();
        
        System.out.println("-----referencing classObjects-----");
        Person a = null;
        Student aa = null;
        
        a = (Student)aa;
        a = new Student();
        //aa = new Person(); //neues Elternobjekt auf Objekt
        aa = (Student) a;
        //aa = a; //Elternobjekt auf Objekt 
        ((Student)a).read();
        
        System.out.println("-----References and Objects-----");
        Child c1, c2, c3, c4;
        
        c1 = c2 = new Child();
        c3 = new Child(); 
        System.out.println(c1 + " " + c2);
        //2 Objects 3 References
        
        System.out.println("-----for------");
        for (int i=0, j=10+2; i<j; i++, --j) {;} //OK
        
        int jj=5;
        //for(int j=0, jj+=5;  i<jj ; i++, jj--) {  jj--;  }
        for(int i=0, j=0;  i<jj ; i++, jj--) {  jj--;  } //j doppelt inintalisiert
    }
}
