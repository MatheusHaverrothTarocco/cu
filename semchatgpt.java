import java.util.Scanner;

public class semchatgpt {
    public static void main(String[] args) {
        int linha, bloco;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Escreva o número de linhas");
            linha = scanner.nextInt();

            System.out.println("Escreva o número de blocos");
            bloco = scanner.nextInt();
        } while (linha != 3 || bloco != linha);

        int[][] matriz = new int[linha][bloco];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < bloco; j++) {
                System.out.println("Escreva a linha:"+ (i+1) + (j+1));
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < bloco; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        if (matriz[1][0] == 0 && matriz[2][0] == 0 && matriz[2][1] == 0|| matriz[0][1] == 0 && matriz[0][2] == 0 && matriz[1][2] == 0) {
            int determinante = 0;

            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < bloco; j++) {
                    determinante = matriz[0][0] * matriz[1][1] * matriz[2][2];
                }
            }
            System.out.println("Determinante: " + determinante);
        }
    }
}
