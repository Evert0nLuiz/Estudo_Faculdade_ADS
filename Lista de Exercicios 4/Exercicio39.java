public class Exercicio39 {
    public static void main(String[] args) {
        int[][] matrizA = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] matrizB = {{1,1,1,1,1}, {2,2,2,2,2}, {3,3,3,3,3}};
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

        System.out.println("O produto das duas matrizes é: " + produtoDasDuasMatrizes);


    }
}
