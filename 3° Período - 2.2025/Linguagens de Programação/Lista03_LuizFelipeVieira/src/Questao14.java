import java.util.Scanner;
import java.util.Random;

public class Questao14 {
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

        boolean simetrica = true;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i][j] != valores[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica == true) {
            System.out.print("\nSIM! A matriz é simétrica.");
        } else {
            System.out.print("\nNÃO! A matriz não é simétrica.");
        }

        sc.close();
    }
}
