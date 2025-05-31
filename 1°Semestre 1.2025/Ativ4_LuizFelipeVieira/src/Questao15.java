/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/29
 */

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = leia.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = leia.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int valor3 = leia.nextInt();

        int soma = valor1 + valor2 + valor3;
        int produto = valor1 * valor2 * valor3;

        System.out.println("A soma dos valores " + valor1 + ", " + valor2 + " e " + valor3 + " é igual a: " + soma);
        System.out.println("\n");
        System.out.println("O produto dos valores " + valor1 + ", " + valor2 + " e " + valor3 + " é igual a: " + produto);

        leia.close();
    }
}
