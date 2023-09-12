import java.util.*;

public class Calculadora {

    static Scanner scan = new Scanner(System.in);
    static Calculos calcular = new Calculos();
    static Interface ui = new Interface();

    public static void main(String[] args) {
        double n1;
        double n2;
        int operador = 1;

        while (operador != 0) {
            ui.tela();
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            ui.telaDeEscolhaDeOperador();
            operador = scan.nextInt();
            if (operador == 0) {
                break;
            }
            ui.mostraResultado(calcular.calcula(n1, n2, operador));

        }

    }

   

    


}
