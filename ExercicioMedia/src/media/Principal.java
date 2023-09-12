package media;


public class Principal {

    public static void main(String[] args) {
        Boletim calculadora = new Boletim();
        Interface ui = new Interface();
        
        ui.pedirNota();
        ui.pedirNota();
        ui.pedirNota();

        calculadora.calcularMedia();

        ui.escrever("O resultado é: " + calculadora.getResultado());
        
    }
    
}
