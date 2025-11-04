package Aula15.ExemploConstrutor;

public class CarroSemConstrutor extends VeiculoSemConstrutor {
    
    String modelo;

    public CarroSemConstrutor(String modelo) {
        // NÃO TEM super(), mas é como se o java colocasse automaticamente
        this.modelo = modelo;
        System.out.println("Construtor do Carro (FILHO) foi chamado!");
    }
}