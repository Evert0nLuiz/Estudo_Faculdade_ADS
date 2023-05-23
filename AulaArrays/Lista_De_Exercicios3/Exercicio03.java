import java.util.Scanner;

public class Exercicio03 {

        public static int fatorial(int n1) {
            int fatorial = 1;
            for (int i = n1; i > 0; i--) {
                fatorial = fatorial * i;
            }

            return fatorial;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n1;
            int resultado;
            System.out.println("Informe um positivo número para descobrir seu fatorial:");
            n1 = scan.nextInt();
            while (n1 < 0) {
                System.out.println("Informe um número positivo, por favor:");
                n1 = scan.nextInt();
            }
            resultado = fatorial(n1);
            System.out.println("Resultado do fatorial: " + resultado);
        }
    }

