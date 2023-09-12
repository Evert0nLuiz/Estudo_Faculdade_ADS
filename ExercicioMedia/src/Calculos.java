public class Calculos {
    
    public double multiplicacao(double n1, double n2) {

        return n1 * n2;
    }

    public double divisao(double n1, double n2) {
        if (n1 > 0) {
            return n1 / n2;
        } else {
            return 0;
        }
    }

    public double soma(double n1, double n2) {

        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {

        return n1 - n2;
    }

    public double calcula(double n1, double n2, int operacaoEscolhidaPeloUsuario) {
        switch (operacaoEscolhidaPeloUsuario) {
            case 1:
                return soma(n1, n2);

            case 2:
                return subtracao(n1, n2);

            case 3:
                return multiplicacao(n1, n2);

            case 4:
                return divisao(n1, n2);

            default:
                return 0;

        }

    }
    
}
