package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio15 {

    public static int potenciacao(int x, int z)
    {
        int num = x;
        for(int i = 1; i < z; i++)
        {
            num *= x;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int base;
        int resultadoPotenciacao;

        System.out.println("Informe o número para a potenciação");
        num = scan.nextInt();

        System.out.println("Informe a base para a elavação:");
        base = scan.nextInt();

        resultadoPotenciacao = potenciacao(num, base);

        System.out.println(num + " ^ " + base + " = " + resultadoPotenciacao);


    }
}
