package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio09 {
    public static int conversorDias(int anos, int meses, int dias)
    {
        int totalDias = 0;
        int diasEmAno = 365;
        int diasEmMes = 30;
        totalDias = totalDias + anos * diasEmAno;
        totalDias = totalDias + meses * diasEmMes;
        totalDias = totalDias + dias;
        return totalDias;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anos;
        int meses;
        int dias;
        int totalDias;

        System.out.println("Informe sua idade em anos, meses e dias para calcular quantos dias você está vivo!");
        System.out.println("Anos");
        anos = scan.nextInt();
        System.out.println("Meses");
        meses = scan.nextInt();
        System.out.println("Dias");
        dias = scan.nextInt();
        totalDias = conversorDias(anos,meses,dias);
        System.out.println("Você viveu "+ totalDias + " dias");

    }

}
