/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor=0;
        boolean verificacao = false;

        int[] elemento = new int[]{5,15,25,35,45};

        System.out.println("Digite um valor: ");
        valor = leia.nextInt();

        for (int i = 0; i < elemento.length; i++) {
            if (valor == elemento[i]) {
                System.out.println("O valor está no vetor, na " + (i+1) + "° posição.");
                verificacao = true;
                break;
            }
        }

        if (verificacao == false) {
            System.out.println("O valor não está no vetor.");
        }

        leia.close();
    }
}
