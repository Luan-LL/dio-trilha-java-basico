import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = leia.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        int numero = leia.nextInt();
        System.out.println("Por favor, digite a sua Agência: ");
        String agencia = leia.next();
        System.out.println("Por favor, digite o  Saldo da conta: ");
        double saldo = leia.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência " + agencia
                + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
