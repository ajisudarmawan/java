/**
 *
 * @author aji sudarmawan
 */
public class OperatorLogika {
public static void main(String[] args){
    int i = 0;
    int j = 11;
    boolean test= false;
    
    System.out.println("Logika AND");
    test = (i > 10) && (j > 8);
    System.out.println(test);
    System.out.println("Evaluation AND");
    test = (i > 10) & (j > 8);
    System.out.println(test);

    System.out.println("Logika OR");
    test = (i < 10) || (j > 8);
    System.out.println(test);
    System.out.println("Evaluation Or");
    test = (i < 10) | (j > 8);
    System.out.println(test);
    
    System.out.println("Evaluation Xor");
    boolean val1 = true;
    boolean val2 = true;
    System.out.println(val1 ^ val2);
    
    val1 = false;
    val2 = true;
    System.out.println(val1 ^ val2);
    
    val1 = false;
    val2 = false;
    System.out.println(val1 ^ val2);
    
    val1 = true;
    val2 = false;
    System.out.println(val1 ^ val2);
    
    System.out.println("Logika NOT");
    val1 = true;
    val2 = false;
    System.out.println(!val1);
    System.out.println(!val2);
    
    }    
}    

