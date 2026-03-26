package Aula19;

public class SaldoInsuficienteException extends Exception {

    private double saldo;
    private double valor; 
    
    public SaldoInsuficienteException(double s, double v){ 
        super("Saldo insuficiente!\n Valor disponível: " + s + "; valor desejado: " + v); 
        this.saldo = s; 
        this.valor = v; 
    }
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }

    public double getSaldo() { return saldo; } 
    public double getValor() { return valor; }
}