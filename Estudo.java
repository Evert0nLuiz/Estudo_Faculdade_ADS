import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        int n1;
        int n2;
        int res;
        Scanner scn = new Scanner(System.in);

        System.out.print("Write a number for a sum: ");
        n1 = scn.nextInt();
        
        System.out.print("Write a new number: ");
        n2 = scn.nextInt();
        
        res = n1 + n2;

        System.out.printf("This is the result: %d\n", res);

    }
}