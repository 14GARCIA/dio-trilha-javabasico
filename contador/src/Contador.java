
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

     System.out.println("digite o parametro um:");
     int parametroUm = terminal.nextInt();
     System.err.println("digite o parametro dois");
     int parametroDois= terminal.nextInt();
   try
    {
        contar(parametroUm,parametroDois);
    }
    catch(ParametrosInvalidosException  exception)
    {
        System.err.println(exception.getMessage());
       
    }

}


static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
{
    if (parametroDois <= parametroUm) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
                }

        int contagem = parametroDois - parametroUm;

        for(int i=0; i<contagem; i++ ){
            System.out.println("contando: "+i);
        }

    
}

}