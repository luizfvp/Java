/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o código do produto [de 1 a 40]: ");
        int codigo = leia.nextInt();

        System.out.println("Digite a quantidade de produtos comprados: ");
        int quant = leia.nextInt();

        double valorNota = 0;

        if (codigo >= 1 && codigo <= 10) {
            valorNota = 10;
        } else if (codigo >= 11 && codigo <= 20) {
            valorNota = 15;
        } else if (codigo >= 21 && codigo <= 30) {
            valorNota = 20;
        } else if (codigo >= 31 && codigo <= 40) {
            valorNota = 30;
        } else {
            System.out.println("ERROR: código do produto é invalido.");
            System.exit(0);
        }

        double valorTotal = valorNota * quant;

        System.out.printf("O valor unitário do produto com o código " + codigo + " é igual a %.2f\n", valorNota);
        System.out.printf("E o valor total da nota é igual a %.2f\n", valorTotal);

        double valorFinal = 0;

        if (valorTotal < 250) {
            valorFinal = valorTotal * 0.05;
        } else if (valorTotal >= 250 && valorTotal <= 500) {
            valorFinal = valorTotal * 0.10;
        } else {
            valorFinal = valorTotal * 0.15;
        }

        System.out.printf("O valor final com o desconto é de: %.2f\n", valorFinal);

        leia.close();
    }
}
