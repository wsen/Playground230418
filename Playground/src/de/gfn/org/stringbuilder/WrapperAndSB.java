package de.gfn.org.stringbuilder;

/**
 *
 * @author wsen
 */
class StringWrapper {
    private String theVal;
    public StringWrapper(String str) { this.theVal = str;}
}




public class WrapperAndSB {
    
    public static void main(String[] args) {
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, "+sw);
        System.out.println("Hello, "+sb);
        
        if("String".replace('g','G') == "String".replace('g','G')){
            System.out.println("TRUE");
        }//replace creates a new string object
        if("String".replace('g','g') == "String"){
            System.out.println("TRUE (replace(char oldChar, char newChar)");
        }//replace returns the same object if there is no change.
        if("String".replace("g","g") == "String"){
            System.out.println("TRUE (CharSequence oldSeq,  CharSequence newSeq)");
        }//replace returns a new object even if there is no change.
        
        System.out.println("--- TelNR ---");
        String fullPhoneNumber = "123-156-7899";
        System.out.println(new StringBuilder(fullPhoneNumber).substring(0, 8)+"xxxx");              //123-156-xxxx
        System.out.println(new StringBuilder(fullPhoneNumber).replace(8, 12, "xxxx").toString());   //123-156-xxxx
        //System.out.println(new StringBuilder(fullPhoneNumber).append("xxxx", 8, 12).toString());
        System.out.println(new StringBuilder("xxxx").append(fullPhoneNumber, 0, 8).toString());
        System.out.println(new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString());  //123-156-xxxx

    }
}

/* ==
There are 2 points to remember:
1. replace(char oldChar, char newChar) method returns the same String object if both the parameters are same, i.e. if there is no change. Thus, "String" == "String".replace('g', 'g') will return true.
2. replace(CharSequence oldSeq,  CharSequence newSeq) method returns a new String object even if there is no change after replacement. Thus, "String" == "String".replace("g", "g") will return false.
*/