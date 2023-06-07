public class Exercicio35 {
    public static void main(String[] args) {
        int [][] matriz = {{10,9,10,-1,9},{0,-5,9,10,10},{10,10,10,10,10}};
        double somaDosElementosPositivosDaMatriz = 0;
        int contadorDeNumerosPositivos = 0;
        double mediaDosElementosPositivosDoVetor;
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] > 0) {
                    somaDosElementosPositivosDaMatriz += matriz[i][j];
                    contadorDeNumerosPositivos++;
                }
            }
        }
        mediaDosElementosPositivosDoVetor = somaDosElementosPositivosDaMatriz / contadorDeNumerosPositivos;
        System.out.println("A media de todos os elementos da matriz é: " + mediaDosElementosPositivosDoVetor );

    }
}
