import java.util.Scanner;

public class Questao07 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um valor inteiro para N (entre 2 e 5): ");
        int N = sc.nextInt();

        if (N < 2 || N > 5) {
            System.out.println("Valor inválido! N deve estar entre 2 e 5.");
        }

        int[][] matriz = new int[N][N];
        int[][] resultado = new int[N][N];

        // Preencher matriz com valores de 1 até N²
        int valor = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Calcular quadrado da matriz (multiplicação matriz x matriz)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int soma = 0;
                for (int k = 0; k < N; k++) {
                    soma += matriz[i][k] * matriz[k][j];
                }
                resultado[i][j] = soma;
            }
        }

        // Exibir matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibir resultado (matriz ao quadrado)
        System.out.println("\nMatriz ao quadrado:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

    sc.close();
}
}
