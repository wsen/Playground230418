package de.gfn.org.equals;

import java.time.LocalDate;

/**
 *
 * @author wsen
 */

class Book {
    String ISBN;
    Book(String val) {
        ISBN = val;
    }
    public boolean equals(Object b) {
        if (b instanceof Book) {
            return ((Book)b).ISBN.equals(ISBN);
        } else
            return false;
    }
}

public class TestEquals {
    public static void main(String[] args) {
        Book b1 = new Book("1234-4567");
        Book b2 = new Book("1234-4567");
        LocalDate release = null;
        release = b1.equals(b2) ? (b1==b2? LocalDate.of(2050,12,12):
                LocalDate.parse("2072-02-01")):LocalDate.parse("9999-09-09");
        System.out.println(release);
    }
}
