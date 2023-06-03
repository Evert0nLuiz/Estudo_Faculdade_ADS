public class Exercicio20 {
    public static void main(String[] args)
    {
        int [] vetor = {1,2,3,5,6,7,8,9};
        int [] vetorCopia;
        int auxiliar = 0;



        for(int i = 0; i < vetor.length;i++)
        {
            if(vetor[i] % 3 == 0)
            {

                auxiliar++;

            }

        }
        
        vetorCopia = new int[auxiliar];
        int j = 0;

        for(int i = 0; i < vetor.length;i++)
        {
            if(vetor[i] % 3 == 0) {

                vetorCopia[j] = vetor[i];
                j++;

            }

        }

        for(int i = 0; i < vetorCopia.length;i++)
        {

            if (vetorCopia[i] % 2 != 0)
            {
                System.out.println(vetorCopia[i]);
            }
        }
    }


    }


