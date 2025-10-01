import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dimensões da primeira matriz
        System.out.print("Digite o número de linhas da primeira matriz: ");
        int l1 = sc.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int c1 = sc.nextInt();

        // Dimensões da segunda matriz
        System.out.print("Digite o número de linhas da segunda matriz: ");
        int l2 = sc.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int c2 = sc.nextInt();

        // Verificação se é possível multiplicar
        if (c1 != l2) {
            System.out.println("\nNão é possível multiplicar as matrizes!");
        }

        int[][] matriz1 = new int[l1][c1];
        int[][] matriz2 = new int[l2][c2];
        int[][] resultado = new int[l1][c2];

        // Preencher a primeira matriz automaticamente (1 até l1*c1)
        int valor = 1;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                matriz1[i][j] = valor++;
            }
        }

        // Preencher a segunda matriz automaticamente (1 até l2*c2)
        valor = 1;
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                matriz2[i][j] = valor++;
            }
        }

        // Multiplicação de matrizes
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Exibir primeira matriz
        System.out.println("\nMatriz 1:");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibir segunda matriz
        System.out.println("\nMatriz 2:");
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibir resultado
        System.out.println("\nResultado da multiplicação:");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }

}
