/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Você se chama, " + nome + ", e têm atualmente " + idade + " anos.");

        leia.close();
    }
}
