package de.gfn.org.equalsStringChar;

/**
 *
 * @author student
 */
public class StringFromChar {
    
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };
        
        String newStr = null; // false false
     //   String newStr = nullo; // null ist halt doch null
     //   String newStr = ""; // Dann kommt es zu: false true
        
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }
        System.out.println("newStr: " + newStr);
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
        
    }
}
