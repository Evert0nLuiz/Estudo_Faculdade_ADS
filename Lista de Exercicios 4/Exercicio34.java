public class Exercicio34 {
    public static void main(String[] args) {
        int [][] matriz = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int somaDosElementosDaMatriz = 0;
         for(int i = 0; i < matriz.length; i++)
         {
             for(int j = 0; j < matriz[i].length; j++)
             {
                 somaDosElementosDaMatriz += matriz[i][j];
             }
         }
        System.out.println("A soma de todos os elementos da matriz é: " +  somaDosElementosDaMatriz);
    }
}
