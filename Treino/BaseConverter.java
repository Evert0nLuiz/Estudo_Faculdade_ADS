import java.util.Scanner
public class BaseConverter
{

    public static void main(Stringm [] args)
    {
        Scanner scn = new Scanner(System.in);

        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int n = scn.nextInt();
        int res = getValue(n, b1, b2);

        System.out.print(res);


    }
    public static int getValue( int n,int b1,int b2)
    {
        int dec = anyBaseToDecimal(n, b1);
        int dest = decimalToAnyBase(dec,b2);
        return dest;
    }
    public static int anyBaseToDecimal(int n, int b1)
    {
        int dn = 0;
        int pow = 0;
        
        while (n > 0)
        {
            int rem = n%10;
            dn += rem*Math.pow(b1,pow);
            pow += 1;
            n /= 10;
        }
        return dn;
    }
    public static int decimalToAnyBase(int dec, int b2)
    {
        int dest = 0;
        int pow = 0;
        while (dec > 0)
        {
            int rem = dec%b2;
            dest += rem*Math.pow(10,pow);
            pow += 1;
            dec /= b2;

        }
        return dest;
    }
}