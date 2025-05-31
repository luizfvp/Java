/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leia.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = leia.nextInt();
        System.out.println("Digite o quarto número: ");
        int num4 = leia.nextInt();
        System.out.println("Digite o quinto número: ");
        int num5 = leia.nextInt();

        double soma = num1 + num2 + num3 + num4;
        double media = soma / 5;

        System.out.printf("O valor da soma dos números: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5+ " é igual a %.0f \n", soma);
        System.out.printf("O valor da media dos números: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5+ " é igual a %.0f \n", media);

        leia.close();
    }
}
