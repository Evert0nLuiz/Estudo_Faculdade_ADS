package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio11 {
    public static String conceitoDeNotas(double mediaFinal)
    {
         String conceito;
         boolean conceitoD = mediaFinal >= 0.0 && mediaFinal <=4.9;
         boolean conceitoC = mediaFinal >= 5.0 && mediaFinal <= 6.9;
         boolean conceitoB = mediaFinal >= 7.0 && mediaFinal <=8.9;
         boolean conceitoA = mediaFinal >= 9.0 && mediaFinal <= 10;
        if(conceitoD){
            conceito = "D";
        }else if(conceitoC){
            conceito = "C";

        }else if (conceitoB){
            conceito = "B";

        }else {
            conceito = "A";
        }


        return conceito;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String conceitoFinal;
        double mediaFinal;

        System.out.println("Informe sua media final para conversão em conceitos: ");
        mediaFinal = scan.nextDouble();

        conceitoFinal = conceitoDeNotas(mediaFinal);

        System.out.println("O conceito da sua media é: " + conceitoFinal);


    }
}
