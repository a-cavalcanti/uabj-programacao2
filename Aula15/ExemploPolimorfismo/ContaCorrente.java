package Aula15.ExemploPolimorfismo;

/**
 * A Subclasse (Filha).
 * Ela herda de Conta e aplica sua própria regra de saque.
 */
public class ContaCorrente extends Conta {
    
    private double taxaDeOperacao = 0.50; // regra de negócio específica

    // construtor
    public ContaCorrente(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    // --- POLIMORFISMO ---
    // Este método está SOBRESCREVENDO o método do pai.
    @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxaDeOperacao;
        
        if (this.saldo >= valorTotal) {
            this.saldo -= valorTotal;
            System.out.println("Saque C/C de R$" + valor + " (Taxa: R$" + taxaDeOperacao + "). Saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente na C/C (" + this.saldo + ") para sacar R$" + valor + " + taxa.");
        }
    }
}
