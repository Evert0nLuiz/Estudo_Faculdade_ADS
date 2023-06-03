public class Exercicio12 {
    public static void main(String[] args) {
        double [] vetorA = {-1,2.6,3,4.5,-6};
        double [] vetorB = {1,3,2,4,2};
        double somaDosNumerosDoVetorA = 0;
        double somaDosNumerosDoVetorB = 0;
        double mediaDoVetorA;
        double mediaDoVetorB;
       

        for(int i = 0; i < vetorA.length; i++ )
        {
            somaDosNumerosDoVetorA += vetorA[i];
            somaDosNumerosDoVetorB += vetorB[i];
           
        }
        
        if(somaDosNumerosDoVetorA > somaDosNumerosDoVetorB)
        {
            System.out.println("A maior soma é: " + somaDosNumerosDoVetorA);
        }else
        {
            System.out.println("A maior soma é: " + somaDosNumerosDoVetorB);
        }
        
        mediaDoVetorA = somaDosNumerosDoVetorA / vetorA.length;
        mediaDoVetorB = somaDosNumerosDoVetorB / vetorB.length;

        if(mediaDoVetorA < mediaDoVetorB)
        {
            System.out.println("A menor media é: " + mediaDoVetorA);
        }else{
            System.out.println("A menor media é: " + mediaDoVetorB);
        }
        
        
    }
}
