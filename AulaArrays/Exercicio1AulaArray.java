import java.util.Scanner;

public class Exercicio1AulaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lista [];
        int contador = 0;
        int maiorValor = 0;
        int menorValor = 1;
        String continuar = "";
        int n;

        System.out.println("informe a quantidade de números a serem adicionados: ");
        contador = scan.nextInt();

        lista = new int[contador];

        for(int i = 0; i < lista.length; i++){



            System.out.println("Informe o número a ser adicionado: ");
            n = scan.nextInt();
            lista[i] = n;


        }
        for (int i = 0; i < lista.length;i++)
        {
            if(lista[i] > maiorValor )
            {
                maiorValor = lista[i];
            }
            if(lista[i] < menorValor)
            {
                menorValor = lista[i];
            }
        }

        System.out.println("O maior número é: " + maiorValor);
        System.out.println("O maior número é: " + menorValor);

    }
}