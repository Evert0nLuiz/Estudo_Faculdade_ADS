import java.util.Scanner;

public class Exercicio04 {
    public static int fatorial(int n1) {
        int fatorial = 1;
        for (int i = n1; i > 0; i--) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static int somatoria(int n1) {
        int soma = 0;
        for (int i = n1; i > 0; i--) {
            soma = soma + i;
        }

        return soma;
    }


    public static int divisao(int n1, int n2) {
        int divisaoResult;
        divisaoResult = n1 / n2;

        return divisaoResult;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        int resultadoSoma;
        int resultadoFatorial;
        int resultadoDivisao;
        System.out.println("Informe um positivo número para descobrir o resultado da divisão entre o fatorial e a somatoria dele: ");
        n1 = scan.nextInt();
        while (n1 < 0) {
            System.out.println("Informe um número positivo, por favor:");
            n1 = scan.nextInt();
        }
        resultadoSoma = somatoria(n1);
        System.out.println("Somatoria: " + resultadoSoma);
        resultadoFatorial = fatorial(n1);
        System.out.println("Fatorial: " + resultadoFatorial);
        resultadoDivisao = divisao(resultadoFatorial,resultadoSoma);
        System.out.println("Resultado da divisão do fatorial pela soma: " + resultadoDivisao);
    }
}

