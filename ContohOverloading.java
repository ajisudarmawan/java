/**
 *
 * @author aji sudarmawan
 * file name : ContohOverloading.java
 */
public class ContohOverloading {
    String nama;
    int umur;
    
    public void tampilkanData(){
        System.out.println("method pertama");
        System.out.println("Karena tidak ada parameter, jadi kalimat ini ditampilkan");
    }
    
    public void tampilkanData(String nama){
        this.nama=nama;
        System.out.println("method ke dua");
        System.out.println("Nama saya : "+ this.nama);
    }
    
    public void tampilkanData(int umur){
        this.umur=umur;
        System.out.println("method ketiga");
        System.out.println("Umur saya : "+this.umur);
    }
    
    public void tampilkanData(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        System.out.println("method keempat");
        System.out.println("Nama saya: "+this.nama+" Umur saya : "+this.umur);
    }

public static void main(String[] args){
    String nama = "aji";
    int umur = 33;
    
    ContohOverloading objekContohOverloading = new ContohOverloading();
    objekContohOverloading.tampilkanData();
    objekContohOverloading.tampilkanData(nama);
    objekContohOverloading.tampilkanData(umur);
    objekContohOverloading.tampilkanData(nama, umur);
}

}
