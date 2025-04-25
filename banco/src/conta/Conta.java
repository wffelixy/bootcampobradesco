package conta;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> transacoes; // Lista para armazenar histórico de transações

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            transacoes.add(String.format("Saque: -%.2f", valor)); // Registra saque
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public void depositar(double valor, String remetente) {
        if (valor > 0) {
            saldo += valor;
            transacoes.add(String.format("Depósito de %s: +%.2f", remetente, valor)); // Registra depósito
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor, this.cliente.getNome());
            transacoes.add(String.format("Transferência enviada para %s: -%.2f", contaDestino.cliente.getNome(), valor));
            contaDestino.transacoes.add(String.format("Transferência recebida de %s: +%.2f", this.cliente.getNome(), valor));
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void ImprimirInfosComuns() {
        System.out.println("\n===== Extrato =====");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo Atual: %.2f", this.saldo));
        System.out.println("\nHistórico de Transações:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println("====================\n");
    }
}