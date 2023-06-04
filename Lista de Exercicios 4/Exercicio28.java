import java.util.Arrays;

public class Exercicio28 {
    public static void main(String[] args) {
        int [][] matriz = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3}};
        int somaDoElementosDeCadaLinhaDaMatriz;

        for( int i = 0; i < matriz.length;i++)
        {

            somaDoElementosDeCadaLinhaDaMatriz = 0;

            for(int j = 0; j < matriz[i].length;j++) {

                somaDoElementosDeCadaLinhaDaMatriz += matriz[i][j];


            }
            System.out.println("Soma da linha " + i + " = "+ somaDoElementosDeCadaLinhaDaMatriz);





        }
       }

}
