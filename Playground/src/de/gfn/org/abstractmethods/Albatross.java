package de.gfn.org.abstractmethods;

/**
 *
 * @author wsen
 */
abstract class SeaBird {

    public abstract void fly(int height);
}

public abstract class Albatross {

    abstract Long fly();
}

class AlbatrossConcrete extends Albatross {
    Long fly(){
        return 4L;
    }
    
    protected void fly(int height){  // hat nix mit der Methode fly in SeaBird zu tun.
        //-> und wird hier einfach neu definiert !!
    }
    
}