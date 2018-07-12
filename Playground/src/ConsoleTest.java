
import java.io.Console;

/**
 *
 * @author tlubowiecki
 */
public class ConsoleTest {
    
    public static void main(String[] args) {
        
        Console c = null;
        String i = null;
        
        try {
            c = System.console();
            if(c != null) {
//                i = c.readLine("Text: ");
//                System.out.println("Text: " + i);
//                
//                char[] pw = c.readPassword("Passwort: ");
//                System.out.println("Passwort: " + pw);
                
                String format = "%1$10s %2$10s %3$10s.%n";
                c.printf(format, "Peter", "Clark", "Bruce");
                c.printf(format, "Jan", "Olga", "Nic");
            }
            else {
                System.out.println("Keine Console!");
            }
        }
        catch(Exception ex) {
            System.out.println("Problem");
        }
        
    }
}
