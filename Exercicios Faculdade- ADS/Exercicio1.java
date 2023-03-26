
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args)
    { 

        Scanner scan = new Scanner(System.in);


            boolean rodando = true;
        
       
            System.out.println("Me fale três números");
            
            while(rodando)
            {   
                int leitura1 = scan.nextInt();
                int leitura2 = scan.nextInt();
                int leitura3 = scan.nextInt();
    
               if(leitura1 != leitura2 && leitura2 != leitura3)
               {
                    if(leitura3 != leitura1)
                    {   
                        //primeiro caso da ordenação com o n1 sendo menor
                        if (leitura1 < leitura2){

                            System.out.print(leitura1 +" ");
                            if(leitura2 < leitura3)
                                {
                                System.out.println(leitura2 + " " + leitura3);
                                rodando  = false;
                                }

                                else
                                {
                                System.out.println(leitura3 + " " + leitura2);
                                rodando  = false;
                                } 

                        }
                        //segundo caso da ordenação com o n2 sendo menor
                        else if(leitura2 < leitura3)
                        {
                            System.out.print(leitura2 + " ");
                            if(leitura1 < leitura3)
                            { 
                                System.out.println(leitura1 + " " + leitura3);
                                rodando  = false;
                            } 
                            else 
                                {
                                    System.out.println(leitura3 + " " + leitura1);
                                    rodando  = false;
                                }

                        }
                        //terceiro caso da ordenação com o n3 sendo menor
                        else
                        {
                            System.out.print(leitura3 + " ");
                            if(leitura1 < leitura2)
                            {
                                System.out.println(leitura1 + " " + leitura2);
                                rodando  = false;
                            }else
                            {
                                System.out.println(leitura2 + " " + leitura1);
                                rodando  = false;
                            }
                        }
                    //para o usuario saber que está digitando números repetidos caso passe do primeiro condicional
                    }else 
                    {
                        System.out.println("Números repetidos, tente novamente");
                    }
                    //para o usuario saber que está digitando números repetidos caso não passe do primeiro condicional
                }else 
                {
                    System.out.println("Números repetidos, tente novamente");
                }
           
             }
    }  
}
