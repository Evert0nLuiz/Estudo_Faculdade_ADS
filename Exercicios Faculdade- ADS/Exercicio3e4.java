import java.util.*;

public class Exercicio3e4 {
    public static void main(String  args [])
    {
        Scanner scan = new Scanner(System.in);
        float tamanhoLado;
        int ladosQuantidade;

        System.out.println("Me diga quantos lados tem o seu polígono");
        ladosQuantidade = scan.nextInt();
       
        if(ladosQuantidade > 3 && ladosQuantidade < 5)
        {   
            System.out.println("Me diga o tamanho de um dos lados em cm");
            tamanhoLado = scan.nextFloat();

            switch(ladosQuantidade)
            {
                case 3:
                    System.out.println("TRIÂNGULO!\nArea é de: " + areaTriangulo(tamanhoLado) +"cm");
                    break;
                case 4:
                    System.out.println("Quadrado!\nArea é de: " + areaQuadrado(tamanhoLado) +"cm");
                    break;
                case 5:
                    System.out.println("PENTÁGONO!");
                    break;
            }
           
        }else if(ladosQuantidade < 3)
        {
            System.out.println("NÃO É UM POLÍGONO");
        }
        else if(ladosQuantidade > 5)
        {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }

    }



    
    public static float areaTriangulo(float tamanhoLado)
    {

        float area =(tamanhoLado * tamanhoLado) / 2;
        return area;
    }
    public static float areaQuadrado(float tamanhoLado)
    {

        float area = tamanhoLado * tamanhoLado;
        return area;
    }
}