package de.gfn.ocp.localization;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author tlubowiecki
 */
public class CalendarTest {
    
    public static void main(String[] args) {
        
        Calendar cal = Calendar.getInstance();
        cal.set(2015, 5, 10);
        Date d = cal.getTime();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.GERMAN);
        System.out.println(df.format(d));
        

        System.out.printf("%tD%n", cal);
        
        System.out.printf(Locale.GERMAN, "%tT%n", cal);
        
        
        
        
        
    }
}
