/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Arrays;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char[] letras = new char[10];
        char[] vogais = new char[10];
        int Totalvogais = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite a " +(i + 1)+ "° letra: ");
            letras[i] = leia.next().charAt(0);

            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
                vogais[Totalvogais] = letras[i];
                Totalvogais++;
            }
        }

        System.out.println("\nO total de vogais é: " + Totalvogais);
        System.out.println("As vogais digitadas foram: " + Arrays.toString(vogais));

        leia.close();
    }
}
