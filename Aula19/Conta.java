package Aula19;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    // O 'throws' avisa que quem chamar este método deve tratar uma exceção 
    public void debitar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            // O 'throw' cria e lança o erro
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de: " + valor);
        }
        this.saldo -= valor;
        System.out.println("Saque realizado. Saldo: " + this.saldo);
    }


    

    // O 'throws' avisa que quem chamar este método deve tratar uma exceção 
    // public void debitar(double valor) throws Exception {
    //     if (valor > saldo) {
    //         // O 'throw' cria e lança o erro
    //         throw new Exception("Saldo insuficiente para saque de: " + valor);
    //     }
    //     this.saldo -= valor;
    //     System.out.println("Saque realizado. Saldo: " + this.saldo);
    // }
}
