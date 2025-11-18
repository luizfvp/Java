import java.util.Scanner;
import java.util.Random;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = random.nextInt(100);
                matrizB[i][j] = random.nextInt(100);
            }
        }

        System.out.println("\nPrimeira matriz: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j] + " | ");
            }
            System.out.print("\n");
        }

        System.out.println("\nSegunda matriz: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print(matrizB[i][j] + " | ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nSoma das duas matrizes: ");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                System.out.print(matrizC[i][j] + " | ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
