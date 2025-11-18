import java.util.Scanner;
import java.util.Random;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int[][] valores = new int[4][4];

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

        int contador = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i][j] > 10) {
                    contador++;
                }
            }
        }

        System.out.printf("\nA matriz possui %d valores maiores que 10.", contador);

        sc.close();
    }
}
