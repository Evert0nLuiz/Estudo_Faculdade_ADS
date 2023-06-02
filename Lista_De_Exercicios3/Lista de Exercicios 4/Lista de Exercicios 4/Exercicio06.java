public class Exercicio06 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,6};
        int produtoDosItensDoVetor = 1;
        for (int i = 0; i < vetor.length; i++)
        {
            produtoDosItensDoVetor *= vetor[i];
        }
        System.out.println("O produto do vetor é: " + produtoDosItensDoVetor);
    }
}
