package Aula17.interfaces;

public class SistemaDeLogin {

    // Método chave
    // Ele não se importa se é Gerente ou Cliente.
    // Ele só se importa se o objeto "assina o contrato Autenticavel".
    public void fazerLogin(IAutenticavel autentica) {
        
        boolean sucesso = autentica.login("user", "1234");
        
        if (sucesso) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login.");
        }
    }
    
    public static void main(String[] args) {
        SistemaDeLogin sistema = new SistemaDeLogin();
        
        Gerente g = new Gerente("Anderson", "092", 2000.0, "20022002");
        Cliente c = new Cliente();
        
        // Polimorfismo com Interfaces!
        sistema.fazerLogin(g);
        sistema.fazerLogin(c); 
    }
}
