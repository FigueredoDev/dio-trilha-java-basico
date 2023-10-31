import java.util.Scanner;

public class TerminalAccount {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia: ");
        String agency = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String clientName = scanner.next();

        System.out.println("Por favor, digite o valor do depósito: ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agency
                + ", conta " + accountNumber + "e seu saldo " + balance + " já está disponível para saque");

        scanner.close();
    }
}
