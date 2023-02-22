
import java.util.Scanner;
public class TestInCell
 {
   public static void main(String args[])
   { 
    Scanner entry = new Scanner(System.in);
    int n1;
    int n2;
    int sum;
    int mult;
    int div;
    int sub;
    
    System.out.print("Me fale um número inteiro para começarmos a soma: ");
    n1 = entry.nextInt();
    
    System.out.print("O segundo número para a soma: ");
    n2 = entry.nextInt();
    
    sum = n1 + n2;
    mult = n1 * n2;
    div = n1 / n2;
    sub = n1 - n2;
    
    System.out.printf("\nSoma dos números: %d\n", sum);
    System.out.printf("Subtração dos números: %d\n", sub);
    System.out.printf("Produto da Multiplicação dos números: %d\n", mult);
    System.out.printf("O resto da Divisão dos números é: %d\n", div);
    
   }
 }
