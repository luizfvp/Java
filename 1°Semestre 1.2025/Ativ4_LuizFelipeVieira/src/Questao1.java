/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/24
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = leia.nextInt();
        double quadrado = Math.pow(valor, 2);

        System.out.println("O quadrado do valor " + valor + " é " + quadrado);

        leia.close();
    }
}
