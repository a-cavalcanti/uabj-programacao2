package Aula08;

public class Aula08Matrizes {
    public static void main(String[] args) {
        
        char[][] jogoDaVelha = new char[3][3]; // 3 linhas e 3 colunas

        jogoDaVelha[1][1] = 'X';         
        jogoDaVelha[0][2] = 'O';         

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < matriz.length; i++) {            
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[][] meuArray = new int[2][];

        meuArray[0] = new int [2];
        meuArray[0] [0] = 6;
        meuArray[0] [1] = 7;

        meuArray[1] = new int [3];
        meuArray[1] [0] = 9;
        meuArray[1] [1] = 8;
        meuArray[1] [2] = 5;

        for (int i = 0; i < meuArray.length; i++) {            
            for (int j = 0; j < meuArray[i].length; j++) {
                System.out.print(meuArray[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] linhas: meuArray){
            for(int n: linhas){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
