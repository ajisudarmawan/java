/**
 *
 * @author aji sudarmawan
 * file name : TesAbstract.java
 */

abstract class MakhlukHidup{
    public void bernafas(){
        System.out.println("Makhluk hidup pasti bernafas");
    }
    
    public void makan(){
        System.out.println("Pasti makan, tapi");
    }
    
    public abstract void berjalan();
}

class Manusia extends MakhlukHidup{
    
    public Manusia(){
        System.out.println("Manusia juga");
    }

    @Override
    public void berjalan() {
        System.out.println("Manusia berjalan dengan 2 kaki");
    }
}

class Kambing extends MakhlukHidup{
    
    public Kambing(){
        System.out.println("Kambing juga");
    }

    @Override
    public void berjalan() {
        System.out.println("Kambing berjalan dengan 4 kaki");
    }
}

public class TesAbstract {
    public static void main(String[] args){
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        manusia.berjalan();
       
        
        
        Kambing kambing = new Kambing();
        kambing.bernafas();
        kambing.makan();
        kambing.berjalan();
    }
    
    
}
