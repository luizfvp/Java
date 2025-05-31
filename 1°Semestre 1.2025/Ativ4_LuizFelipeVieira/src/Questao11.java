/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabeto: ");
        String letra1 = leia.nextLine();
        System.out.println("Digite uma segunda letra do alfabeto: ");
        String letra2 = leia.nextLine();
        System.out.println("Digite uma terceira letra do alfabeto: ");
        String letra3 = leia.nextLine();
        System.out.println("Digite uma quarta letra do alfabeto: ");
        String letra4 = leia.nextLine();
        System.out.println("Digite uma quinta letra do alfabeto: ");
        String letra5 = leia.nextLine();

        System.out.println("As letras digitas foram: " + letra1 + letra2 + letra3 + letra4 + letra5);
        System.out.println("As letras digitas foram: \n" + letra1 + "\n" + letra2 + "\n" + letra3 + "\n" + letra4 + "\n" + letra5);

        leia.close();
    }
}
