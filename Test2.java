import java.util.Scanner;
public class Test2
{
  public static void main(String[] args)
  {
    int[] maiorMenorArray;
    maiorMenorArray = new int[5];
    
    int maior;
    int menor;
    
    Scanner scn = new Scanner(System.in);
    
    for (int i = 0; i < maiorMenorArray.length; i++)
    {
      System.out.println("Adicione um número pada fazer a comparação");
      maiorMenorArray[i] = scn.nextInt();
    }
    for (int i = 0; i < maiorMenorArray.length; i++)
    {
      System.out.println(maiorMenorArray[i]);
    }
  }
}