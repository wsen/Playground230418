package de.gfn.org.timegedoens;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wsen
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(2020, 1, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        //LocalDateTime dateTime = LocalDateTime.of(date, time);
        //System.out.println(dateTime);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
        LocalDateTime ldt = LocalDateTime.of(2016, Month.AUGUST, 22, 14, 30);
        System.out.println("LocalDateTime : " + format.format(ldt));

        //UTC+8
        ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
        System.out.println(new LocalDateTimeTest().getDateString(klDateTime) + "");
        
        System.out.println("----------");
        int a = 5, b = 7, k = 0;
        Integer m = null;

        k = new Integer(a) + new Integer(b);  //1
        System.out.println(k);
        k = new Integer(a) + b; //2
        System.out.println(k);
        k = a + new Integer(b); //3
        System.out.println(k);
        m = new Integer(a) + new Integer(b); //4
        System.out.println(m);
    }
    
    //public String getDateString(LocalDateTime ldt){
    public String getDateString(ZonedDateTime ldt){
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt);
     }

}

