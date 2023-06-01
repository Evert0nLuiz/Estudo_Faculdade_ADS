public class Exercicio03 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,6};
        int maiorNumeroDoVetor = 0;
        for(int i = 0; i < vetor.length;i++)
        {
            if(vetor[i] > maiorNumeroDoVetor)
            {
                maiorNumeroDoVetor = vetor[i];
            }

        }
        System.out.println("O maior valor do Vetor é: " + maiorNumeroDoVetor);
    }
}
