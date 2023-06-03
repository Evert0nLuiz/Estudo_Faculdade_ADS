public class Exercicio16 {
    public static void main(String[] args) {
        int []vetor = {1,2,3,4,5,6,7,8,9,10};
        boolean parada = false;
        int variavelAuxiliar;
        int variavelAuxiliar2;
        for(int i = 0; i < vetor.length; i++ )
        {
            for(int j = 0; j < (vetor.length - 1); j++)
            {
                
               if(vetor[j] % 2 == 0)
                {
                    variavelAuxiliar2 = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = variavelAuxiliar2;
                }
                if(vetor[j] % 2 == 1)
                {
                    variavelAuxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = variavelAuxiliar;
                }
        }

        }
        for(int i = 0;i < vetor.length;i++)
        {
            System.out.println(vetor[i]);
        }
    }
    
}
