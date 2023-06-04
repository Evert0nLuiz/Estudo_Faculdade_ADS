public class Exercicio32 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 1, 2, 1}, {2, 4, 2, 4, 2}, {3, 2, 3, 2, 3}};
        int [] guardaValoresDaColuna;
        int contadorDeColunas = 0;
        int indexIndependente = 0;

        for (int i = 0; i < matriz.length; i++) {
            contadorDeColunas = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 == 1) {
                    contadorDeColunas += 1;
                }
            }
        }
        guardaValoresDaColuna = new int [contadorDeColunas];

        for (int i = 0;i < matriz.length; i++)
        {
            indexIndependente = 0;
            for(int j = 0; j < matriz[i].length;j++)
            {

                if( j % 2 == 1)
                {
                    guardaValoresDaColuna[indexIndependente] += matriz[i][j];
                    indexIndependente ++;


                }

            }
        }

        for (int i = 0; i < guardaValoresDaColuna.length;i++)
        {
            System.out.println("A soma das colunas impares é: " + guardaValoresDaColuna[i]);
        }
    }
}
