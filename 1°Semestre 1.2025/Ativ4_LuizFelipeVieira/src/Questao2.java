/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/24
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto: ");
        double preco = leia.nextDouble();
        System.out.println("Digite a quantidade de produtos: ");
        int quantidade = leia.nextInt();

        double total = (preco * quantidade);
        System.out.printf("O valor de custo total dos produtos é R$%.2f", total);

        leia.close();
    }
}
