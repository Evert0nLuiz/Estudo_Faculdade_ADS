public class Exercicio31 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}};
        int [] guardaValoresDaColuna;
        int contadorDeColunas = 0;

        for (int i = 0; i < matriz.length; i++) {
            contadorDeColunas = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                    contadorDeColunas += 1;

            }
        }
        guardaValoresDaColuna = new int [contadorDeColunas];

        for (int i = 0;i < matriz.length; i++)
        {
            for(int j = 0; j< matriz[i].length;j++)
            {
                guardaValoresDaColuna[j] += matriz[i][j];
            }
        }
        for (int i = 0; i< guardaValoresDaColuna.length;i++)
        {
            System.out.println(guardaValoresDaColuna[i]);
        }
    }

}

