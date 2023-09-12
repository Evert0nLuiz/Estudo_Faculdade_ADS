
public class Calculos {

    private int escolhaOperador;
    private double resultado;
    private double n1;
    private double n2;
    
    public Calculos(int escolhaOperador)
    {
        this.escolhaOperador = escolhaOperador;
    }


    public int getEscolhaOperador() {
        return escolhaOperador;
    }
    public void setEscolhaOperador(int escolhaOperador) {
        this.escolhaOperador = escolhaOperador;
    }
    public double getResultado() {
        return resultado;
    }


    public void calculos()
    {



    }
    
    


    public void soma()
    {
        resultado = n1 + n2;
        return resultado;
    }
    public void subtracao(double n1, double n2)
    {
        resultado = n1 - n2;
        return resultado;
    }
    public void multiplicacao(double n1, double n2)
    {
        resultado = n1 - n2;
        return resultado;
    }
    public void divisao(double n1, double n2)
    {
        resultado = n1 - n2;
        return resultado;
    }


    
}
