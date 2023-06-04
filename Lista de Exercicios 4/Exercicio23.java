import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio23 {
    public static void main(String[] args) {
        int [][] matriz = new int[6][7];
        int numeroUsadoParaPreencherAMatrizLinhaImpar = 21;
        int numeroUsadoParaPreencherAMatrizLinhaPar = 10;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(i % 2 == 0) {
                    matriz[i][j] = numeroUsadoParaPreencherAMatrizLinhaPar;
                }else
                {
                    matriz[i][j] = numeroUsadoParaPreencherAMatrizLinhaImpar;
                }
            }
        }
        System.out.print(Arrays.deepToString(matriz));

    }
}
