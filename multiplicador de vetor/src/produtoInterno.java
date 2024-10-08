import java.util.Scanner;

public class produtoInterno {
    public static void main(String[] args) {
        int tamanho, tamanho2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o tamanho do vetor:");
        tamanho = scanner.nextInt();

        System.out.println("Escreva o tamanho do vetor2:");
        tamanho2 = scanner.nextInt();

        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho2];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Escreva os elementos vetor:");
            vetor[i] = scanner.nextInt();
        }
        for (int j = 0; j < tamanho2; j++) {
            System.out.println("Escreva os elementos do vetor2:");
            vetor2[j] = scanner.nextInt();
            ;
        }
        System.out.println("vetor:");
        for (int i = 0; i < tamanho; i++) {

            System.out.println(vetor[i]+"");

        }
        System.out.println("vetor2:");
        for (int j = 0; j < tamanho2; j++) {

            System.out.println(vetor2[j]+"");
        }
        int produtointerno = 0;
        int [] multiplicacaovetor = new int [tamanho];
        System.out.println("Multiplicação de vetor:");
        for (int i = 0; i < tamanho; i++) {
            produtointerno += vetor[i] * vetor2[i];
            multiplicacaovetor[i] += vetor[i]*vetor2[i];
            System.out.println(multiplicacaovetor[i]+"");
        }
        System.out.println("Produto interno do vetor: "+produtointerno);
    }
}
