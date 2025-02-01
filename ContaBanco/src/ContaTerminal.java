import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero = 1021;
        String agencia;

        String nomeClient = "Estêvão Martins Fidelis";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        System.out.println("Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " +saldo + " já está disponível para saque");
    
    }
}
