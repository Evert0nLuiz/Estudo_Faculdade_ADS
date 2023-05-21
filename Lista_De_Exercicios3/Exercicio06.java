import java.util.Scanner;

public class Exercicio06 {
    public static double bhaskara(double a, double b, double c, int maiorOuMenor) {
        double maiorRaiz = 1;
        double raizSoma;
        double raizSubtracao;
        double delta;
        delta = (Math.pow(b, 2) - 4 * a * c);

        if (delta >= 0) {
            raizSoma = (-b + (Math.sqrt(delta))) / (2 * a);
            raizSubtracao = (-b - (Math.sqrt(delta))) / (2 * a);

           switch (maiorOuMenor) {
               case 1:
                   if (raizSoma >= raizSubtracao) {
                    maiorRaiz = raizSoma;
                    }  else {
                       maiorRaiz = raizSubtracao;
                            }
                   break;

               case 2:
                   if (raizSoma < raizSubtracao) {
                       maiorRaiz = raizSoma;

                   } else {
                       maiorRaiz = raizSubtracao;
                   }
                   break;

           }
        } else {
            maiorRaiz = -1;
        }

        return maiorRaiz;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double c;
        double resultado;
        int escolhaMaiorMenor;

        System.out.println("Calculadora de equação de segundo grau");
        System.out.println("Você quer descobrir a maior raiz ou a menor");
        escolhaMaiorMenor = scan.nextInt();

        System.out.println("Agora indique os números da equação:");
        System.out.println("Informe o A da equação: ");
        a = scan.nextDouble();

        System.out.println("Informe o B da equação: ");
        b = scan.nextDouble();

        System.out.println("Informe o C da equação: ");
        c = scan.nextDouble();

        scan.close();

        resultado = bhaskara(a, b, c,escolhaMaiorMenor);

        switch (escolhaMaiorMenor){
            case 1:
                System.out.println("A maior raiz é: " + resultado);
            case 2:
                System.out.println("A menor raiz é: " + resultado);

        }



    }
}
