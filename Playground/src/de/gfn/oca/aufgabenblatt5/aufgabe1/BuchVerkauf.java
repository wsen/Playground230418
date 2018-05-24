package de.gfn.oca.aufgabenblatt5.aufgabe1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author tlubowiecki
 */
public class BuchVerkauf {
    
    public static void main(String[] args) {
        
        Consumer<String> consumerTitel = titel -> System.out.println("Titel: " + titel);
        
        Consumer<Double> consumerPreis = preis -> System.out.println("Preis: " + preis);
        
        Predicate<KindleEdition> predicate1 = (KindleEdition buch) -> buch.getSeitenanzahl() < 750;
        
        Predicate<KindleEdition> predicate2 = (KindleEdition buch) -> buch.getSeitenanzahl() >= 750;
        
        Consumer<KindleEdition> consumer1 = (KindleEdition buch) -> buch.setPreis(buch.getPreis() - buch.getPreis() * 9/100);
        
        Consumer<KindleEdition> consumer2 = (KindleEdition buch) -> buch.setPreis(buch.getPreis() - buch.getPreis() * 12/100);
        
        BiConsumer<KindleEdition, Integer> consumer3 = (buch, prozent) -> buch.setPreis(buch.getPreis() - buch.getPreis() * prozent/100);
        
        
        
        String[] titelArray = {
            "Java 7 Übungsbuch Band I",
            "Java 7 Übungsbuch Band II", 
            "Android 4 Übungsbuch",
            "Servlets und JavaServer Pages"};
        
        KindleEdition[] buecher = new KindleEdition[titelArray.length];
        
        Double[] preisArray = {29.95, 29.95, 24.95, 16.95};
        
        Integer[] seitenArray = {806, 796, 454, 748};
        
        // Array buecher mit KindleEdition-Objekten belegen
        for(int i = 0; i < buecher.length; i++) {
             buecher[i] = new KindleEdition();
             // KindleEdition-Objekt mit Werten füllen
             buecher[i].setTitel(titelArray[i]);
             buecher[i].setPreis(preisArray[i]);
             buecher[i].setSeitenanzahl(seitenArray[i]);
        }
        
        for(int i = 0; i < buecher.length; i++) {
            buecher[i].anzeigeBuch();
        }
        
        // Änderung für Bücher mit weniger als 750 Seiten
        for(int i = 0; i < buecher.length; i++) {
            berechnePreisKindleEdition(buecher[i], predicate1, consumer1);
        }
        
        // Änderung für Bücher mit 750 Seiten oder mehr
        for(int i = 0; i < buecher.length; i++) {
            berechnePreisKindleEdition(buecher[i], predicate2, consumer2);
        }
        
        // Änderung für alle Bücher
        for(int i = 0; i < buecher.length; i++) {
            berechnePreisKindleEdition(buecher[i], predicate1, consumer3);
        }
        
        System.out.println("-------------");
        
        List<KindleEdition> buecherList = Arrays.asList(buecher);
        
        anzeigeAttributeMitConsumer(buecherList, consumerTitel, consumerPreis);
    }
    
    public static void berechnePreisKindleEdition (KindleEdition buch , Predicate<KindleEdition> predicate , Consumer<KindleEdition> consumer) {
        // Prüfung
        if(predicate.test(buch)) {
            // Änderung
            consumer.accept(buch);
        }
    }
    
    public static void berechnePreisKindleEdition (KindleEdition buch , Predicate<KindleEdition> predicate , BiConsumer<KindleEdition, Integer> consumer) {
        // Prüfung
        if(predicate.test(buch)) {
            // Änderung
            consumer.accept(buch, 9);
        }
        else {
            consumer.accept(buch, 12);
        }
    }

    public static void anzeigeAttributeMitConsumer(List<KindleEdition> liste , Consumer<String> consumer1 , Consumer<Double> consumer2) {
        for(KindleEdition buch : liste) {
            consumer1.accept(buch.getTitel());
            consumer2.accept(buch.getPreis());
        }
    }
}
