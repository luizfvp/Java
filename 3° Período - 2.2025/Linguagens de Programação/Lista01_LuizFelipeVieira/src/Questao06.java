import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o %d° valor da %d° linha: ", (j + 1), (i + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        int determinante =
                matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) -
                matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]) +
                matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        System.out.println("\nMatriz informada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDeterminante da matriz = " + determinante);

        sc.close();
    }
}
