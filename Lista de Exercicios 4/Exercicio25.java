import java.util.Arrays;

public class Exercicio25 {
    public static void main(String[] args) {
        int [][] matriz = new int[6][7];


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            {
                switch (i){
                    case 1:
                        matriz[i][j] = i;
                        break;
                    case 2:
                        matriz[i][j] = i;
                        break;
                    case 3:
                        matriz[i][j] = i;
                        break;
                    case 4:
                        matriz[i][j] = i;
                        break;
                    case 5:
                        matriz[i][j] = i;
                        break;
                    default:
                        matriz[i][j] = i;
                        break;
                }



            }
        }
        System.out.print(Arrays.deepToString(matriz));
    }
}
