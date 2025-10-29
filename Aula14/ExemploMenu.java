package Aula14;

import java.util.Scanner;

public class ExemploMenu {
    public static void main(String[] args) {
        int x = 0;

        while (x != 4) {
            System.out.println("Digite 1 para adicionar;");
            System.out.println("Digite 2 para listar;");
            System.out.println("Digite 3 para remover;");
            System.out.println("Digite 4 para sair;");

            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Código para op 1");
                    break;
                case 2:
                    System.out.println("Código para op 2");
                    break;
                case 3:
                    System.out.println("Código para op 3");
                    break;
                case 4:
                    System.out.println("Saindo do sistema em 3,2,1...");
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            scan.close();
        }
    }
}
