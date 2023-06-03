public class Exercicio11 {
    public static void main(String[] args) {
        double [] vetor = {-1,2.6,3,4.5,-6};
        double mediaDoVetor = 0;
        double somaDosNumerosDoVetor = 0;
        for(int i = 0; i < vetor.length; i++){
            somaDosNumerosDoVetor += vetor[i];
        }
        mediaDoVetor =  somaDosNumerosDoVetor / vetor.length;
        System.out.println(mediaDoVetor);
        for(int i = 0; i < vetor.length; i++)
        {
            if(mediaDoVetor < vetor[i] && i % 2 == 0)
            {
                System.out.println(vetor[i]);
            }
        }
    }
}
