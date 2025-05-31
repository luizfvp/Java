/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;
import java.util.Random;

public class Questao9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(-10, 10);
        }

        System.out.println("Vetor formado com valores aleatórios entre -10 e 10: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }

        leia.close();
    }
}
