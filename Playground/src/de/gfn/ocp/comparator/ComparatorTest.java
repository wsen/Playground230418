package de.gfn.ocp.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 *
 * @author tlubowiecki
 */
public class ComparatorTest {
    
    public static void main(String[] args) {
        
        Student[] students = {
            new Student("Peter", 22, 12345678),
            new Student("Bruce", 25, 13345678),
            new Student("Bruce", 21, 24575678),
            new Student("Clark", 32, 11111133)
        };
        
        //Comparator<Student> comp1 = Comparator.comparing(Student::getMatrikelNr, (m1, m2) -> m2 - m1);
        Comparator<Student> comp1 = Comparator.comparing(Student::getName);
        comp1 = comp1.thenComparing(Student::getAge);
        Arrays.sort(students, comp1);
        Arrays.stream(students).forEach(System.out::println);
        
        
        Integer[][] arr = {{1,2,3},{1,2},{1,2,3,4,5},{1}};
        Comparator<Integer[]> comp2 = Comparator.comparing(e -> e.length);
        Arrays.sort(arr, comp2);
        Arrays.stream(arr).forEach(a -> System.out.println(a.length));
        
        
        List<?> l = new ArrayList<Integer>();
        List<?> l2 = new ArrayList<Double>();
        List<? extends CharSequence> l3 = new ArrayList<String>();
        
        System.out.println("-----------");
        
        List<Integer> list = Arrays.asList(new Integer[] {3,4,5,6,7,8,9});
        //HashMap<Integer, List<Integer>>
        ConcurrentMap<Integer, List<Integer>> map = list.parallelStream().collect(
            Collectors.groupingByConcurrent(i -> i % 2 == 0 ? 1 : 2)
        );
    }
}

class Student {
    
    private String name;
    private int age;
    private int matrikelNr;

    public Student(String name, int age, int matrikelNr) {
        this.name = name;
        this.age = age;
        this.matrikelNr = matrikelNr;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + matrikelNr;
    }
}
