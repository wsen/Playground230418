package de.gfn.oca.aufgabe5.nr1;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class BuchVerkauf {

    public static void main(String[] args) {
        String[] titelArray = {"Java 7 Übungsbuch I",
            "Java 7 Übungsbuch Band II", "Android 4 Übungsbuch",
            "Servlets und JavaServer Pages"};

        Double[] preisArray = {29.95, 29.95, 24.95, 16.95};

        Integer[] seitenArray = {806, 796, 454, 748};

        KindleEdition buecher[] = new KindleEdition[4];

        System.out.println(buecher.length);

        for (int i = 0; i < buecher.length; i++) {
            buecher[i] = new KindleEdition();
            buecher[i].setTitel(titelArray[i]);
            buecher[i].setPreis(preisArray[i]);
            buecher[i].setSeitenanzahl(seitenArray[i]);
            
            System.out.println("und hier Die Bücher: \n" +
            buecher[i].getTitel() + "\n" + 
            buecher[i].getPreis() + "\n" + 
            buecher[i].getSeitenanzahl() + "\n"
            );
        }
    }
}
