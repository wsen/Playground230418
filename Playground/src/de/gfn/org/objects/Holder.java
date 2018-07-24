package de.gfn.org.objects;

/**
 *
 * @author wsen
 */
class Holder{
   int value = 1;
   Holder link;
   public Holder(int val){ this.value = val; }
   public static void main(String[] args){
	final Holder a = new Holder(5);
	Holder b = new Holder(10);
	a.link = b;
	b.link = setIt(a, b);
	System.out.println(b.link.value);//+" "+b.link.value);
	//System.out.println(a.link.value+" "+b.link.value); //NullPointer Exceptino
   }
   
   public static Holder setIt(final Holder x, final Holder y){
       x.link = y.link;
       System.out.println("x.link " + x.link);
       System.out.println("x selber: " + x);
       return x;
   }
   
}
