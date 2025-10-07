package Aula08;

public class Aula08OperacoesMatematicas {

    public static void main(String[] args) {
        double s1 = somar(3, 4);
        System.out.println(s1);

        double s2 = somar(3, 5);
        System.out.println(s2);

        double d1 = dividir(12, 3);
        System.out.println(d1);

        double m1 = multiplicar(8, 9);
        System.out.println(m1);

        double sub1 = subtrair(3, 1);
        System.out.println(sub1);
        
        double sub2 = subtrair(2, 2);
        System.out.println(sub2);
    }

    public static double somar(double num1, double num2){
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        return num1 / num2;
    }

}
