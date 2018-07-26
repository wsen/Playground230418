package de.boya.ocp.accessmodif.cat;

/**
 *
 * @author student
 */
public class BobcatKitten extends Bobcat {
    public void findDen() {}            //Override
    public void findDen(boolean b) {}   //Overload
    public int findden() throws Exception { return 0; } //Different Method -> CaseSensitive
}
