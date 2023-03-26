import java.util.*;

public class Exercicio2 {
    public static void main(String [] args)
    {   
        Scanner scan = new Scanner(System.in);
        float altura;
        int sexo;
        boolean rodando = true;


        while(rodando){

            System.out.println("Me diga sua altura");
            altura = scan.nextFloat();
            System.out.println("Me diga sexo\n1 p/ Masculino \n2 p/ Feminino");
            sexo = scan.nextInt();

            if (altura > 0 && sexo <= 2)
            {
                switch(sexo){
                    case 1: 
                        System.out.println("O peso masculino será: " + pesoIdealMasculino(altura));
                        rodando = false;
                        break;
                    case 2:
                        System.out.println("O peso ideal femino será: " + pesoIdealFeminino(altura));
                        rodando = false;
                        break;

                }
            }   
            else{
                System.out.println("Sexo ou altura invalidos, tente novamente");
                }

        }
    }
    public static float pesoIdealMasculino(float altura)
    {
        altura = (72.7f * altura) - 58;
        return altura;
    }
    public static float pesoIdealFeminino(float altura)
    {
        altura = (62.1f * altura) - 44.7f;
        ;
        return altura;
    }
}
