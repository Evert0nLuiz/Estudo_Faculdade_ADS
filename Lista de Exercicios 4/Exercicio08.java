public class Exercicio08 {
    public static void main(String[] args) {
        int [] vetor = {1,3,2,4,2};
        int numeroParaBuscarNoVetor = 2;


        for (int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] == numeroParaBuscarNoVetor)
            {
                System.out.println("O número está presente no vetor");
                break;

            }
        }


    }

}

