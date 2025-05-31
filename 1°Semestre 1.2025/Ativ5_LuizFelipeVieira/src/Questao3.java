/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;
import java.util.Arrays;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = leia.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        int num2 = leia.nextInt();
        System.out.println("Digite um terceiro número inteiro: ");
        int num3 = leia.nextInt();

        int [] numeros= {num1,num2,num3};

        Arrays.sort (numeros);

        System.out.println(Arrays.toString(numeros));

        leia.close();
    }
}
