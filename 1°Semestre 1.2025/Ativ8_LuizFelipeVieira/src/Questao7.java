/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i+1) + "° valor inteiro: ");
            valores[i] = leia.nextInt();
        }

        System.out.println("\nValores digitados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " | ");
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length - 1; j++) {
                if (valores[j] > valores[j+1]) {
                    int aux = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = aux;
                }
            }
        }

        System.out.println();
        System.out.println("\nValores em ordem decrescente: ");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " | ");
        }

        leia.close();
    }
}
