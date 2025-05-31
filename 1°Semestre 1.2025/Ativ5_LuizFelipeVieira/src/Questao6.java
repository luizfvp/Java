/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao6 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = leia.nextInt();

        int parImpar = valor % 2;

        if ( parImpar == 0 ) {
            System.out.println("O número é PAR!");
        } else {
            System.out.println("O número é IMPAR!");
        }

        leia.close();
    }
}
