/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.designpatternsw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author wsen
 */
public class BuilderTest {
    
    public static void main(String[] args) {
        Stadt.Builder builder = new Stadt.Builder();
        builder.setFlaeche(100)
                .setBuerger(Arrays.asList("Peter", "Max"))
                .setName("Pinnneberg")
                ; //2tes setName hier möglich // String ist immutable
        
        Stadt pi = builder.build();
        
        builder.setName("Berling");
        Stadt b = builder.build();
        
        //alternativ
        Stadt hh = builder.setName("Hamburg").build();
        
        // Locale.Builder
        // Builder kann auch eine extra Klasse sein
                
    }
    
}


class Stadt {
    
    final private String name;
    final private int flaeche;
    final private int einwohner;
    final private List<String> buerger = new ArrayList<>();

    public Stadt(String name, int flaeche, int einwohner, List<String> buerger) {
        this.name = name;
        this.flaeche = flaeche;
        this.einwohner = einwohner;
        this.buerger.addAll(buerger);
    }

    public String getName() {
        return name;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public int getEinwohner() {
        return einwohner;
    }
    
    //Builder als innere Klassen benutzt
    static class Builder {  // muss statisch sein
        private String name = "Unbekannt";
        private int flaeche = 0;
        private int einwohner = 0;
        private List<String> buerger = new ArrayList<>();

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlaeche(int flaeche) {
            this.flaeche = flaeche;
            return this;
        }

        public Builder setEinwohner(int einwohner) {
            this.einwohner = einwohner;
            return this;
        }

        public Builder setBuerger(List<String> buerger) {
            this.buerger.addAll(buerger);
            return this;
        }
        
        public Stadt build() {
            return new Stadt(name, flaeche, einwohner, buerger);
        } 
    }
}
