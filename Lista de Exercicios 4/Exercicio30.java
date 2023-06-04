import java.util.Arrays;

public class Exercicio30 {
    public static void main(String[] args) {
        int [][] matriz  = new int[6][7];
        int [] vetor = {1,2,3,4,5,6};

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length;j++)
            {
                matriz[i][j] = vetor[i];
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}
