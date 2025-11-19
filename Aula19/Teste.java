package Aula19;

import java.io.File;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        // Unhandled exception type IOException
        // necessário adicionar bloco try/catch aqui
        File f = new File("arquivo.txt");
        f.createNewFile();
        
        try {
            Scanner esc = new Scanner(System.in);

            System.out.println("Digite um número inteiro: ");
            esc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro de mismatch " + e.getMessage());
            
        }
        
    }
}
