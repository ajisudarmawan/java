/**
 *
 * @author aji sudarmawan
 */
public class PembagianOlehNolTryCatchFinally {
    public static void main(String[] args){
        
        try{
            int nol= 0;
            int pembagi = 10;
        
            int hasil = pembagi/nol;
        }
        catch(ArithmeticException e){
            //menangkap kesalahan pembagian dengan nol
            System.out.println("terjadi pembagian dengan nol");
        }
        finally{
            System.out.println("walaupun error program jalan terus");        
        }
            
    
    }
    
}
