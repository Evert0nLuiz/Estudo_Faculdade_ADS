public class Exercicio37 {
    public static void main(String[] args) {
        int[][] matriz = {{0, 0, 0}, {0, 0, 0}, {1, 0, 1}, {1, 0, 1}};
        int contadoDeZerosNaLinha;
        int contadorDeZerosNaColuna = 0;
        int numerosDeLinhasNulas = 0;
        int numerosDeColunasNulas = 0;


        for (int i = 0; i < matriz.length; i++) {
            contadoDeZerosNaLinha = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contadoDeZerosNaLinha++;

                }

            }
            if (contadoDeZerosNaLinha == matriz[i].length) {
                numerosDeLinhasNulas++;
            }

        }

        for (int i = 0; i < matriz[0].length; i++) {
            contadoDeZerosNaLinha = 0;
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[j][i] == 0) {
                    contadoDeZerosNaLinha++;
                }
                if (contadoDeZerosNaLinha == matriz.length) {
                    numerosDeColunasNulas++;
                }

            }
        }
        System.out.println("Número de linhas nulas: " +  numerosDeLinhasNulas +"\nNúmero de colunas nulas: " + numerosDeColunasNulas);
    }

}




