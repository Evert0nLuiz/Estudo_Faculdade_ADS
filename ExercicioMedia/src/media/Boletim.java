package media;



public class Boletim {

    Notas notas =  new Notas();
    
    private double resultado;
    
    

    public void calcularMedia()
    {
        double soma = 0;
        for (Double nota : notas.getNotas()) {
            soma += nota;
            
        }
        resultado = soma/(double)notas.getNotas().size();

    }

    public double getResultado() {
        return resultado;
        }
    
}
