public class Exercicio22 {
    public static void main(String[] args) {
        int [][] matriz = new int[6][7];
        int numeroUsadoParaPreencherAMatriz = 20;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = numeroUsadoParaPreencherAMatriz;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
