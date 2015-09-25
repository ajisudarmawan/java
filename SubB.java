/**
 *
 * @author aji sudarmawan
 * nama file : SubB.java
 * package : packageB
 */

package packageB;
import packageA.Base;

public class SubB extends Base{
    public void print(){
        System.out.println("packageB.SubB has access to");
        System.out.println(" "+publicStr+" (inherited from Base)");
        System.out.println(" "+protectedStr+" (inherited from Base)");
        
        Base b = new Base();
        System.out.println("packageB.subB has access to");
        System.out.println(" b."+b.publicStr);
    }
    
}
