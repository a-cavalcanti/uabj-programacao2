package Aula08;

import java.util.Scanner;

public class Aula08Exemplo {
    public static void main(String[] args) {
        String nome = "Passando parâmetro";        
        imprimir(nome);
        
        Scanner escaneador = new Scanner(System.in);
        String textoUsuario = escaneador.nextLine();
        imprimir(textoUsuario);
        
        System.out.println(soma(10, 15));
    }

    public static int soma(int num1, int num2){
        System.out.println("Chamou método int");
        int soma = num1 + num2;
        return soma;
    }

    public static void imprimir(String texto){
        System.out.println(texto);
    }
}
