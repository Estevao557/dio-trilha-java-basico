import java.util.Scanner; // Importando a classe Scanner para ler entradas do usuário

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis necessárias
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Pedindo os dados ao usuário e lendo as entradas
        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt(); // Lendo o número da conta

        // Consumindo o newline (enter) que fica na memória após o nextInt()
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); // Lendo a agência

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine(); // Lendo o nome do cliente

        System.out.println("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble(); // Lendo o saldo da conta

        // Exibindo a mensagem final com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
