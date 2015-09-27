/**
 *
 * @author aji sudarmawan
 */
public class Person {
    String name;
    String addressLine1;
    String addressLine2;
    String city;
    int age;
    
    public Person(){
        name = "tidak tahu";
        addressLine1 = "tidak diketahui";
        addressLine2 = "tidak diketahui";
        city = "tidak diketahui";
        age = 0;
    }
    
    public Person(String name, String addressLine1, String addressLine2, String city, int age){
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.age = age;
    }
    
    public void tampilkan(){
        System.out.println("nama : "+ this.name);
        System.out.println("alamat 1 :"+ this.addressLine1 );
        System.out.println("alamat 2 :"+ this.addressLine2 );
        System.out.println("umur : "+ this.age);
        System.out.println("kota : "+this.city);
    }
    
    public static void main(String[] args){
    
        Person objekAji = new Person();
        objekAji.tampilkan();
        
        Person objekAndi= new Person("andi","jln pajajaran", "Btr kemang","Bogor",30);
        objekAndi.tampilkan();
    
    
    }
}
