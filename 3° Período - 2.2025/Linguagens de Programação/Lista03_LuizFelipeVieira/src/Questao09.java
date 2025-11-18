import java.util.Scanner;
import java.util.Random;

public class Questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] valores = new int[4][4];
        Random random = new Random();

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

        int maior = valores[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i][j] > maior) {
                    maior = valores[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.printf("\nO maior valor da matriz é o %d, localizado na linha %d, coluna %d.", maior, linha, coluna);

        sc.close();
    }
}
