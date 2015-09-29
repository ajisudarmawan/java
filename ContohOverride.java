/**
 *
 * @author aji sudarmawan
 * nama file : ContohOverride.java
 */

class ClassOrangTua{
    void display(int dataInduk){
        System.out.println("Pada kelas Induk: "+ dataInduk);
    }
}

class ClassAnak extends ClassOrangTua{
    void display(int dataAnak){
        System.out.println("Pada kelas anak: "+ dataAnak);
    }
} 

public class ContohOverride {
    public static void main(String[] args){
        ClassAnak objekClassAnak = new ClassAnak();
        ClassOrangTua objekClassOrangTua = new ClassOrangTua();
        objekClassAnak.display(1);
        objekClassOrangTua.display(2);
    }
}
