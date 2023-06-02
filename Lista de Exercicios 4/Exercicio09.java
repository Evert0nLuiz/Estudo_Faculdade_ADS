public class Exercicio09 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,6};
        int [] vetor2 = {2,5,3,4,5};
        int [] vetorResultadoDaMultiplicacao = new int[vetor.length];
        int guardaProdutoDamultiplicacao;

        for (int i = 0; i < vetor.length;i++)
        {
            guardaProdutoDamultiplicacao = vetor[i] * vetor2[i];
            System.out.println(vetor[i] + " * " + vetor2[i] + " = " + guardaProdutoDamultiplicacao);
            vetorResultadoDaMultiplicacao[i] = guardaProdutoDamultiplicacao;

        }

    }
}
