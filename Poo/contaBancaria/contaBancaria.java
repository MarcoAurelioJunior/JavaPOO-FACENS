package Poo.contaBancaria;

public class contaBancaria {
    private double saldo;

    // Construtor da classe
    public contaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar um valor
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar um valor
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else if (valor > 0) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }
}
