public class Exercicio36 {
    public static void main(String[] args) {
        int [][] matriz = {{1,9,10,-1,9},{0,2,9,10,10},{10,10,3,10,10}};

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(i == j )
                {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
