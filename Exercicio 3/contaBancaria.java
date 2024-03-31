public class contaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private int saldo;
    int valorSaque;
    int valorDeposito;

    contaBancaria(String numeroConta, String nomeTitular, int saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(int valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito de " + valorDeposito + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(int valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque de " + valorSaque + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular da Conta: " + nomeTitular);
        System.out.println("Saldo atual: " + saldo);
    }
}
