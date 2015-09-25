
/**
 *
 * @author aji sudarmawan
 * nama file : SubA.java
 * package : packageA
 */

package packageA;

public class SubA extends Base {
public void print(){
    System.out.println("packageA.SubA has access to");
    System.out.println(" "+publicStr+" (inherited from base)");
    System.out.println(" "+protectedStr+" (inherited from base)");
    System.out.println(" "+defaultStr+" (inherited from base)");
    
    Base b = new Base(); // other Base Instance
    System.out.println(" b."+b.publicStr);
    System.out.println(" b."+b.protectedStr);
    System.out.println(" b."+b.defaultStr);
}    
}
