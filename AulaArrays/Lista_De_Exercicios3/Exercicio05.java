import java.util.Scanner;

public class Exercicio05 {
    public static double bhaskara (double a, double b, double c)
    {
        double maiorRaiz;
        double raizSoma;
        double raizSubtracao;
        double delta;

        delta = (Math.pow(b,2) - 4 * a * c);
        if (delta >= 0) {
            raizSoma = (-b + (Math.sqrt(delta))) / (2 * a);
            raizSubtracao = (-b - (Math.sqrt(delta))) / (2 * a);
            if (raizSoma > raizSubtracao) {
                maiorRaiz = raizSoma;
            } else {
                maiorRaiz = raizSubtracao;
            }
        }else
        {
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

        System.out.println("Calculadora de equação de segundo grau");
        System.out.println("Descubra a maior raiz:");
        System.out.println("Informe o a da equação: ");
        a = scan.nextDouble();
        System.out.println("Informe o b da equação: ");
        b = scan.nextDouble();
        System.out.println("Informe o c da equação: ");
        c = scan.nextDouble();

        scan.close();

        resultado = bhaskara(a,b,c);

        System.out.println("A maior raiz é: " + resultado);



    }
}
