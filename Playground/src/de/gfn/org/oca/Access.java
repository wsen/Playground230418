package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class Access {
    private int x = 0;
    private int y = 0;
    
    public static void main(String[] args) {
        Access accApp = new Access();
        Access accApp2 = new Access(5, 6);
        accApp.printThis(1, 2);
        accApp.printThat(3, 4);
    }
    
    //vgl zu Constructor
    public Access(){}
    
    public Access(int x, int y){
//        this.x = x;
//        this.y = y;
        x = x;
        y = y;
        System.out.println("x: " + this.x + " y: " + this.y);
    }
    
    public void printThis(int x, int y) {
        x = x;
        y = y;
        //System.out.println("x: " + this.x + " y: " + this.y); //x: 0 y: 0
        // Ohne Zuweisung keine Aktualisierung von x und y.
        
        System.out.println("x: " + x + " y: " + y); //x: 1 y: 2    
    }
    
    public void printThat(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x: " + this.x + " y: " + this.y);
    }
}
