/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leia.nextInt();

        if (idade < 16) {
            System.out.println("A sua classe eleitoral é: NÃO ELEITOR.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("A sua classe eleitoral é: ELEITOR OBRIGATÓRIO.");
        } else if (idade >= 16 && idade <= 18 || idade > 65) {
            System.out.println("A sua classe eleitoral é: ELEITOR FACULTATIVO.");
        }

        leia.close();
    }
}
