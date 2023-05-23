import java.util.Scanner;

public class Exercicio07 {
    public static double volumeCalcutator(double raio)
    {
        double volume;
        int potencia = 3;
        int numerosDaFormula = 4;
        int numerosDaFormulaDivisor = 3;
        volume =  (numerosDaFormula * Math.pow(raio,potencia) * Math.PI )/ numerosDaFormulaDivisor;
     return volume;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio;
        double volume;

        System.out.println("Informe o raio da esfera: ");
        raio = scan.nextDouble();
        volume = volumeCalcutator(raio);
        System.out.println("O volume da esfera é: " + volume);
    }
}
