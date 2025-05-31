/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/29
 */

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = leia.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = leia.nextInt();

        int quociente = valor1 / valor2;
        int resto = valor1 % valor2;

        System.out.println("O quociente dos valores " + valor1 + " e " + valor2 + " é igual a " + quociente + " e o resto da divisão é igual a " + resto);

        leia.close();
    }
}
