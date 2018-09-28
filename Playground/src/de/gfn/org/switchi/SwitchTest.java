package de.gfn.org.switchi;

/**
 *
 * @author wsen
 */
public class SwitchTest {
    public static void main(String[] args) {
        //int condition; //needs to be initalized
        //int condition = 2; //ok
        //long condition = 2; //incompatible types -> Long nix für switch
        //Integer condition = new Integer("1"); //ok
        //String condition = "1"; //incompatible types
        Byte condition = 1; //ok




        switch( condition ){
            case 1  : System.out.println("1");   break;
            case 2  : System.out.println("2");   break;
            case 3 : System.out.println("3");  break;
        }
        
        String[][][] arr  ={{ { "a", "b" , "c"}, { "d", "e", null } },
            { {"x"}, null },
            {{"y"}},
            { { "z","p"}, {} }
      };
      System.out.println(arr[1][1]);
    }
}
