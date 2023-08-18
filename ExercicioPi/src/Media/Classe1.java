package Media;

import javax.swing.*;
public class Classe1 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null,"Digite uma palavra: ");
        String b = JOptionPane.showInputDialog(null,"Digite outra palavra: ");
        if(a.equals(b)){
            String msg = "As duas palavras digitadas são iguais: " + a;
            JOptionPane.showMessageDialog(null, msg);
            System.exit(0);
        }else {
            String msg = "As duas palavras são diferentes " + a + " e " + b;
            JOptionPane.showMessageDialog(null, msg);
            System.exit(0);
        }
    }
}
