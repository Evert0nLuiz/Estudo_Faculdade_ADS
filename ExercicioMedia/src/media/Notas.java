package media;
import java.util.ArrayList;

public class Notas {
    private ArrayList<Double> notas = new ArrayList<Double>();

    public void setNotas(double nota) {
        notas.add(nota);
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }

    
    
}
