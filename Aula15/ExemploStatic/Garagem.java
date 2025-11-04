package Aula15.ExemploStatic;

public class Garagem {
    public static void main(String[] args) {
        
        System.out.println("Fábrica produziu até agora: " + Carro.getTotalDeCarrosFabricados());

        System.out.println("Fabricando carros...");
        Carro carro1 = new Carro("Fusca");
        Carro carro2 = new Carro("Gol");

        System.out.println("Carro 1 é um: " + carro1.getModelo());
        
        System.out.println("Fábrica produziu até agora: " + Carro.getTotalDeCarrosFabricados());
        System.out.println(Carro.totalDeCarrosFabricados++);
    }
}
