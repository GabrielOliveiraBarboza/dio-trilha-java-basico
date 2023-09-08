import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo=1000.50;

        System.out.println("Por favor, digite o número da sua agencia: ");
        agencia= tec.next();
        System.out.println("Digite seu nome");
        nomeCliente=tec.next();
        System.out.println("Digite o numero da conta:");
        numero=tec.nextInt();

        System.out.println("olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua " +
                "agencia é: " + agencia + ", conta: " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}