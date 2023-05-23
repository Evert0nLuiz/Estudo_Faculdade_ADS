package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio12 {
    public static double pesoIdeal(double altura, int sexo)
    {
        double pesoFinalCalculo;
            if(sexo == 1) {
                pesoFinalCalculo = 72.7 * altura -58;}
            else if (sexo == 2) {
                pesoFinalCalculo = 62.1 * altura - 44.7;}
            else {
                pesoFinalCalculo = 0;
            }


        return  pesoFinalCalculo;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sexoUser;
        double altura;
        double pesoIdeal;
        System.out.println("Descubra seu peso ideal!!");
        System.out.println("Informe seu sexo\n(1) - MASCULINO\n(2) - FEMININO");
        sexoUser = scan.nextInt();
        while (sexoUser < 1 || sexoUser > 2)
        {
            System.out.println("Opção invalida!");
            System.out.println("Informe seu sexo\n(1) - MASCULINO\n(2) - FEMININO");
            sexoUser = scan.nextInt();
        }
        System.out.println("Informe sua altura");
        altura = scan.nextDouble();
        pesoIdeal = pesoIdeal(altura, sexoUser);
        System.out.println("Seu peso ideal é: " + pesoIdeal);

    }
}
