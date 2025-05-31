/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double [] valores = new double[8];
        double total=0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor inteiro: ");
            valores[i] = leia.nextDouble();
            total += valores[i];
        }

        double media = total / valores.length;
        System.out.printf("\nA média dos valores armazenados é: %.2f", media);

        leia.close();
    }
}
