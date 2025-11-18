import java.util.Scanner;
import java.util.Random;

public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] valores = new int[3][3];
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

        int soma = 0;
        
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (i == j) {
                    soma += valores[i][j]; 
                }
            }
        }

        System.out.print("\nA soma da diagonal principal da matriz é: " + soma);

        sc.close();
    }
}
