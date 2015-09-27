/**
 *
 * @author aji sudarmawan
 */
public class Balok {
    int tinggi;
    int lebar;
    int panjang;
    
    public void tampilkanJudul(){
        System.out.println("Menghitung volume balok");
    }
    
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    
    public void setLebarDanPanjang(int lebar,int panjang){
        this.lebar = lebar;
        this.panjang = panjang;
    }
    
    public int getVolume(){
        return tinggi * lebar * panjang;
    }
            

public static void main(String[] args){

    Balok objekVolumeBalok = new Balok();
    objekVolumeBalok.tampilkanJudul();
    objekVolumeBalok.setTinggi(50);
    objekVolumeBalok.setLebarDanPanjang(5, 40);
    System.out.println("Jadi volumenya adalah : "+objekVolumeBalok.getVolume());
}

}
