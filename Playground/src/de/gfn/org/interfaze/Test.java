package de.gfn.org.interfaze;

/**
 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html#jls-12.4.1
 * @author wsen
 */
interface II {
    int i = 1, ii = Test.out("ii", 2);
}
interface J extends II {
    int j = Test.out("j", 3), jj = Test.out("jj", 4);
}
interface K extends J {
    int k = Test.out("k", 5);
}
class Test {
    public static void main(String[] args) {
        System.out.println(J.i);
        System.out.println(K.j);
    }
    static int out(String s, int i) {
        System.out.println(s + "=" + i);
        return i;
    }
}


/*
1
j=3
jj=4
3
*/