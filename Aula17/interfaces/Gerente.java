package Aula17.interfaces;

public class Gerente extends Funcionario implements IAutenticavel {
    
    private String senhaDoSistema;
    
    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento); 
    }

    // 2. OBRIGAÇÃO: Implementar os métodos do contrato!
    @Override
    public boolean login(String usuario, String senha) {
        return this.senhaDoSistema.equals(senha);
    }

    @Override
    public void logout() {
        System.out.println("Gerente fazendo logout.");
    }
}
