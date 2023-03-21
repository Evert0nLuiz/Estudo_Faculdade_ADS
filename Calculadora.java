
import java.util.*;


public class NewClass {
    public static void main(String [] args)
    { 
       
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Me diga o primerio número");
        double n1 = scn.nextInt();
        System.out.print("Me diga qual operador irá utilizar\n"
                + "Soma: +"
                + "\nSubtração: - "
                + "\nMultiplicação: x"
                + "\nDivisão: / \n");
        String opera= scn.next().toLowerCase();
        System.out.println("Me diga o segundo número");
        
        double n2 = scn.nextInt();
        
        switch (opera){
            case "+":
                System.out.printf("O resultado de %.2f + %.2f = %.2f ", n1, n2, sum(n1,n2));
                break;
            case "-":
                System.out.printf("O resultado de %.2f - %.2f = %.2f ", n1, n2, sub(n1,n2));
                break;
            case "x":
              System.out.printf("O resultado de %.2f x %.2f = %.2f ", n1, n2, multi(n1,n2));
                break;
            case "/":
                if (n2 > 0);
                System.out.printf("O resultado de %.2f / %.2f = %.2f ", n1, n2, divi(n1,n2));
                break;
        }
    }
        
        
    public static double multi(double n1, double n2)
    {
        double res = n1 * n2;
        return res;
    }

    public static double sum(double n1, double n2)
    {      
      double res = n1 + n2;
      return res;
     
    }
    public static double divi(double n1, double n2)
    {      
      double res = n1 / n2;
      return res;
     
    }
    public static double sub(double n1, double n2)
    {      
      double res = n1 - n2;
      return res;
     
    }
}
