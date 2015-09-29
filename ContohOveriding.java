/**
 *
 * @author aji sudarmawan
 * file name : ContohOveriding.java
 */

class Hewan{
    private String jenis;
    private int kaki;
    
    Hewan(){
    }
    
    Hewan(String jenis, int kaki){
        this.jenis = jenis;
        this.kaki = kaki;
    }
    
    public void bersuara(){
        System.out.print("suara hewan "+jenis+" berkaki "+kaki);
    }
}

class Anjing extends Hewan{
    Anjing(){ 
        super(); //overriden method
    }
    
    @Override
    public void bersuara(){ //overiding method
        System.out.println("guk guk guk....");
    }
}

class Kucing extends Hewan{
    Kucing(String jenis, int kaki){
        super(jenis, kaki); // overriden method
    }
    
    @Override
    public void bersuara(){//overriding method
        super.bersuara();// overriden method
        System.out.println("  miaaaow");
    }
}

public class ContohOveriding {
    public static void main(String[] args){
        Anjing objekDoggy = new Anjing();
        Kucing objekTom = new Kucing("Kucing", 4);
        objekDoggy.bersuara();
        objekTom.bersuara();
    }
}
