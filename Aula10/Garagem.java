package Aula10;

import java.util.Scanner;

public class Garagem {
    public static void main(String[] args) {
        // O processo de INSTANCIAR um objeto
        // Carro meuFusca = new Carro();
        
        // Vamos quebrar essa linha:
        // Carro meuFusca   -> Declara uma variável que vai ser o "controle remoto" para um objeto Carro.
        // =                -> Atribuição.
        // new              -> A palavra mágica! "Java, crie um NOVO objeto na memória."
        // Carro()          -> E para criar, use a "receita inicial" (o construtor) da classe Carro.
        Cor corCarro = new Cor();
        corCarro.configurarCor(16, 255, 34);

        Carro meuFusca = new Carro("Volkswagen","Fusca", 1975, corCarro );
        meuFusca.corDoCarro.blue = 123;
        meuFusca.corDoCarro.configurarCor(0, 0, 0);

        // meuFusca.marca = "Volkswagen";
        // meuFusca.modelo = "Fusca";
        // meuFusca.ano = 1975;

        meuFusca.ligar();
        meuFusca.acelerar();
        
        System.out.println("Meu carro é um " + meuFusca.modelo + " ano " + meuFusca.ano);
        




        Carro carroNovo = meuFusca;
        carroNovo.modelo = "modifiquei o meu Fusca";
        System.out.println("Meu carro é um " + meuFusca.modelo + " ano " + meuFusca.ano);
    }
}
