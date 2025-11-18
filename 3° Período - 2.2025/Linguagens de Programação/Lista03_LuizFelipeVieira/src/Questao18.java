import java.util.Scanner;
import java.util.Random;

public class Questao18 {
    public static int somaValores(int[] valores, int x) {
        if (x == valores.length) {
            return 0;
        } else {
            return valores[x] + somaValores(valores, x + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int[] valores = new int[5];

        for (int x = 0; x < valores.length; x++) {
            valores[x] = random.nextInt(100);
        }

        for (int x = 0; x < valores.length; x++) {
            System.out.print(valores[x] + " | ");
        }

        int resultado = somaValores(valores, 0);

        System.out.print("\nA soma de todos os valores do vetor é: " + resultado);

        sc.close();
    }
}
