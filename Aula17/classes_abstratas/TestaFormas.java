package Aula17.classes_abstratas;

public class TestaFormas {
    public static void main(String[] args) {
        
        // ERRO DE COMPILAÇÃO!
        //FormaGeometrica f1 = new FormaGeometrica(); // "FormaGeometrica é abstrata; não pode ser instanciada"

        // Polimorfismo
        // Podemos usar a classe abstrata como TIPO de referência.
        FormaGeometrica forma1 = new Quadrado(10.0);
        
        System.out.println("Nome: " + forma1.getNome());
        System.out.println("Área: " + forma1.calcularArea()); // Chama o método do Quadrado
    }
}
