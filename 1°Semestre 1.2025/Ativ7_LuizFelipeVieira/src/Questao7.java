/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Arrays;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char[] letras = new char[6];

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite a " +(i + 1)+ "° letra: ");
            letras[i] = leia.next().charAt(0);
        }

        System.out.println("\nAs letras digitadas foram: " + Arrays.toString(letras));

        leia.close();
    }
}
