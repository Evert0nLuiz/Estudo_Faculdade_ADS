public class Exercicio07 {
    public static void main(String[] args)
    {
        int [] vetor = {1,2,3,4,6};
        int [] vetorResultadoDaMultiplicação = new int[vetor.length];
        int multiplicadorDoVetor = 3;

        for(int i = 0; i < vetor.length; i++)
        {
            vetorResultadoDaMultiplicação[i] = vetor[i] * multiplicadorDoVetor;

        }
        for(int i = 0;i < vetorResultadoDaMultiplicação.length; i++)
        {
            System.out.println("Resultado da multiplicação na posiçãõ: " + i + " = " + vetorResultadoDaMultiplicação[i]);
        }
    }
}
