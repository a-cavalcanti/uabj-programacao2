package Aula17.interfaces;

public class Cliente implements IAutenticavel {

    private String senhaDoApp;
    
    public Cliente(){        
    }

    // 2. OBRIGAÇÃO: Implementar os métodos do contrato!
    @Override
    public boolean login(String usuario, String senha) {
        return this.senhaDoApp.equals(senha);
    }

    @Override
    public void logout() {
        System.out.println("Cliente fazendo logout.");
    }
}
