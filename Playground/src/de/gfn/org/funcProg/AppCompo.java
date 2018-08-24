package de.gfn.org.funcProg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class AppCompo 
{
    public static void main( String[] args )
    {
    	final String prefix = "MR. ";
    	
        System.out.println( process("Hello World!", str -> {
        	
        	return prefix.concat(str);
        }) );
        
        System.out.println( process2("Hello World!", 5, String::substring));
        
        String[] names = {"Mr Sanjay", "Ms Trupti", "Dr John"};

        // Comparator Interface with method comparing, METHOD REFERENCE
        Arrays.sort(names, Comparator.comparing(AppCompo::firstName).reversed()
        );

        // Lambda YEAh
//        Arrays.sort(names, Comparator.comparing(name -> name.split(" ")[1])
//        );
        
//        Arrays.sort(names, new Comparator<String>(){
//                @Override
//                public int compare(String name1, String name2) {
//                    return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
//                }   
//        });
        
        // Without Comparator
//        Arrays.sort(names, (name1, name2) ->
//                name1.split(" ")[1].compareTo(name2.split(" ")[1])
//        );
//        
        System.out.println(Arrays.toString(names));
    }
    
    public static String firstName(String name) {
    	return name.split(" ")[1];
    }
    

	private static String process2(String str, int i,
			BiFunction<String, Integer, String> processor) {
		
		return processor.apply(str, i);
	}

	private static String process(String str, Function<String, String> processor) {
		
		return processor.apply(str);
	}
}