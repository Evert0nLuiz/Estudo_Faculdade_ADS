import java.util.Scanner;

public class Exercicio08 {
    public static boolean descobrirPrimo(int n)
    {
        boolean resultado = false;
        int contadorPrimo = 0;
        for (int i = 1;i <= n;i++)
        {
            if (n%i == 0) {
                contadorPrimo += 1;
            }
        }

        if (contadorPrimo == 2)
        {
            resultado = true;
        } else {
            resultado = false;
        }
    return resultado;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean resultado;
        System.out.println("Informe um número positivo para descobrir se é primo: ");
        n = scan.nextInt();

        while (n < 0)
        {
            System.out.println("Use apenas número positivos por favor:  ");
            n = scan.nextInt();

        }
        resultado = descobrirPrimo(n);

        if (resultado == true){
            System.out.println("A condição do número diante da caracteristica de primo é VERDADEIRA");
        }else {
            System.out.println("A condição do número diante da caracteristica de primo é FALSA");
        }

    }
}
