import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int angulo1;
        int angulo2;
        int angulo3;
 
        Scanner scan = new Scanner(System.in);

        angulo1 = scan.nextInt();
        angulo2 = scan.nextInt();
        angulo3 = scan.nextInt();

   

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
            System.out.println("É um triângulo Retângulo");
        }else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90)
        {
            System.out.println("É um triângulo Obtusângulo");
        }else if(angulo1 < 90 || angulo2 < 90 || angulo3 < 90)
        {
            System.out.println("É um triângulo Acutângulo");
        }

    }
}
