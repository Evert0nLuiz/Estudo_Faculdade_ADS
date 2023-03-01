import java.util.Scanner;
public class Test2 
{
    public static void main(String args[]) 
    {
        Scanner scn = new Scanner(System.in);
        int[] valores ;
        valores = new int [5];
        int valor;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("Me diga um number");
            valores [i] = scn.nextInt();

            for( int p = 0; p < valores.length; p++)
            {
                if (maior < valores[p])
                    maior = valores[p] ;
            }
            for(int p = 0; p < valores.length; p++)
            {
                if (menor == 0)
                    menor = valores [p];
                    else if (menor > valores[p])
                      menor = valores[p];
            }
        }          
        System.out.println(maior);    
        System.out.println(menor);  

    }
 
