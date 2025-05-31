/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double gasolinaL = 6.40;
        double alcoolL = 4.60;

        System.out.println("Digite a quantidade de litros vendidas: ");
        double litros = leia.nextDouble();

        System.out.println("Qual o tipo de combustível que deseja: ");
        System.out.println("[1] Gasolina");
        System.out.println("[2] Alcool");
        int opcao = leia.nextInt();

        String tipo = null;

        if (opcao == 1) {
            tipo = "Gasolina";
        } else if (opcao == 2) {
            tipo = "Alcool";
        } else {
            System.out.println("Você não selecionou uma alternativa correta.");
            System.exit(0);
        }

        double totalGasolina = litros * gasolinaL;
        double totalAlcool = litros * alcoolL;
        double desconto;

        if (tipo.equals("Alcool") && litros < 20) {
            desconto = totalAlcool * 0.03;
            System.out.printf("O valor total a ser pago é: R$%.2f", totalAlcool-desconto);
        } else if (tipo.equals("Alcool") && litros >= 20) {
            desconto = totalAlcool * 0.05;
            System.out.printf("O valor total a ser pago é: R$%.2f", totalAlcool-desconto);
        } else if (tipo.equals("Gasolina") && litros < 20) {
            desconto = totalGasolina * 0.04;
            System.out.printf("O valor total a ser pago é: R$%.2f", totalGasolina-desconto);
        } else if (tipo.equals("Gasolina") && litros >= 20) {
            desconto = totalGasolina * 0.06;
            System.out.printf("O valor total a ser pago é: R$%.2f", totalGasolina-desconto);
        }

        leia.close();
    }
}
