/**
 *
 * @author aji sudarmawan
 */
public class TestBreak {
    public static void main(String[] args){
     int angka[] = {123, 676, 100, 543, 102, 200, 175, 432 };
     
     int angkadicari = 102 ;
     boolean ditemukan = false;
     
     for( int i=0; i< angka.length; i++ ){
           if( angka[i] == angkadicari ){
               ditemukan = true;
               break;
            }
      }

      if( ditemukan ){
          System.out.println( angkadicari + " found!" );
      }
      else{
          System.out.println( angkadicari + " not found." );
      }
} 
}
