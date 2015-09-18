/**
 *
 * @author aji sudarmawan
 */
public class TesContinue {
public static void main(String[] args){
    int[] angka={1,2,3,4,5,6,7,8,9,10};
    
    for(int i=0; i < angka.length ; i++){
        if(angka[i] == 5){
            continue;            
        }      
        System.out.println(angka[i]);
    }
}    
}
