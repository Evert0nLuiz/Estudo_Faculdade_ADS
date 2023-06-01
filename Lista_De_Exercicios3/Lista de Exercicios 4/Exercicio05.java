public class Exercicio05 {
    public static void main(String[] args) {
        int [] vetor = {1,2,2,10,10};
        double mediaDosNumerosDoVetor;
        double somaDosNumerosDoVetor = 0;
        for(int i = 0; i < vetor.length; i++)
        {
            somaDosNumerosDoVetor += vetor[i];
        }
        mediaDosNumerosDoVetor = somaDosNumerosDoVetor / vetor.length;
        System.out.println("A media dos elementos do vetor é: " + mediaDosNumerosDoVetor);
    }
}
