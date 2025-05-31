/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Digite a sua altura: ");
        double altura = leia.nextDouble();

        System.out.printf("Você possui %d ano(s) de idade. E sua altura é de %.2f metros.\n", idade, altura);

        leia.close();
    }
}
