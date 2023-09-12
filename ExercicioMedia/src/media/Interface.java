package media;
import java.util.*;

public class Interface {

    static Scanner scan = new Scanner (System.in);
    Boletim guardaNotas = new Boletim();
    Notas notas = new Notas();


    public void escrever(String msg){

        System.out.println(msg);

    }

    public void pedirNota()
    {
        escrever("Informe a nota do Aluno: ");
        notas.setNotas(scan.nextDouble());
    }


    
}
