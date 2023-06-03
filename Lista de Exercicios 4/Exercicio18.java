public class Exericio18 {
    public static void main(String[] args) {
        int []vetor = {14,22,2,44,45,63,75,87,95,150};
        int numeroDado = 45;
        for(int i = 0; i < vetor.length; i++)
        {
            if (numeroDado == vetor[i])
            {
                System.out.println("O número " + numeroDado + " está na posição: " +  (i + 1) + " no array.");
                break;
            }
        }

    }
    
}
