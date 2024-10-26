import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scaner = new Scanner(System.in);


        System.out.println("Olá, digite seu nome:");
        String nome = scaner.next();
        System.out.println("Por favor, digite o numero da conta:");
        int numero = scaner.nextInt();
        System.out.println("Por favor, digite o numero da sua agencia bancaria:");
        String agencia = scaner.next();
        System.out.println("Por favor, digite o seu saldo");
        double saldo = scaner.nextDouble();

        System.out.println("olá "+nome+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta"+numero+" e o seu saldo "+saldo+" já está disponivel para saque.");



    }
}
