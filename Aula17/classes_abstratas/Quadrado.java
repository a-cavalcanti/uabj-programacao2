package Aula17.classes_abstratas;

public class Quadrado extends FormaGeometrica {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    // 4. OBRIGAÇÃO: Se não implementarmos o calcularArea(), o código não compila!
    // A classe filha está "cumprindo a promessa" do pai.
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
