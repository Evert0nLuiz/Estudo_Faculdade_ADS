public class Exercicio38 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 1, 1}, {0, 2, 2}, {0, 0, 3}, {0, 0, 0}};

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++)
            {
                if (i == j)
                {
                    for(int ij = (j+1); ij < matriz[i].length; ij++ )
                    {
                        System.out.println(matriz[i][ij]);
                    }
                }
            }
        }
    }
}
