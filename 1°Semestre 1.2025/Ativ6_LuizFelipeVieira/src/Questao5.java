/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/16
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valorTotal = 0;
        double [] dobroValor = new double[5];

        for (int i=0; i<5; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            double valor = leia.nextDouble();

            valorTotal += valor;
            dobroValor[i] = valor;
        }

        double valorMedio = valorTotal/5;

        System.out.printf("A soma de todos os números é: %.2f \n", valorTotal);
        System.out.printf("A média de todos os números é: %.2f \n", valorMedio);

        for (int i=0; i<5; i++){
            System.out.println("O dobro do número " + dobroValor[i] + " é: " + (dobroValor[i]*2));
        }

        leia.close();
    }
}
