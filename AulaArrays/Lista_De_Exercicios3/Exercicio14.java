package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio14 {
    public static int somaIndex(int a, int n)
    {
        int resultadoSoma = a;
        int indexParaSoma = a;
        int contador = 0;
        for (int i = 1;i < n; i++)
        {
            indexParaSoma += 1;

            resultadoSoma = resultadoSoma + indexParaSoma;

        }

        return resultadoSoma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int a;
        int resultadoSoma;
        System.out.println("Informe um número e quantidade de passos para soma: ");
        System.out.println("Informe o número: ");
        a = scan.nextInt();
        System.out.println("Informe a quantidade de passos: ");
        n = scan.nextInt();

        resultadoSoma = somaIndex(a,n);
        System.out.println("A soma é: " + resultadoSoma);

    }
}
