public class Exercicio02 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,6};
        int somaDosItensDoVetor = 0;
        for (int i = 0; i < vetor.length; i++)
        {
            somaDosItensDoVetor += vetor[i];
        }
        System.out.println("resultado da soma do vetor é: " + somaDosItensDoVetor);
    }
}
