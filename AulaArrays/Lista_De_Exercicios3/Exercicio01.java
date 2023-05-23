import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercicio01 {

    public static int menorComparacao(int n1, int n2, int n3)
    {   int menor;
        if(n1 < n2 && n1 < n3){
            menor = n1;
        } else if (n2< n3 && n2 < n1) {
            menor = n2;

        } else {
            menor = n3;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n1;
        int n2;
        int n3;
        int resultado;
        String mensagem = "Indique um número inteiro para comparação e descobrir o menor: ";

        System.out.println(mensagem);
        n1 = scan.nextInt();
        System.out.println(mensagem);
        n2 = scan.nextInt();
        System.out.println(mensagem);
        n3 = scan.nextInt();
        resultado = menorComparacao(n1, n2, n3);

        System.out.println("Resultado da comparação, o menor número é: " + resultado);
    }
}