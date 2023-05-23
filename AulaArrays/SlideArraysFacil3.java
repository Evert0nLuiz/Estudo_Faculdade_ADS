import java.util.Scanner;

public class SlideArraysFacil3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroEscolhido;
        int lista[];
        int tamanhoArray;
        int nLeitura;
        System.out.println("Informe o tamanho da array:");
        tamanhoArray = scan.nextInt();
        lista = new int [tamanhoArray];
        System.out.println("Informe o número a ser procurado:");
        numeroEscolhido = scan.nextInt();

        for (int i = 0; i < lista.length;i++)
        {
            System.out.println("Informe o número a ser adicionado:");
            nLeitura = scan.nextInt();

            lista [i] = nLeitura;
        }
        for (int i = 0; i < lista.length;i++)
        {

            if(lista[i] == numeroEscolhido)
            {
                System.out.println("O número escolhido está na posição: " + i);
            }
        }

    }
}