package Media;

import javax.swing.*;
public class Interface {

    JOptionPane janelaPopUp = new JOptionPane();
    Aluno aluno = new Aluno();

    private String menustr = "=====Menu Média=====\n1-Ler\n2-Calcula\n3-Exibir \n4-Sair\n";


    public void menu(){

        JOptionPane.showMessageDialog(null,menustr);

    }
    public int menuSelecao(){

        return Integer.parseInt(JOptionPane.showInputDialog(null,menustr));
    }

    public void fazCoisas(int opcao)
    {
        switch (opcao){
            case 1:
                 aluno.setNome(JOptionPane.showInputDialog(null,"Insira o nome do aluno: "));
                 aluno.setNota1(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira A nota 1: ")));
                 aluno.setNota2(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira A nota 2: ")));
                 break;
            case 2:
                aluno.setMedia();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"A nota é: " + aluno.getMedia());
                break;
            default:
                System.exit(0);
        }
    }




}
