package de.gfn.org.timegedoens;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author wsen
 */
public class Short {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2015, 5, 7);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}
