package de.gfn.ocp.enumsw;

/**
 *
 * @author student
 */
public class EnumTest {
    public static void main(String[] args) {
        //Wochentag w; 
        
        Wochentag w = Wochentag.DI;
        // System.out.println(w instanceof Wochentag.DI); //?
        
        System.out.println(w);
        
        //w = Wochentag.valueOf("Mittwoch");//IllegalArgumentExcepton
        w = Wochentag.valueOf("MI");//OK
        
        System.out.println(w.getDayOfWeekNum());
        
        Wochentag.DI. machWas();
        Wochentag.machWas();
        
        System.out.println(Wochentag.DI);
        System.out.println(Wochentag.MO);
        System.out.println(Wochentag.MO.name());
        
        System.out.println("-------------------");
        
        for(Wochentag w2 : Wochentag.values())
            System.out.println(w2);
        
        //SWITCH
        switch(w){
            case MO: System.out.println("..Montday");
            case DI: System.out.println("..Dienstday");
            default: 
        }
        
    }
}

enum Wochentag {  //sind implizit public static final
    //Typ: Wochentag
    //nicht zur (Laufzeit) erweiterbar
    //1//MO, DI, MI, DO, FR, SA, SO;
        
    MO(1) {
        @Override
        public String toString() {
            return "Furchtbar ...";
        }    
    }
    , DI(2), MI(3), DO(4), FR(5), SA(6), SO(7){}; //auch nach {} ein Semikolon
    
    //Was als inum möglich zu hinterlegen -> Konstruktoren definieren
    //Wird einmalig ausgeführt, d.h. Objekt gibt es nur ein einziges Mal, also jeweils ein Singleton
    // 1 Objekt pro Option
    // WEITERER KONKRETER CODE IMMER NACHFOLGEND (NACH ENUM)
    
//1//    private Wochentag(){
//        System.out.println("Constructor");
//    }
    private final int dayOfWeekNum;
    
    private Wochentag(int i){
        dayOfWeekNum = i;
    }
    
    public int getDayOfWeekNum(){
         return dayOfWeekNum;
    }
    
    public static void machWas(){   
    }
}

