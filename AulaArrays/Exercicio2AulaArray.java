import java.util.Scanner;

public class Exercicio2AulaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int lista[];
        int tamanhoArray;
        int nLeitura;
        System.out.println("Informe o tamanho da array:");
        tamanhoArray = scan.nextInt();
        lista = new int [tamanhoArray];

        for (int i = 0; i < lista.length;i++)
        {
            System.out.println("Informe o número a ser adicionado:");
            nLeitura = scan.nextInt();

            lista [i] = nLeitura;
        }
        for (int i = 0; i < lista.length;i++)
        {
            soma = soma + lista[i];
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
