/**
 *
 * @author aji sudarmawan
 * nama file : AnotherB.java
 * package : packageB
 */



package packageB;
import packageA.Base;

public class AnotherB {
    public void print(){
        System.out.println("packageB.AnotherB has access to");
        Base b = new Base();
        System.out.println(" b."+b.publicStr);
    }
}
