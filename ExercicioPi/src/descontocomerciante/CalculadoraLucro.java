package descontocomerciante;

public class CalculadoraLucro extends Produto{


    private double lucro;
    private double lucroAlto = 0.45d;
    private double lucroBaixo = 0.30d;

    public double getLucro() {

        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getLucroAlto() {
        return lucroAlto;
    }

    public double getLucroBaixo() {
        return lucroBaixo;
    }
}
