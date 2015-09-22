
/**
 *
 * @author aji sudarmawan
 */
import javax.swing.JOptionPane;


public class InputKeyboardJOptionPane {
public static void main(String[] args){
    String nama = "";
    nama = JOptionPane.showInputDialog("Masukan nama anda");
    
    String pesan = "Hello " + nama + "!";
    JOptionPane.showMessageDialog(null, pesan);
}    
}
