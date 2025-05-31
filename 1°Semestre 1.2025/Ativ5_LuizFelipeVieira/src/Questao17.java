/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = leia.nextDouble();

        double desconto = 0;

        if (salario <= 1100) {
            desconto = salario * 0.075;
            System.out.printf("O valor do salario é %.2f e o desconto é de %.2f", salario, desconto);
        } else if (salario >= 1100.01 && salario <= 2203.48) {
            desconto = salario * 0.09;
            System.out.printf("O valor do salario é %.2f e o desconto é de %.2f", salario, desconto);
        } else if (salario >= 2203.49 && salario <= 3305.22) {
            desconto = salario * 0.12;
            System.out.printf("O valor do salario é %.2f e o desconto é de %.2f", salario, desconto);
        } else if (salario >= 3305.23 && salario <= 6433.57) {
            desconto = salario * 0.14;
            System.out.printf("O valor do salario é %.2f e o desconto é de %.2f", salario, desconto);
        } else {
            desconto = 6433.57 * 0.14;
        }

        leia.close();
    }
}
