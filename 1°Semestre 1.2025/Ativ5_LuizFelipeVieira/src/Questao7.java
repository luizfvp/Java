/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = leia.nextInt();

        if (valor <= 1) {
            System.out.println("Este valor não é primo");
        } else if (valor == 2 || valor == 3 || valor == 5 || valor == 7 || valor == 11 || valor == 13 || valor == 17 || valor == 19) {
            System.out.println("Este valor é primo");
            } else if (
                    valor % 2 == 0 ||
                    valor % 3 == 0 ||
                    valor % 5 == 0 ||
                    valor % 7 == 0) {
            System.out.println("Este valor não é primo");
        } else {
            System.out.println("Este valor é primo (não foi divisível por 2, 3, 5 ou 7)");
        }

        leia.close();
    }
}
