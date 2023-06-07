import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercicio42 {
    public static int produtoDasMatrizes(int matrizA[][], int matrizB[][]){
        int produtoDaMatrizA = 1;
        int produtoDaMatrizB = 1;
        int produtoDasDuasMatrizes;
        for(int i = 0; i < matrizA.length; i++)
        {
            for(int j = 0; j < matrizA[i].length; j++)
            {
                produtoDaMatrizA *= matrizA[i][j];
            }
        }
        for(int i = 0; i < matrizB.length; i++)
        {
            for(int j = 0; j < matrizB[i].length; j++)
            {
                produtoDaMatrizB *= matrizB[i][j];
            }
        }
        produtoDasDuasMatrizes = produtoDaMatrizA * produtoDaMatrizB;
        return  produtoDasDuasMatrizes;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA;
        int[][] matrizB;
        int tamanhoDasMatrizes;


        System.out.println("Informe o tamanho da matriz: ");
        tamanhoDasMatrizes = scan.nextInt();
        matrizA = new int [tamanhoDasMatrizes][tamanhoDasMatrizes];
        matrizB = new int [tamanhoDasMatrizes] [tamanhoDasMatrizes];

        for(int i = 0; i < matrizA.length; i++)
        {
            System.out.println("Informe os números da linha " + i + " da primeira matriz");
            for(int j = 0; j < matrizA.length; j++)
            {
                System.out.print("-> ");
                matrizA[i][j] = scan.nextInt();

            }
        }
        for(int i = 0; i < matrizB.length; i++)
        {
            System.out.println("Informe os números da linha " + i + " da segunda matriz");
            for(int j = 0; j < matrizB.length; j++)
            {
                System.out.print("->  ");
                matrizB[i][j] = scan.nextInt();

            }
        }

        System.out.println("O produto das duas matrizes é: " + produtoDasMatrizes(matrizA, matrizB));


    }
}
