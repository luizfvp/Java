/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o custo de fabrica do veículo: ");
        double custo_fab = leia.nextDouble();

        double imposto = custo_fab * 45/100;
        double valor_dist = custo_fab * 12/100;
        double custo_cons = custo_fab + imposto + valor_dist;

        System.out.printf("O valor pago a distribuidora é de R$%.2f\n", custo_cons);
        System.out.printf("O valor dos impostos é de R$%.2f\n", imposto);

        leia.close();
    }
}
