/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char[] letras = new char[8];

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite a " +(i +1)+ "° letra: ");
            letras[i] = leia.next().charAt(0);
        }

        System.out.println("\nAs letras digitadas em ordem decrescente:");

        for(int i=letras.length - 1; i >= 0; i--){
            System.out.print(letras[i] + ", ");
        }

        leia.close();
    }
}
