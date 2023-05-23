package Lista_De_Exercicios3.src;

import java.util.Scanner;

public class Exercicio10 {
    public static String classificadorNadador(int idade)
    {
        boolean infantilA = (idade >= 5 && idade <= 7);
        boolean infantilB = (idade >= 8 && idade <= 10);
        boolean juvenilA = (idade >= 11 && idade <= 13);
        boolean juvenilB = (idade >= 14 && idade <= 17);
        boolean adulto = (idade >= 18);

        String classificacao;
        if(infantilA) {
            classificacao = "Infantil A";
        }else if (infantilB){
            classificacao = "Infantil B";
        }else if (juvenilA){
            classificacao = "Juvenil A";
        } else if (juvenilB) {
            classificacao = "Juvenil B";
        }else if (adulto) {
            classificacao = "Adulto";
        }else {
            classificacao = "Sem classificação";
        }

      return classificacao;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        String classificacao;
        System.out.println("Informe sua idade para sua classificação de nadador: ");
        idade = scan.nextInt();
        while(idade < 0){
            System.out.println("Idade invalida, tente novamente: ");
            idade = scan.nextInt();
        }
        classificacao = classificadorNadador(idade);
        System.out.println("Sua classificação é: " + classificacao);
    }
}
