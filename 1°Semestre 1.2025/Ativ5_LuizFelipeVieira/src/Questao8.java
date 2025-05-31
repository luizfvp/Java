/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao8 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = leia.nextInt();

        if (valor < 0) {
            System.out.println("Este valor é negativo.");
        } else {
            System.out.println("Este valor é positivo.");
        }

        leia.close();
    }
}
