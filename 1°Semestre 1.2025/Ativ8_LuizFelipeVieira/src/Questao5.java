/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] valores = new int[20];
        int pares=0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " +(i+1)+ "° valor: ");
            valores[i] = leia.nextInt();

            if (valores[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Existem " + pares + " valores pares." );

        leia.close();
    }
}
