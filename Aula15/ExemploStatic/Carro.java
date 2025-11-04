package Aula15.ExemploStatic;

class Carro {

    private String modelo; 
    static int totalDeCarrosFabricados = 0;

    public Carro(String modelo) {
        this.modelo = modelo;
        Carro.totalDeCarrosFabricados++;
    }

    public String getModelo() {
        return this.modelo;
    }

    public static int getTotalDeCarrosFabricados() {
        return Carro.totalDeCarrosFabricados; 
    }
}
