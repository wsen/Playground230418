package de.gfn.org.lambda;

/**
 *
 * @author wsen
 */
interface Keys {
    String keypad(String region, int keys);
}

public class HandSet{
    static double price;// = 2.0;
    static String model;// = "hans";
    
    public static void main(String[] args) {
       
        Keys varKeys = (region, keys) -> {
            if (keys >= 32)
                return region;
            else
                return "default";
        };
        System.out.println(model + price + varKeys.keypad("AB", 32));
    }
}
