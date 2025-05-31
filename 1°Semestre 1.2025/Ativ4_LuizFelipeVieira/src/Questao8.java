/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o valor da prestação em atraso: ");
        double prestacao = leia.nextDouble();

        double acrescimo = (prestacao * 1.15);
        double desconto = ((acrescimo) * 0.85);
        double prejuizo = (acrescimo - desconto);

        System.out.printf("O valor final a ser pago é R$%.2f. E o prejuizo do comerciante foi de R$%.2f\n", desconto, prejuizo);

        leia.close();
    }
}
