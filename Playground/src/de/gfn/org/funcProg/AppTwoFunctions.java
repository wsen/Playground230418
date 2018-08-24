package de.gfn.org.funcProg;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class AppTwoFunctions 
{
    public static void main( String[] args )
    {
    	String prefix = "MR. ";
    	
        System.out.println( process("Hello World!", prefix::concat) );
        System.out.println( process2("Hello World!", 5, String::substring));
    }

	private static String process2(String str, int i,
			BiFunction<String, Integer, String> processor) { // BiFunction<T,U,R>
		
		return processor.apply(str, i);
	}

	private static String process(String str, Function<String, String> processor) { //Function<T,R>
		
		return processor.apply(str);
	}
}