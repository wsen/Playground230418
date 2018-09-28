package de.gfn.org.constructors;

/**
 *
 * @author wsen
 */

class Person {
    Person(String value){}
}

class Employee extends Person {
//    Employee(){}
//    Employee(String value){}
} 

public class NonValueConstructor {
    public static void main(String[] args) {
        Employee e = new Employee();
//        Employee e = new Employee("Hans");
//        Person e = new Employee("Hans");
    }
}
