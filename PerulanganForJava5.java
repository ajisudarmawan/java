/**
 *
 * @author aji sudarmawan
 */
public class PerulanganForJava5 {
public static void main(String[] args){
    
    int[] angka ={10,20,30,40,50};
    
    for(int x : angka){
        System.out.print(x);
        System.out.print(",");
    }
    
    System.out.print("\n");
    
    String[] namaMahasiswa={"aji","budi","laura","reza","Tomy"};
    
    for(String nama : namaMahasiswa ){
        System.out.print(nama);
        System.out.print(",");
    
    }
  }    
}
