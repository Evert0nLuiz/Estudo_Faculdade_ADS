public class Exercicio13 {
    public static void main(String[] args) {
        
    
    double [] vetorA = {-1,2.6,3,4.5,-6};
    double [] vetorB = {1,3,2,4,2};
    double [] vetorC = new double [vetorA.length + vetorB.length];
    int indexIndependente = 0;
    int indexIndependente2 = (vetorB.length-1);

    for(int i = 0; i < vetorA.length; i++)
    {
        vetorC[indexIndependente] = vetorA[i];
        indexIndependente++;
        
        vetorC[indexIndependente2] = vetorB[i];
        indexIndependente2++;

    }
    for (int i = 0; i < vetorC.length;i++)
    {
        System.out.println(vetorC[i]);
    }
    
}
}

