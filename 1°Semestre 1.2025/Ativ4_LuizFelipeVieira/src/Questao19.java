/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/29
 */

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a medida da base do triângulo: ");
        double base = leia.nextDouble();
        System.out.println("Digite a medida da altura do triândulo: ");
        double altura = leia.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é igual a: %.2f", area);

        leia.close();
    }
}
