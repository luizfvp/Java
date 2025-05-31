/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double temp_c = leia.nextDouble();

        double temp_f = ((temp_c * 9/5) + 32);
        System.out.println("A temperatura de " + temp_c + " graus Celsius equivale a " + temp_f + " graus Fahrenheit");

        leia.close();
    }
}
