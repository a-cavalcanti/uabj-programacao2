package Aula15.ExemploPolimorfismo;

/**
 * A Subclasse (Filha).
 * Ela herda de Conta e aplica sua própria regra de saque.
 */
public class Poupanca extends Conta {

    // construtor
    public Poupanca(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    // --- POLIMORFISMO ---
    // Este método também está SOBRESCREVENDO o método do pai,
    // mas com um comportamento diferente da ContaCorrente.
    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Poupança de R$" + valor + ". Saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente na Poupança (" + this.saldo + ").");
        }
        
    }
}