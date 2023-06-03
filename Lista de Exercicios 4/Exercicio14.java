public class Exercicio14 {
    public static void main(String[] args) {
        
    double [] vetorA = {-1,2.6,3,4.5,-6};
    double [] vetorB = {1,3,2,4,2};
    double [] vetorC = new double [vetorA.length + vetorB.length];
    int indexIndependente = 0;
    int indexIndependente2 = 0;

    for(int i = 0; i < vetorC.length; i++)
    {
        if(i % 2 == 0)
        {
             vetorC[i] = vetorA[indexIndependente];
             indexIndependente++;

        }else if(i % 2  == 1)
        {
            vetorC[i] = vetorB[indexIndependente2];
            indexIndependente2++;

        }
      
    }
    for (int i = 0; i < vetorC.length;i++)
    {
        System.out.println(vetorC[i]);
    }
    
    }
    
}
