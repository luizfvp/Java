/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/14
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int [][] valor = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                System.out.print(valor[i][j] + " ");
            }
            System.out.println();
        }

        leia.close();
    }
}
