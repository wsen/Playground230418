package de.gfn.oca.lambda;

/**
 *
 * @author Administrator
 */
public class RechnerTest {
    
    public static void main(String[] args) {
        
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation multi = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;
        
        System.out.println(rechne(10, 25, sub));
    }
    
    public static int rechne(int a, int b, MathOperation o) {
        return o.op(a, b);
    }
}

interface MathOperation {
    int op(int a, int b);
}
