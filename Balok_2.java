/**
 *
 * @author aji sudarmawan
 */
public class Balok_2 {
    private int tinggi;
    private int lebar;
    private int panjang;
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public int getVolume(){
        return tinggi*lebar*panjang;
    }
    
    public static void main(String[] args){
        Balok_2 objekBalok= new Balok_2();
        objekBalok.setLebar(12);
        objekBalok.setTinggi(30);
        objekBalok.setPanjang(100);
        
        //menampilkan
        System.out.println("lebar balok adalah : "+objekBalok.getLebar());
        System.out.println("tinggi balok adalah: "+objekBalok.getTinggi());
        System.out.println("panjang balok adalah: "+objekBalok.getPanjang());
        System.out.println("Volume balok adalah: "+objekBalok.getVolume());
        
    }
}
