package Aula15.ExemploConstrutor;

public class CarroComConstrutor extends VeiculoComConstrutor {
    String modelo;


    public CarroComConstrutor(String placaDoCarro, String modeloDoCarro) {
        // 1. Chamada explícita e manual para o construtor do PAI
        super(placaDoCarro); 
        
        // 2. Agora podemos inicializar o FILHO
        this.modelo = modeloDoCarro;
        System.out.println("Construtor do Carro (FILHO) foi chamado!");
    }
}