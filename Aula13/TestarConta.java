package Aula13;

public class TestarConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        // erro a seguir, não conseguimos acessar o método .creditar
        // pois esse método é private
        conta.creditar(); 
        conta.debitar();
        double s1 = conta.consultarSaldo(); 

        // mesmo erro aqui para o atributo .saldo
        // pois esse atributo é private
        double s2 = conta.saldo;
        String nome = conta.titular;
        String numeroConta = conta.numero;

    }
}
