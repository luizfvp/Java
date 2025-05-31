/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a letra [A]: ");
        String letra1 = leia.nextLine();
        System.out.println("Digite a letra [R]: ");
        String letra2 = leia.nextLine();

        System.out.println(letra1 + letra2 + letra1 + letra2 + letra1);

        leia.close();
    }
}
