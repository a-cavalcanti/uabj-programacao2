package Aula08;

public class Aula08Metodos {
    public static void main(String[] args) {
        soma(2, 3);
        soma(2.0, 3.0);
    }

    public static int soma(int a, int b) {
        System.out.println("-> Versão com inteiros foi chamada!");
        return a + b;
    }

    public static  double soma(double a, double b) {
        System.out.println("-> Versão com doubles foi chamada!");
        return a + b;
    }
}
