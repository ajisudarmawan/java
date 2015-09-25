/**
 *
 * @author aji sudarmawan
 * nama file : Base.java
 * package : packageA
 */

package packageA;

public class Base {
   public String publicStr="public String";
   protected String protectedStr="protected String";
   String defaultStr="default String";
   private String privateStr="private String";
   
   public void print(){
       System.out.println("packageA.Base has access to");
       System.out.println(" "+publicStr);
       System.out.println(" "+protectedStr);
       System.out.println(" "+defaultStr);
       System.out.println(" "+privateStr);
   
   Base b = new Base();
       System.out.println(" b."+b.publicStr);
       System.out.println(" b."+b.protectedStr);
       System.out.println(" b."+b.defaultStr);
       System.out.println(" b."+b.privateStr);
   
   }
}
