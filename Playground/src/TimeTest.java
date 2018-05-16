
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 *
 * @author Administrator
 */
public class TimeTest {
    
    public static void main(String[] args) {
        
        LocalDate d1 = LocalDate.of(1922, 2, 20);
        //LocalDate d2 = LocalDate.of(2000, Month.AUGUST, 10);
        
        //d1 = d1.plusDays(10);
        //d1 = d1.minusDays(10);
        d1 = d1.minus(10, ChronoUnit.DAYS);
        
        System.out.println(d1);
        
        System.out.println("----------------");
        
        LocalTime t1 = LocalTime.of(12, 59);
        t1 = t1.plus(5, ChronoUnit.HOURS);
        
        System.out.println(t1);
        
        System.out.println("-----------------");
        
        LocalDateTime dt1 = LocalDateTime.of(d1, t1);
        System.out.println(dt1);
        
        System.out.println(d1.toEpochDay());
        System.out.println(t1.toSecondOfDay());
        System.out.println(dt1.toEpochSecond(ZoneOffset.UTC));
        
        System.out.println("----------------");
        
//        ZoneId.getAvailableZoneIds().forEach(e -> System.out.println(e));
        
//        System.out.println("----------------");
//        
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDate end = LocalDate.now();
        Period p = Period.between(d1, end);
        p = p.plusDays(10);
        System.out.println(p);
        
        d1 = d1.plus(p);
        System.out.println(d1);
        
        System.out.println("---------------");
        
        LocalTime t2 = LocalTime.of(22, 27);
        Duration d = Duration.between(t1, t2);
        d = d.minus(5, ChronoUnit.HALF_DAYS);
        System.out.println(d);
        
        System.out.println("---------------");
        
        Instant s = Instant.now();
        
        int i = 0;
        while(i < 100) {
            System.out.println(i++);
            
        }
        
        Instant e = Instant.now();
        
        System.out.println(Duration.between(s, e));
        
        
    }
}
