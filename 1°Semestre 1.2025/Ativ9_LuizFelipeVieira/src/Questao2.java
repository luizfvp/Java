/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/14
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[][] valor = new int[2][3];
        int[][] valorInvertido = new int[3][2];

        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++){
                System.out.println("Digite um valor inteiro da " + (i + 1) + "° linha na " + (j + 1) + "° coluna: ");
                valor[i][j] = leia.nextInt();
            }
        }

        System.out.println("Valores digitados na ordem correta.");
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                System.out.print(valor[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                valorInvertido[j][i] = valor[i][j];
            }
        }

        System.out.println("Valores digitados na ordem inversa.");
        for (int i = 0; i < valorInvertido.length; i++) {
            for (int j = 0; j < valorInvertido[i].length; j++) {
                System.out.print(valorInvertido[i][j] + " ");
            }
            System.out.println();
        }


        leia.close();
    }

}
