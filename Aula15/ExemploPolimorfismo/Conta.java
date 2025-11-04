package Aula15.ExemploPolimorfismo;

/**
 * A Superclasse (Pai).
 */
public class Conta {
    
    // protected: permite que as classes filhas acessem diretamente
    protected String numero;
    protected double saldo;

    // Construtor
    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public String getNumero() {
        return this.numero;
    }

    // Método genérico de saque
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque genérico de R$" + valor + ". Saldo restante: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para saque genérico.");
        }
    }
    
    // Método de crédito
    public void creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Crédito de R$" + valor + ". Saldo restante: " + this.saldo);
        }
    }
}
