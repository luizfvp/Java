import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] valores = new int[5][5];

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (i == j) {
                    valores[i][j] = 0;
                } else if (i < j) {
                    valores[i][j] = 1;
                } else {
                    valores[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                System.out.print(valores[i][j] + " | ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
