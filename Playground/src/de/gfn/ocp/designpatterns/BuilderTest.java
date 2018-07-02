package de.gfn.ocp.designpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author tlubowiecki
 */
public class BuilderTest {
    
    public static void main(String[] args) {
        
        Stadt.Builder builder = new Stadt.Builder();
        Stadt pi = builder.setName("Pinneberg").build();
        Stadt b = builder.setName("Berlin").build();
        Stadt hh = builder.setName("Hamburg").build();
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
    
    static class Builder {
        
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
