package Aula13;

import java.util.ArrayList;

public class ListaDeCompras {
    public static void main(String[] args) {
                
        ArrayList<String> compras = new ArrayList<>();
        
        compras.add("Leite");
        compras.add("Pão");
        compras.add("Leite");
        compras.add("Ovos");
        compras.add("Leite");
        System.out.println(compras.indexOf("Leite"));
        System.out.println(compras);
        System.out.println(compras.lastIndexOf("Leite"));
        compras.hashCode();
        
        System.out.println("Você tem " + compras.size() + " itens na lista.");

        System.out.println("--- Itens na Lista ---");
        for (String item : compras) {
            System.out.println("- " + item);
        }
        
        System.out.println("\nRemovendo 'Pão'...");
        compras.remove(1);

        System.out.println("\n--- Lista Final ---");
        for (String item : compras) {
            System.out.println("- " + item);
        }
    }
}
