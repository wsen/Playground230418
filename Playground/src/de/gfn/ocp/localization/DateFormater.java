package de.gfn.ocp.localization;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author tlubowiecki
 */
public class DateFormater {
    
    public static void main(String[] args) {
        
        LocalDate now = LocalDate.now();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        
        System.out.println(dtf.format(now));
        
        LocalDate ld = LocalDate.parse("10.05.2015", dtf);
        System.out.println(dtf.format(ld));
        
        dtf = DateTimeFormatter.ofPattern("hh:mm");
        LocalTime time = LocalTime.now();
        System.out.println(dtf.format(time));
        
        System.out.println("------------");
        
        Date d1 = new Date();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.GERMAN);
        System.out.println(df.format(d1));
        
        System.out.println("------------");
        
        //DateFormat df2 = new SimpleDateFormat("dd.MM.yy hh:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy hh:mm:ss");
        sdf.applyPattern("d. MMM yyyy");
        System.out.println(sdf.format(d1));
        
        System.out.println("-------------");
        
        dtf = DateTimeFormatter.ofPattern("y M d");
        LocalDate d4 = LocalDate.parse("10 10 10", dtf);
        System.out.println(d4);
        
        
    }
    
}
