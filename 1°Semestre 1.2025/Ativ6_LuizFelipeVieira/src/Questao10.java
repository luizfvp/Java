/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/17
 */

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int palpite, escolhido=26, c=0;


        while (true) {
            System.out.println("Tente adivinhar qual o número estou pensando? ");
            palpite = leia.nextInt();

            if (palpite == escolhido) {
                break;
            } else if (palpite > escolhido) {
                System.out.println("VOCÊ ERROU! O número digitado é MAIOR que o escolhido!");
                c++;
            } else {
                System.out.println("VOCÊ ERROU! O número digitado é MENOR que o escolhido!");
                c++;
            }
        }

        System.out.println("PARABÉNS, você acertou!");
        System.out.println("Você acertou em "+c+" tentativas!");

        leia.close();
    }
}