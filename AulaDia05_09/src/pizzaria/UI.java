package pizzaria;

import java.util.*;

public class UI {
    static Scanner ler = new Scanner(System.in);

    public void apresentarPrograma() {
        escrever("##### PROGRAMA DA PIZZARIA #####\n");
    }

    public void escrever(String msg, Object... values) {
        System.out.printf(msg+"\n", values);
    }

    public double pedirDouble(String msg, Object... values) {
        System.out.printf(msg, values);
        double valor = ler.nextDouble();
        return valor;
    }

    public int pedirInt(String msg, Object... values) {
        System.out.printf(msg, values);
        int valor = ler.nextInt();
        return valor;
    }

    public String pedirTexto(String msg, Object... values) {
        System.out.printf(msg, values);
        String valor = ler.nextLine();
        return valor;
    }

    public void pularLinha() {
        System.out.println();
    }



    public void exibirCompra(String cliente, String telefone, String endereco, String[] itens, double[] precos, double total, int codPedido) {
        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("    COMPRA REALIZADA!");
        escrever("=========================");

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("         ITENS");
        escrever("=========================");

        for (int i = 0; i < itens.length; i++) {
            escrever("%s  R$ %.2f ", itens[i], precos[i]);
        }

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("    TOTAL DA COMPRA");
        escrever("=========================");
        escrever("R$ %.2f", total);

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("        ENTREGA");
        escrever("=========================");
        escrever("  Código: %d", codPedido);
        escrever(" Cliente: %s", cliente);
        escrever("Telefone: %s", telefone);
        escrever("Endereço: %s", endereco);

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("          FIM");
        escrever("=========================");
        pularLinha();
        pularLinha();
        pularLinha();
    }
}

