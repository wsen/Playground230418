package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
class Building {}

public class Barn extends Building {
    public static void main(String[] args) {
        Building build1 = new Building();
        Barn barn1 = new Barn();
        Barn barn2 = (Barn) build1; //7
        Object obj = (Object) build1;//8
        //String str1 = (String) build1;//9
        Building build2 = (Building) barn1;//10
    }
}
/*Ergebnis:
C ist korrekt - erst Zeile 9 wird einen Kompilierfehler erzeugen, da die Syntax der Zeilen 7 und 8 zwar korrekt ist, aber erst in der JVM eine RuntimeExpection geworfen wird;
Zeile 10 würde korrekt funktionieren.*/