package Aula17.classes_abstratas;

public abstract class FormaGeometrica {
    
    // 2. Um método CONCRETO (normal)
    // Todos os filhos herdam este método pronto.
    public String getNome() {
        return "Sou uma forma geométrica";
    }

    // 3. Um método ABSTRATO
    // - Não tem corpo {}. Termina com ponto e vírgula.
    // - FORÇA as classes filhas a implementarem este método.
    public abstract double calcularArea();
}