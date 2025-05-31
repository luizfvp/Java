/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/29
 */

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valor1 = 30;
        int valor2 = 15;
        int subtracao = valor1 - valor2;
        int multiplicacao = valor1 * valor2;

        System.out.println("A subtração do valor " + valor1 + " e o " + valor2 + " é igual a " + subtracao + "\nJá a sua multiplicação é igual a " + multiplicacao);

        leia.close();
    }
}
