import java.util.Scanner;
import java.util.Random;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int[][] valores = new int[3][3];

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                valores[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                System.out.print(valores[i][j] + " | ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < valores.length; i++) {
            int somaLinha = 0;
            for (int j =0; j < valores.length; j++) {
                somaLinha += valores[i][j];
            }
            System.out.printf("\nSoma da linha %d = %d", i, somaLinha);
        }

        System.out.print("\n");

        for (int j = 0; j < valores.length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < valores.length; i++) {
                somaColuna += valores[i][j];
            }
            System.out.printf("\nSoma da coluna %d = %d", j, somaColuna);
        }

        sc.close();
    }
}
