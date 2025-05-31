/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao9 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = leia.nextInt();

        if (idade >= 5 && idade <= 7 ) {
            System.out.println("A sua categoria de nadador é INFANTIL!");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("A sua categoria de nadador é JUVENIL!");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("A sua categoria de nadador é ADOLESCENTE!");
        } else if (idade >= 16 && idade <= 30) {
            System.out.println("A sua categoria de nadador é ADULTO!");
        } else if (idade > 30) {
            System.out.println("A sua categoria de nadador é SÊNIOR!");
        } else {
            System.exit(0);
        }

        leia.close();
    }
}
