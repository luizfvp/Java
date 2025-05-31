/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao7 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        double quant_latas = (((6*10) /3) /5);
        double custo = quant_latas * 50;

        System.out.printf("A quantidade de latas para pintar o cômodo é: %.0f\n", quant_latas);
        System.out.printf("O custo com tintas para pintar o cômodo é: R$%.2f\n", custo);

        leia.close();
    }
}
