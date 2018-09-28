package de.gfn.ocp.localization;

//import java.time.Duration;
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
//import java.time.Period;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.*;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author tlubowiecki
 */
public class LocalizationTest {
    
    public static void main(String[] args) {
        
        LocalDate d1 = LocalDate.of(2000, Month.OCTOBER, 30);
        
        LocalTime t1 = LocalTime.of(10, 16, 11);
        
        LocalDateTime dt = LocalDateTime.of(d1, t1);
        
        t1.minusHours(3);
        t1.minus(3, ChronoUnit.HOURS);
        
        
        ZoneId zone = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt = ZonedDateTime.of(2017, 1, 20, 5, 16, 15, 10, zone);
        System.out.println(zdt);
        
        System.out.println("------");
        
        ZoneId.getAvailableZoneIds()
                .stream()
                .filter(d -> d.startsWith("Europe"))
                .forEach(System.out::println);
        
        
        System.out.println("----------");
        
        Period p1 = Period.between(LocalDate.of(2000, Month.MARCH, 15), LocalDate.of(1922, Month.DECEMBER, 10));
        System.out.println(p1);
        
        Period p2 = Period.ofYears(20);
        Period p3 = Period.of(10, 10, 10);
        System.out.println(p3);
        
        LocalDate d2 = LocalDate.now();
        System.out.println(d2.plus(p2));
        
        System.out.println("----------");
        
        Instant start = Instant.now();
        
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        
        Instant end = Instant.now();
        Duration d = Duration.between(start, end);
        System.out.println(d.toMillis());
        LocalTime lt10 = LocalTime.now();
        System.out.println(lt10);
        lt10 = lt10.plus(d);
        System.out.println(lt10);
        
        System.out.println("--------------");
        
        LocalDate d5 = LocalDate.of(2018, Month.OCTOBER, 1);
        LocalTime t5 = LocalTime.of(2, 30);
        ZoneId z5 = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt5 = ZonedDateTime.of(d5, t5, z5);
        System.out.println(zdt5);
        zdt5 = zdt5.plusMonths(1);
        System.out.println(zdt5);
        
        System.out.println("---------");
        
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("fr", "FR"));
        System.out.println(Locale.getDefault());
        Locale.setDefault(Locale.KOREA);
        System.out.println(Locale.getDefault());
        
        System.out.println("---------");
        
        Arrays.stream(Locale.getAvailableLocales()).forEach(System.out::println);
        
        System.out.println("---------");
        
        Locale l = Locale.getDefault();
        System.out.println(l.getDisplayCountry());
        System.out.println(l.getDisplayCountry(Locale.GERMAN));
        
        System.out.println(l.getDisplayLanguage());
        System.out.println(l.getDisplayLanguage(Locale.ITALY));
        
        System.out.println(l.getDisplayName());
        System.out.println(l.getDisplayName(Locale.FRANCE));
        
        System.out.println("---------");
        
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("de").setRegion("DE");
        Locale l2 = builder.build();
        
    }
    
}
