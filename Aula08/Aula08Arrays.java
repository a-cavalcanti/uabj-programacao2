package Aula08;

public class Aula08Arrays {
    public static void main(String[] args) {
        // Declaração
        double[] notas; 

        // Construir
        notas = new double[4]; 
        // notas = new double[]{1.2, 3.4, 5.2, 2.1}; // construindo e preenchendo

        System.out.println(notas[0]);

        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 9.2;
        notas[3] = 6.8;

        //double[] notas = new double[4]; // declarando e construindo
        double soma = 0.0;

        // Usando um laço for para percorrer o array
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Acessando a nota no índice " + i + ": " + notas[i]);
            soma = soma + notas[i];
        }

        double media = soma / notas.length;
        System.out.println("A média da turma é: " + media);

        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        System.out.println("Hoje é " + diasDaSemana[4]);        
        
        for(double n: notas){
            System.out.println(n);
        }
    }
}
