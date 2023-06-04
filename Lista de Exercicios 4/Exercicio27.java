import java.util.Arrays;

public class Exercicio27 {
    public static void main(String[] args) {
        int [][] matriz = new int[7][6];


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                switch (j){
                    case 1:
                        matriz[i][j] = i+j;
                        break;
                    case 2:
                        matriz[i][j] = i+j;
                        break;
                    case 3:
                        matriz[i][j] = i+j;
                        break;
                    case 4:
                        matriz[i][j] = i+j;
                        break;
                    case 5:
                        matriz[i][j] = i+j;
                        break;
                    case 0:
                        matriz[i][j] = i+j;
                        break;
                }



            }
        }
        System.out.print(Arrays.deepToString(matriz));


    }

}
