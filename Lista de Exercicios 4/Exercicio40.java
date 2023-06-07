public class Exercicio40 {
    public static void main(String[] args) {
        int [][] matriz = {{1,1,1,1,1},{1,1,1,2,1},{1,1,1,1,1}};
        int numeroASerProcurado = 2;

        for(int i = 0; i < matriz.length; i++)
        {
            for( int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] == numeroASerProcurado)
                {
                    System.out.println("A linha em que está localizado: " + i + " e coluna: " + j);
                }
            }
        }
    }
}
