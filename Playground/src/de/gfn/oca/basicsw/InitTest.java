package de.gfn.oca.basicsw;
 * @author tlubowiecki
 */
class A {
    static {
        System.out.println("A Static");
    }
    {
        System.out.println("A");
    }
    A() {
        System.out.println("A Const");
    }
}

class B extends A {

    static {
        System.out.println("B Static");
    }

    {
        System.out.println("B");
    }

    B() {
        System.out.println("B const");

}

class C extends B {

    static {
        System.out.println("C Static");
    }

    {
        System.out.println("c");
    }

    C() {
        System.out.println("C const");
    }

    public static void main(String[] args) {
        new C();

    }

    private int getSortOrder(String firstName){
            //, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        final String lastName = "Hans";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id = 15;
                break;
        }
        return id;
    }
}
