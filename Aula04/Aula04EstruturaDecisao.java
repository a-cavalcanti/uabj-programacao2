import java.util.Scanner;

public class Aula04EstruturaDecisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = leitor.nextInt();

        if (a < 10){
            System.out.println("Valor de a é menor que 10");
        } else if (a == 10){
            System.out.println("Valor de a é igual a 10");
        }else{
            System.out.println("Valor é maior que 10");
        }
        
    }
}
