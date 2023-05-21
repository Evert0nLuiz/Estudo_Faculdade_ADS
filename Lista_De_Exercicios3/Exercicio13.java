package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio13 {
    public static int divisoresDeN (int n){
        int contadorDivisores = 0;

        for(int i = 1; i <= n; i++){
            if (n % i == 0)
            {
                contadorDivisores = contadorDivisores + 1;
            }
        }

        return contadorDivisores;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numeroDeEntrada;
        int resultadoDivsores;
        System.out.println("Informe um número positivo para saber seus divisores até ele mesmo: ");
        numeroDeEntrada = scan.nextInt();

        resultadoDivsores = divisoresDeN(numeroDeEntrada);
        System.out.println("Esse número tem " + resultadoDivsores + " divisores");
    }
}
