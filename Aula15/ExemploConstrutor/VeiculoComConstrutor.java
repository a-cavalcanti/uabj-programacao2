package Aula15.ExemploConstrutor;

public class VeiculoComConstrutor {
    String placa;

    // SÓ existe este construtor
    public VeiculoComConstrutor(String placa) {
        this.placa = placa;
        System.out.println("Construtor do Veiculo (PAI) chamado com placa: " + placa);
    }
}