package de.gfn.ocp.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tlubowiecki
 */
public class ComparatorTest1 {
    
    public static void main(String[] args) {
        
        //int compare(o1, o1)
        Comparator<ForestScout> c1 = (o1, o2) -> o1.getAge() - o2.getAge();
        Comparator<ForestScout> c2 = (o1, o2) -> o1.getFirstname().compareTo(o2.getFirstname());
        Comparator<ForestScout> c3 = (o1, o2) -> o1.getLastname().compareTo(o2.getLastname());
        
        Set<ForestScout> set = new TreeSet<>(new AgeComparator());
        set.add(new ForestScout(22, "Peter", "Parker"));
        set.add(new ForestScout(44, "Bruce", "Wayne"));
        set.add(new ForestScout(33, "Clark", "Kent"));
        set.add(new ForestScout(15, "Peter", "Kent"));
        
        set.forEach((s) -> System.out.println(s.getFirstname() + " " + s.getLastname() + ", " + s.getAge()));
    }
}

class ForestScout {
    
    private final int age;
    private final String firstname;
    private final String lastname;

    public ForestScout(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}

class AgeComparator implements Comparator<ForestScout> {

    @Override
    public int compare(ForestScout o1, ForestScout o2) {
        return o1.getAge() - o2.getAge();
    }
}
