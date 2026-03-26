package Aula19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excecoes {
    
    public void exibirLinha(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        Scanner scanner;
        try {
            scanner = new Scanner(arquivo);
            if (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

}
