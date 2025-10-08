package Aula10;

public class Carro {

    String marca;
    String modelo;
    int ano;
    Cor corDoCarro;

    Carro(String marcaCarro, String modeloCarro, int anoCarro, Cor corCarro ){
        marca = marcaCarro;
        modelo = modeloCarro;
        ano = anoCarro;
        corDoCarro = corCarro;
    }

    Carro(){

    }

    public void ligar() {
        System.out.println("O " + modelo + " ligou!");
    }

    public void desligar() {
        System.out.println("O " + modelo + " desligou.");
    }

    public void acelerar() {
        System.out.println("O " + modelo + " está acelerando... Vrum vrum!");
    }
}