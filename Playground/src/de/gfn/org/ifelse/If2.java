package de.gfn.org.ifelse;

/**
 *
 * @author wsen
 */
public class If2 {
    public static void main(String[] args) {
        int a = 10, b = 20; boolean c = false;
        if (b > a) if (++a == 10) if (c!=true)
//            true      false          false != true = TRUE
                    System.out.println(1);
        else System.out.println(2);
        else System.out.println(3);
    
        System.out.println("-----");
        int abc;
        String course = //Hallelu
                "eJava";
    }
}

