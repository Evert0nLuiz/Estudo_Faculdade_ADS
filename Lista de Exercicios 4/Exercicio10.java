public class Exercicio10 {
    public static void main(String[] args) {
        double [] vetor = {-1,2.6,3,4.5,-6};
        double multiplicadorParaOVetor = -4;
        double variavelQueRcebeProduto;

        for (int i = 0; i < vetor.length; i++)
        {
            if(i % 2 != 0)
            {
                variavelQueRcebeProduto = vetor [i] * multiplicadorParaOVetor;
                System.out.println(vetor[i] + " * " + multiplicadorParaOVetor + " = " + variavelQueRcebeProduto);
            }
        }
    }
}
