import java.util.Scanner;

public class Aula04OperadoresRelacionais {
	public static void main (String[] args){
		Scanner ler = new Scanner (System.in);
        
        System.out.printf("Informe um número inteiro: ");
		int a = ler.nextInt();

		if (a < 10){
			System.out.println("Valor menor que 10");
		} else if (a==10){
			System.out.println("Valor é 10");
		} else {
			System.out.println("Valor maior que 10");
		}
	}
}
