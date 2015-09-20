/**
 *
 * @author aji sudarmawan
 */
public class TestArray {
public static void main(String args[]) {

        System.out.println("Cara 1");
    String nama[] = {"Aji", "Dani", "adot", "indra"};


      for (int i = 0; i < nama.length; i++) {
         System.out.println(nama[i] + " ");
      }
    
    
    System.out.println("Cara 2");
    double[] myList = {1.9, 2.9, 3.1, 3.2};


      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
    
    
    System.out.println("Cara 3");
    
    int nilai[]=new int[3];
    nilai[0]=60;
    nilai[1]=70;
    nilai[2]=55;
    double ratarata=0.0;
    for(int i=0; i<nilai.length; i++){ 
        ratarata+=nilai[i];
    }
    
    ratarata/=nilai.length;
    System.out.println("Nilai rata-rata = " + ratarata);





}    
}
