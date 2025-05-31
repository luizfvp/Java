/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = leia.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        int num2 = leia.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        }

        leia.close();
    }
}
