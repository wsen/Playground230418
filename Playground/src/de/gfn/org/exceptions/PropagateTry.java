package de.gfn.org.exceptions;

/**
 * Oracle Sierra Bates 342 Chapter 6: Flow Control and Exceptions
 *
 * @author wsen
 */
public class PropagateTry {

    public String reverse(String input) {

        try {
            String reverseStr = "";
            if (input.length() == 0) {
                throw new Exception("Da Schtring is fei lear");
            } else {

                for (int i = input.length() - 1; i >= 0; --i) {
                    reverseStr += input.charAt(i);
                }

            }
            return reverseStr;
        } catch (Exception e) {
            return null;
        }
    }

    public void doStuff() {
        try {
            // risky IO things
        } catch (IOException ex) {
            // can't handle it
            throw ex;  // Can't throw it unless you declare it
        }
    }

    public static void main(String[] args) {
        System.out.println(new PropagateTry().reverse("Halleluja"));
    }
}
