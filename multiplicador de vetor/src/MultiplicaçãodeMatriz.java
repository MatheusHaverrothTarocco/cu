import java.util.Scanner;

public class MultiplicaçãodeMatriz {
    public static void main(String[] args) {
        int linhasA, colunasA, linhasB, colunasB;

        Scanner scanner = new Scanner(System.in);
do {
    System.out.println("Linhas da Matriz A");
    linhasA = scanner.nextInt();
    System.out.println("colunas da Matriz A");
    colunasA = scanner.nextInt();
    System.out.println("Linhas da Matriz B");
    linhasB = scanner.nextInt();
    System.out.println("colunas da Matriz B");
    colunasB = scanner.nextInt();


    if (linhasA != colunasB) {
        System.out.println("Multiplicação não é possível. O número de linhas da matriz A deve ser igual ao número de colunas da matriz B");
    }
}while(linhasA != colunasB);



        int [][] A = new int [linhasA][colunasA];


        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.println("Digite os elementos da matriz A");
                A[i][j] = scanner.nextInt();
            }
        }
        int [][] B = new int [linhasB][colunasB];

        for (int f = 0; f < linhasB; f++) {
            for (int k = 0; k < colunasB; k++) {
                System.out.println("Digite os elementos da matriz B");
                B[f][k] = scanner.nextInt();
            }
        }
        System.out.println("Matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print(A[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("Matriz B:");
        for (int f = 0; f < linhasB; f++) {
            for (int k = 0; k < colunasB; k++) {
                System.out.print(B[f][k]+"\t");
            }
            System.out.println();
        }



    int[][] C = new int[linhasA][colunasB];


        for (int i = 0; i < linhasA; i++) {
        for (int j = 0; j < colunasB; j++) {
            for (int k = 0; k < colunasA; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

        System.out.println("Matriz Resultante C (A * B):");
        for (int i = 0; i < linhasA; i++) {
        for (int j = 0; j < colunasB; j++) {
            System.out.print(C[i][j] + "\t");
        }
        System.out.println();
    }
}
}
