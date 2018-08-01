package de.gfn.ocp.localization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author tlubowiecki
 */
public class ResourceBundleTest1 {

    public static void main(String[] args) {

        
        Locale.setDefault(Locale.KOREA);
        ResourceBundle rb = ResourceBundle.getBundle("de.gfn.ocp.localization.test", Locale.CHINA);

//        System.out.println(rb.getString("text1"));
//        System.out.println(rb.getString("text2"));
//        System.out.println(rb.getString("text3"));

        rb.keySet().forEach(k -> System.out.println(rb.getString(k)));
        
        System.out.println("------------");
        
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "geheim");
        props.keySet().forEach(k -> System.out.println(props.getProperty((String)k)));
        
        System.out.println("------------");
        
        ResourceBundle rb2 = ResourceBundle.getBundle("de.gfn.ocp.localization.TextBundle", Locale.GERMAN);
        System.out.println(rb2.getString("k1"));
        
        
        
    }
}
