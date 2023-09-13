import java.util.Scanner;

public class UserInterface {
    Scanner input = new Scanner(System.in);

    public void boasVindas(){
        System.out.println("########## Boas-Vindas #########");
    }
    public void pularLinha(){
        System.out.println();
    }

    public void bordaFinal(){
        System.out.println("################################");}

    public void escrever(String msg){
        System.out.print(msg);
    }

    public String lerTexto( String msg){
        System.out.println(msg);
        return input.next();

    }
    public int lerInt(String msg){
        System.out.println(msg);
        return input.nextInt();
    }
    public double lerDouble(String msg){
        System.out.println(msg);
        return  input.nextDouble();
    }


}
