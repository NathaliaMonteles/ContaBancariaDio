import java.util.Scanner;

public class ContaTerminal {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;
        String agencia, nome;
        float saldo;

        System.out.println("Olá! Seja bem-vindo ao Banco W");

        System.out.println("Por favor, digite o número da conta: ");
        numero = leia.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = leia.next();

        System.out.println("Por favor, digite o seu nome: ");
        nome = leia.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = leia.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}