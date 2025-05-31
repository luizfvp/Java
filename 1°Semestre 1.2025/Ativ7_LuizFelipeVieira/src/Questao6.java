/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] valor = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};

        while (true) {
            System.out.println("\nDigite um número inteiro: [ou digite '0' para encerrar]");
            int numero = leia.nextInt();

            if (numero == 0){
                break;
            }

            boolean verificacao = false;

            for (int i = 0; i < valor.length; i++) {
                if (numero == valor[i]) {
                    System.out.println("Este número está SIM, presente no vetor.");
                    System.out.println("Ele está na " + (i + 1) + "° posição do vetor.");
                    verificacao = true;
                    break;
                }
            }

            if (verificacao == false) {
                System.out.println("Este número NÃO está presente no vetor.");
            }
        }

        leia.close();
    }
}