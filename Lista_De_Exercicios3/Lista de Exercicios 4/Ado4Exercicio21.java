// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Ado4Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] vetorNome = new String[30];
        double [] vetorNotas = new double[30];
        String inputNomes;
        int inputNotas   = 0;

        double mediaDaSala = 0;
        double somaDasNotas = 0;
        int contadorParaDividirMedia = 0;

        for(int i = 0;i < vetorNotas.length;i++){

            System.out.println("Para parar digite Pare");
            System.out.println("Indique o nome do aluno: ");
            inputNomes = scan.next();


            if(inputNomes.toUpperCase().equals("PARE")) {

                break;
            }


            System.out.println("Indique a nota do aluno: ");
            inputNotas = scan.nextInt();



            vetorNotas[i] = inputNotas;
            vetorNome[i] = inputNomes;



        }

        for(int j = 0; j < vetorNotas.length;j++)
        {
            somaDasNotas = somaDasNotas + vetorNotas[j];
            if(vetorNotas[j] != 0)
            {
                contadorParaDividirMedia++;
            }
        }
        System.out.println(contadorParaDividirMedia);
        mediaDaSala = somaDasNotas / contadorParaDividirMedia;
        System.out.println("A média da sala foi: " + mediaDaSala);
        System.out.println("Os alunos que tiveram nota acima da média da sala foram: ");
        for (int j = 0; j < vetorNotas.length;j++){
            if (vetorNotas[j] > mediaDaSala)
            {
                System.out.println(vetorNome[j]);
            }

        }
    }
}
