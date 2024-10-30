package br.com.fiap.banco;

public class Conta {
	
	private String nomeCliente;
    private String cpfCliente;
    private String numeroConta;
    private double saldo;

    public Conta(String nomeCliente, String cpfCliente, String numeroConta) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Verifique o saldo ou o valor.");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para a conta " + contaDestino.numeroConta + " realizada com sucesso.");
        } else {
            System.out.println("Transferência inválida. Verifique o saldo ou o valor.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$ " + saldo);

    }
}
