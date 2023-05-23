import java.util.Scanner;

public class Exercicio02 {
    public static int somatoria(int n1) {
        int soma = 0;
        for (int i = n1; i > 0; i--) {
        soma = soma + i;
        }

    return soma;}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        int resultado;
        System.out.println("Informe um positivo número para a somatoria:");
        n1 = scan.nextInt();
        while (n1 < 0) {
            System.out.println("Informe um número positivo, por favor");
            n1 = scan.nextInt();
        }
        resultado = somatoria(n1);
        System.out.println("Resultado da somatoria: " + resultado);

    }
}
