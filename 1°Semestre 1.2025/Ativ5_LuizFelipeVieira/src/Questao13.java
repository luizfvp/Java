/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor1 = leia.nextInt();
        System.out.println("Digite um segundo valor inteiro: ");
        int valor2 = leia.nextInt();

        int valor3 = 0;

        if (valor1 == valor2) {
            valor3 = valor1 + valor2;
        } else {
            valor3 = valor1 * valor2;
        }

        System.out.println("O primeiro valor é " + valor1 + " , o segundo valor é " + valor2 + " e o terceiro valor é " + valor3);


        leia.close();
    }
}
