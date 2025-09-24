import java.util.Scanner;

public class Aula04EntradaPadrao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int inteiro = leitor.nextInt();  
        System.out.println("Digite um número real: ");
        double real = leitor.nextDouble();
        System.out.println("Digite um booleano: ");
        boolean logico = leitor.nextBoolean();
        leitor.nextLine();
        System.out.println("Digite uma string: ");
        String cadeia = leitor.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = leitor.next();

        System.out.println("inteiro = " + inteiro);
        System.out.println("real = " + real);
        System.out.println("logico = " + logico);
        System.out.println("cadeia = " + cadeia);
        System.out.println("palavra = " + palavra);
        
        leitor.close();
    }

}
