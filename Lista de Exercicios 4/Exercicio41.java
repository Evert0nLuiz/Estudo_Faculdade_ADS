public class Exercicio41 {
    public static int maiorNumeroDaMatriz(int matriz[][])
    {
        int maiorNumero = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] > maiorNumero)
                {
                    maiorNumero = matriz[i][j];
                }
            }
        }
        return maiorNumero;
    }
    public static void main(String[] args) {
        int matriz[][] = {{12,4,4,56,77,34}, {2,4,5,67,12,4}};
        System.out.println(maiorNumeroDaMatriz(matriz));

    }
}
