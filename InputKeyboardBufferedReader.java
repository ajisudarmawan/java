/**
 *
 * @author aji sudarmawan
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputKeyboardBufferedReader {
public static void main(String[] args){
    BufferedReader dataMasuk = new BufferedReader(new InputStreamReader(System.in));
    
    String nama = "";
    
    System.out.print("ketikan dikeyboard masukan nama anda : ");
    
    try{
        nama = dataMasuk.readLine();        
    }catch(IOException e){
        System.out.println("Error");
    }
    System.out.println("Hello " + nama + "!");
}        
}
