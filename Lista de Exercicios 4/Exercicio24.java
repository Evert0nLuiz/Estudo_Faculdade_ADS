import java.util.Arrays;

public class Exercicio24 {
    public static void main(String[] args) {
        int [][] matriz = new int[6][7];
        int numeroImparUsadoParaPreencherAColunaDaMatriz = 7;
        int numeroParUsadoParaPreencherAColunaDaMatriz = 4;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(j % 2 == 0) {
                    matriz[i][j] = numeroParUsadoParaPreencherAColunaDaMatriz;
                }else
                {
                    matriz[i][j] = numeroImparUsadoParaPreencherAColunaDaMatriz;
                }
            }
        }
        System.out.print(Arrays.deepToString(matriz));
    }
}
