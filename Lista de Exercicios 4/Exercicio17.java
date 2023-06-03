public class Exericio17 {
    public static void main(String[] args) {
        double [] vetor = {-1,2.6,3,4.5,-6};
        double multiplicadorDoVetor = 3.8;

        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = vetor[i] * multiplicadorDoVetor;

        }
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i]);
        }
       
    }
    
}
