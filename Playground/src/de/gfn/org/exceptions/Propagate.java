package de.gfn.org.exceptions;

/**
 * Oracle Sierra Bates
 * 342 Chapter 6: Flow Control and Exceptions
 * @author wsen
 */
public class Propagate {
    
    public String reverse (String input) throws Exception {
        if(input.length() == 0) 
            throw new Exception("Da Schtring is fei lear");
        else {
            String reverseStr = "";
            for(int i=input.length()-1;i>=0;--i) {
               reverseStr += input.charAt(i);
            }
            return reverseStr;
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(new Propagate().reverse(""));
    }
}


