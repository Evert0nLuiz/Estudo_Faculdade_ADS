public class Interface {
    public void mostraResultado(double resultado) {

        System.out.println("O RESULTADO DO CALCULO É: " + resultado);

    }

    public void tela() {

        System.out.println("----------------------");
        System.out.println("--INDIQUE OS VALORES--");
        System.out.println("---PARA OS CALCULOS---");
        System.out.println("----------------------");

    }

    public void telaDeEscolhaDeOperador() {

        System.out.println("Digite 1 - para somar");
        System.out.println("Digite 2 - para subtrair");
        System.out.println("Digite 3 - para multiplicar");
        System.out.println("Digite 4 - para a divisão");
        System.out.println("Digite 0 - para sair");
    }
}
