/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int [] valores = new int[6];
        int total = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor inteiro: ");
            valores[i] = leia.nextInt();
            total += valores[i];
        }

        System.out.println("\nA soma total dos valores é: " + total);

        leia.close();
    }
}
