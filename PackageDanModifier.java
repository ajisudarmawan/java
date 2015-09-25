/**
 *
 * @author aji sudarmawan
 * nama file : PackageDanModifier.java
 * package : packagedanmodifier
 */

package packagedanmodifier;
import packageA.*;
import packageB.*;

public class PackageDanModifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Base().print();
        new SubA().print();
        new AnotherA().print();
        new AnotherB().print();
        new SubB().print();
    }
    
}
