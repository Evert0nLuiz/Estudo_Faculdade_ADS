public class Exercicio33 {
    public static void main(String[] args) {
        int [][] matriz = {{1,21,3,-4,8},{1,-5,0,12,3},{1,256,8,4563,41}};

         for(int i = 0; i < matriz.length;i++)
         {
             for (int j = 0; j < matriz[i].length;j++)
             {
                 if(matriz[i][j] < 0)
                 {
                     System.out.println("Número negativo sem encontra na linha: " + i + " e coluna: " + j);
                 }
             }
         }

    }
}
