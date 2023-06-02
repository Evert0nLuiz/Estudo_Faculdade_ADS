public class Exercicio04 {
    public static void main(String[] args) {
        int [] vetor = {1,2,-35,4,6};
        int menorNumeroDoVetor = 1;
        for(int i = 0; i < vetor.length;i++)
        {
            if(vetor[i] < menorNumeroDoVetor)
            {
                menorNumeroDoVetor = vetor[i];
            }

        }
        System.out.println("O menor valor do Vetor é: " + menorNumeroDoVetor);
    }
}
