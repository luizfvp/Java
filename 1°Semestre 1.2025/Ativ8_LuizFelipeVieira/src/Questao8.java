/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] valor = new int[5];

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor inteiro: ");
            valor[i] = leia.nextInt();
        }

        int menor = valor[0], maior = valor[0], indiceMenor=1, indiceMaior=1;

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] < menor) {
                menor = valor[i];
                indiceMenor = (i + 1);
            }

            if (valor[i] > maior) {
                maior = valor[i];
                indiceMaior = (i + 1);
            }
        }


        System.out.println("\nValores digitados: ");
        for (int i = 0; i < valor.length; i++) {
            System.out.print(valor[i] + " | ");
        }

        System.out.println("\nO menor valor é '" + menor + "' na " + indiceMenor + "° casa do vetor.");
        System.out.println("O maior valor é '" + maior + "' na " + indiceMaior + "° casa do vetor.");

        leia.close();
    }
}
