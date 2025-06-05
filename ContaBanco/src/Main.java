
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal =  new ContaTerminal();

        System.out.print("Digite nome cliente: ");
        contaTerminal.setCliente(scanner.nextLine());

        System.out.print("Digite  agência do cliente: ");
        contaTerminal.setAgencia(scanner.nextLine());

        System.out.print("Digite  numero da conta: ");
        contaTerminal.setNumeroConta(scanner.nextInt());

        System.out.print("Digite  saldo inicial para o cliente: ");
        contaTerminal.setSaldo(scanner.nextDouble());

        contaTerminal.getStatusConta();

    }
}