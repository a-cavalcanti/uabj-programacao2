package Aula15.ExemploPolimorfismo;

import java.util.ArrayList;
import java.util.List; // Programando para a interface (Princípio da Substituição)

public class TesteBanco {
    
    public static void main(String[] args) {
        
        // --- PRINCÍPIO DA SUBSTITUIÇÃO ---
        
        List<Conta> minhasContas = new ArrayList<>();
        
        minhasContas.add(new ContaCorrente("111-2", 500.0));
        minhasContas.add(new Poupanca("333-4", 200.0));
        minhasContas.add(new Poupanca("555-6", 80.0));
        minhasContas.add(new ContaCorrente("777-8", 1000.0));

        System.out.println("Contas criadas. Total: " + minhasContas.size());

        
        System.out.println("\n--- DEMONSTRAÇÃO DE POLIMORFISMO ---");
        // Polimorfismo = "Muitas Formas"
        // MESMA AÇÃO (conta.sacar)
        // e ela se comporta de MUITAS FORMAS diferentes.

        for (Conta conta : minhasContas) {
            
            // A chamada é idêntica para todos:
            // O Java descobre em tempo de execução qual é o objeto REAL (C/C ou Poupança)
            // e chama o método @Override correto.
            conta.sacar(100.0);
        }
        
        
        System.out.println("\n--- Saldos Finais ---");
        for (Conta conta : minhasContas) {
            // Usando printf para formatar a saída
            System.out.printf("Conta %s - Saldo: R$%.2f\n", conta.getNumero(), conta.getSaldo());
        }
    }
}