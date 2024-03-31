import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<contaBancaria> contas = new ArrayList<contaBancaria>();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o número da conta? ");
        String numeroConta = leitor.nextLine();

        System.out.print("Qual o nome do titular da conta? ");
        String nomeTitular = leitor.nextLine();

        System.out.print("Qual o saldo inicial da conta? ");
        int saldo = leitor.nextInt();

        contaBancaria contaBancaria = new contaBancaria(numeroConta, nomeTitular, saldo);
        contas.add(contaBancaria);

        System.out.print("Qual o valor do depósito para a conta? ");
        int valorDeposito = leitor.nextInt();
        contaBancaria.depositar(valorDeposito);

        System.out.print("Qual o valor do saque? ");
        int valorSaque = leitor.nextInt();
        contaBancaria.sacar(valorSaque);

        contaBancaria.exibirInformacoes();

    }

}
