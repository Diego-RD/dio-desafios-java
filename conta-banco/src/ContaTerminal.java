import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite número da agência: ");
        String agencia = scanner.next();

        System.out.println("Agora insira o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Estamos quase lá, agora por favor insira o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Por favor insira seu sobrenome: ");
        String sobrenome = scanner.next();

        double saldo = 0.0;

        if (numeroConta == 1021) {
            saldo = 234.55;
        }else{
            System.out.println("Desculpe, não encontramos essa conta. verifique agência e conta e tente novamente.");
        }

        System.out.println(nome + " " + sobrenome + ",Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numeroConta + " e seu saldo " + saldo + " já esta disponivel para saque.");


    }
}
