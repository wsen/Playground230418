package de.gfn.org.arraylist;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author wsen
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(LocalDate.now());
        list.add(LocalDate.now().plusDays(1));
    }
}
