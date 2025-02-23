import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nPor favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
