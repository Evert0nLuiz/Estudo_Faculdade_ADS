import java.util.*;

public class Exercicio5 {
   public static void main(String[] args) {
    float medida1;
    float medida2;
    float medida3;
    Scanner scan = new Scanner(System.in); 
 
    System.out.println("Me diga o comprimento do lado do triângulo");
    medida1 = scan.nextFloat();
    medida2 = scan.nextFloat();
    medida3 = scan.nextFloat();

    if (medida1 == medida2 && medida2 == medida3)
    {
        System.out.println("É um triângulo equilátero");

    }else if(medida1 == medida2 || medida2 == medida3)
    {
        System.out.println("É um triângulo isósceles");
    }else
    {
        System.out.println("É um triângulo escaleno");
    }
    

   }
}
