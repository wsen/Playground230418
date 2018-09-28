package de.gfn.org.exceptions;
import java.io.*;
/**
 *
 * @author wsen
 */
class Great {
    public void doStuff() throws IOException{
    }    
}

class Amazing extends Great { 
  public void doStuff() throws IllegalArgumentException, FileNotFoundException{
  }    
}

public class JavaSubClassExceptioning {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
          //((Amazing) g).doStuff(). //Was ist das? Oberschwachsinn?
          
//        boolean b1 = false;
//        boolean b2  = false;
//        if (b2 = b1 == false){
//           System.out.println("true");
//        } else{
//           System.out.println("false");
//        }
//        
//        System.out.println("------ChainedStringBuilder Methods-----");
//        String s = "blooper";
//        StringBuilder sb = new StringBuilder(s);
//
//        sb.append(s.substring(4)).delete(3, 5);
//        System.out.println(sb);
    }
}

