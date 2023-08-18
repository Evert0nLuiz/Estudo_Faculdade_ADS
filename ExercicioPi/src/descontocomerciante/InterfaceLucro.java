package descontocomerciante;

import javax.swing.*;

public class InterfaceLucro {

    Produto produto = new Produto();
    CalculadoraLucro calculadoraLucro = new CalculadoraLucro();

    private String menustr = "=====Menu=====\n1-Executar\n2-Sair\nItem: ";

    public int menu(){

        return Integer.parseInt(JOptionPane.showInputDialog(null,menustr));
    }

    public void menuInput(int opcao){

        if(opcao == 1){
            produto.setNomeDoProduto(JOptionPane.showInputDialog(null,"Ler produto: "));
            produto.setValor(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do produto: ")));
            if(produto.getValor() < 20){
                calculadoraLucro.setLucro(produto.getValor()*calculadoraLucro.getLucroAlto());
            }else{calculadoraLucro.setLucro(produto.getValor()*calculadoraLucro.getLucroBaixo());}
            produto.setValor(produto.getValor() + calculadoraLucro.getLucro());
            JOptionPane.showMessageDialog(null,"Produto: " + produto.getNomeDoProduto() + "\nValor com Lucro: " + produto.getValor() + " \nValor do lucro: " + calculadoraLucro.getLucro());
        }else if (opcao == 2){
            System.exit(0);

        }else {
            JOptionPane.showMessageDialog(null,"ERRO 404");
        }
    }


}
