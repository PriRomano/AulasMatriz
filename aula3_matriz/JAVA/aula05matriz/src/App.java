package JAVA.aula05matriz.src;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int [][] minha_matriz = new int [3][2];

        // atribuir valor (primeiro linha depois coluna)
        // 3 linhas e 2 colunas / 6 espaços
        //      0       1
        //  0  [1]     [2] 
        //  1  [3]     [4]
        //  2  [5]     [6]

        minha_matriz[0][0] = 1;
        minha_matriz[0][1] = 2;

        minha_matriz[1][0] = 3;
        minha_matriz[1][1] = 4;

        minha_matriz[2][0] = 5;
        minha_matriz[2][1] = 6;

        // imprimir a matriz
        System.out.println(Arrays.deepToString(minha_matriz));

        // acesso direto (primeiro a linha depois a coluna)
        System.out.println(minha_matriz[2][0]);

        // interando uma matriz
        for (int linha=0; linha<minha_matriz.length;linha++){
            for (int col=0; col<minha_matriz[linha].length;col++){
                System.out.println(minha_matriz[linha][col]+"");
            }
            System.out.println("");
        }

        // matriz com valores preenchidos ou inicializados
        int [][] minha_matriz_v2 = {
                            {1,2},
                            {2,3},
                            {5,6}};

        // OU
        //int [][] minha_matriz_v2 = {{1,2},{2,3},{5,6}};
        
    }
}