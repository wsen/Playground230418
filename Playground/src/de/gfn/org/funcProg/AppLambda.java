package de.gfn.org.funcProg;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class AppLambda 
{
    public static void main( String[] args )
    {
        System.out.println( process("Hello World!", str -> str.toLowerCase()) );
    }

	private static String process(String str, Function<String, String> processor) {  //Function<T,R>
                                                                                        // T = String, R = String
		return processor.apply(str);
	}
}