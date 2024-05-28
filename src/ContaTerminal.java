import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TO DO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter os valores de entrada do usuário

        // Exibir a mesagem de saída

     
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número para sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o nome da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();  
        
        System.out.println("Olá " + nomeCliente + ", obrigada por criar sua conta em nosso banco, sua agência é " +  agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
