public class Aula04ExemploPrintf {
    public static void main(String[] args) {
        
        int idade = 25;
        double salario = 4567.89123;
        String nome = "Anderson";
        boolean aprovado = true;
        char letra = 'A';

        // Inteiro
        System.out.printf("Idade: %d anos%n", idade);

        // String
        System.out.printf("Nome: %s%n", nome);

        // Double com 2 casas decimais
        System.out.printf("Salário: R$ %.2f%n", salario);

        // Boolean
        System.out.printf("Aprovado? %b%n", aprovado);

        // Caractere
        System.out.printf("Letra inicial: %c%n", letra);

        // Combinação de vários formatos
        System.out.printf("Funcionário: %s | Idade: %d | Salário: R$ %.2f%n",
                nome, idade, salario);

    }
}