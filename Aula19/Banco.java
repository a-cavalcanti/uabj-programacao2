package Aula19;

public class Banco {
    public static void main(String[] args) {
        Conta c = new Conta(100.0);

        try {
            c.debitar(50.0); 
            System.out.println("Saque 1 ok");
            
            c.debitar(200.0); // Lança a exceção e pula para o catch
            System.out.println("Saque 2 ok");

        } catch (SaldoInsuficienteException e) {
            System.out.println("ERRO DE NEGÓCIO: " + e.getMessage());
        } catch (ArithmeticException a){

        } finally 
        {
            
        }
    }
}
