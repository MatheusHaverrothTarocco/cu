import java.util.Scanner;

public class matriz_recursiva {



    public static void matrizRecursiva(int [][] matriz, int linhas, int colunas){


        if (linhas == matriz.length){
            return;
        }

        System.out.print(matriz[linhas][colunas]+ " ");

        if (colunas < matriz[linhas].length - 1){
            matrizRecursiva(matriz, linhas, colunas + 1);
        }else{
            System.out.println();
            matrizRecursiva(matriz, linhas + 1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas, colunas;

        System.out.println("Escreva o valor de linhas da matriz");
        linhas = scanner.nextInt();

        System.out.println("Escreva o valor de colunas da matriz");
        colunas = scanner.nextInt();

            int[][] matriz = new int[linhas][colunas];

        System.out.println("Escreva a matriz completa");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("A matriz é " + (i + 1) + " ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        matrizRecursiva(matriz,0,0);

        }
    }



