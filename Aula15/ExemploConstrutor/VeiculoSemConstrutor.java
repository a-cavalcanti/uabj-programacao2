package Aula15.ExemploConstrutor;

public class VeiculoSemConstrutor {
    String motor;

    // Construtor SEM parâmetros
    public VeiculoSemConstrutor() {
        this.motor = "Motor Padrão";
        System.out.println("Construtor do Veiculo (PAI) foi chamado!");
    }
}