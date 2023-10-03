import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        double saldo = 6500;
        String nome = "Guilherme Oliveira";


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência! ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Óla " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + conta + " e seu saldo " + saldo + " já esta disponível para saque.");

        
       
    }
}
