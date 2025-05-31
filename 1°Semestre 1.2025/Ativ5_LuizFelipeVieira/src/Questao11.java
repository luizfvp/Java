/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao11 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario: ");
        double salario = leia.nextDouble();

        double reajuste = 0;

        if (salario < 500) {
            reajuste = salario * 0.15;
        } else if (salario >= 500 && salario <= 1000) {
            reajuste = salario * 0.10;
        } else {
            reajuste = salario * 0.05;
        }

        double salarioFinal = salario + reajuste;

        System.out.printf("O seu novo salario com o reajuste é %.2f\n", salarioFinal);

        leia.close();
    }
}
