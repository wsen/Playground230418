package de.gfn.oca.basics;

import static java.lang.System.out;
import static de.gfn.oca.basics.Buch.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.omg.CORBA.INV_OBJREF;


/**
 *
 * @author tlubowiecki
 */
public class Start {
    
    static String text = "Das ist ein kurzer Text";
    
    // psvm
    static public void main(String... args) {
        
        double d1 = 0.0/0.0;
        double d2 = 0.0/0.0;
        System.out.println(Double.isNaN(d1));
        
        //sout
        System.out.println(text);
        
//        ArrayList list = new ArrayList();
//        HashSet set = new HashSet();
//        LinkedList list2 = new LinkedList();
        
        Buch b = new Buch();
        b.machWas();
        System.out.println(b.kleinerText);
        System.out.println(b.titel);
        
        System.out.println("---------");
        
        machWasStatic();
        System.out.println(kleinerText);
        
        System.out.println("---------");
        
        //Buch b2 = new Buch("Java ist auch eine Insel");
        //System.out.println(b2.kleinerText);
        
        System.out.println("---------");
        
        //b2.kleinerText = "Neuer Text";
        System.out.println(b.kleinerText);
        out.println(Buch.kleinerText);
        
        String s5 = "Moin";
        
        s5 = s5 + " Hamburg";
        
        String s6 = new String("Moin");
        
        String[] arr3 = new String[10];
        
        Object[][][] arr4 = new Object[10][][];
        
        int arr8[] = new int[0];
        int arr9[] = new int[]{};
        
        int arr10[][] = new int[0][2];
        
        int arr1[] = new int[]{1};
        int arr2[] = new int[1];
        
        ArrayList<String> al = new ArrayList<>();
        
        Object[] oa = al.toArray();
        
        String[] sa = al.toArray(new String[0]);
        
        
        int i = 10;
        i *= 1.0;
        //i = i * 1.0;
        
        int i10 = 10;
        
        char s = "Moin".charAt(2);
        int p = "Moin".indexOf('i');
        String st = "123456789".substring(2);
        st = "123456789".substring(2,5);
        System.out.println(st);
        
        //st = "123456789".replace("456", '8');
        st = "123456789".replace("456", "8");
        System.out.println(st);
        
        st = "   123456789  ".trim();
        System.out.println("..." + st + "...");
        
        st.startsWith("X");
        st.endsWith("X");
        st.contains("xyz");
        
        String s10 = "dfjdfgsjdfg" + "fhgfkhfd";
        String s11 = "dfjdfgsjdfg".concat("fhgfkhfd");
        
        // StringBuilder
        
        StringBuilder sb = new StringBuilder(4);
        sb.append("1234");
        System.out.println(sb.capacity());
        sb.append("23456789");
        System.out.println(sb.capacity());
        
        //charAt
        //indexOf
        //substring
        
        //append
        //insert
        sb.insert(2, "hallo");
        System.out.println(sb.capacity());
        sb.delete(4, 10);
        System.out.println(sb.capacity());
        System.out.println(sb);
        
        System.out.println("----------");
        
        sb = new StringBuilder();
        sb.append("abcdefgh");
        //sb.trimToSize();
        sb.setLength(5);
        System.out.println(sb.capacity());
        System.out.println(sb);
        
        String s12 = sb.toString();
        
        System.out.println("----------");
        
        ArrayList<String> al5 = new ArrayList<>(10);
        //al5.add();
        
        
    }
}