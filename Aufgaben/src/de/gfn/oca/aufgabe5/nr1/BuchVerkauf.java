package de.gfn.oca.aufgabe5.nr1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;


/**
 * 
 * 
 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 * @author student
 */
public class BuchVerkauf {
    
    // just for Lern-FUN
    static void irgendwas (KindleEdition buch, Predicate<KindleEdition> predikatz){
        if(predikatz.test(buch)){
            buch.anzeigeBuch();
        }
            
    }

    // Buch, FührEinenTestDurch, AktionAufEinElement, 
    static void berechnePreisKindleEdition (KindleEdition buch , 
            Predicate<KindleEdition> predicate , Consumer<KindleEdition> consumer){
        
        if(predicate.test(buch)){  
            consumer = (y) -> 
            {
                y.setPreis(y.getPreis() * 0.88); //12% discount
            };    
        } else {
            consumer = (y) -> 
            {
                y.setPreis(Math.round(y.getPreis() * 0.91)); //9% discount
            };   
        }
        consumer.accept(buch);
        buch.anzeigeBuch();
    } 
    
    // wozu? kann noch nix damit anfangen 
    static void anzeigeAttributemitConsumer(List<KindleEdition> liste , 
            Consumer<String> consumer1 , Consumer<Double> consumer2) {
        
    }
   
    
    public static void main(String[] args) {
        String[] titelArray = {"Java 7 Übungsbuch I",
            "Java 7 Übungsbuch Band II", "Android 4 Übungsbuch",
            "Servlets und JavaServer Pages"};

        Double[] preisArray = {29.95, 29.95, 24.95, 16.95};

        Integer[] seitenArray = {806, 796, 454, 748};

        KindleEdition buecher[] = new KindleEdition[4];

        //System.out.println(buecher.length);

        for (int i = 0; i < buecher.length; i++) {
            buecher[i] = new KindleEdition();
            buecher[i].setTitel(titelArray[i]);
            buecher[i].setPreis(preisArray[i]);
            buecher[i].setSeitenanzahl(seitenArray[i]);
        }
                
        //berechnePreisKindleEdition (KindleEdition buch , Predicate<KindleEdition> predicate , Consumer<KindleEdition> consumer)
        for (int i = 0; i < buecher.length; i++) {
            KindleEdition.anzeigeEigenschaft(buecher[i].getTitel());
            KindleEdition.anzeigeEigenschaft(buecher[i].getPreis());
            berechnePreisKindleEdition(buecher[i], p -> p.getSeitenanzahl() > 750, (x)-> x.getPreis());
        }
        
        
    }
    
}
