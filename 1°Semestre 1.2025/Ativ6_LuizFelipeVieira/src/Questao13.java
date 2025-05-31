/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/18
 */

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String descricaoProduto;
        double valorProduto, totalCompra=0;
        int quantProduto;

        do {
            System.out.println("Digite a descrição do produto: \n[para encerrar digite 'FIM']");
            descricaoProduto = leia.next();

            if (descricaoProduto.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.println("Digite o valor do produto: ");
            valorProduto = leia.nextDouble();

            System.out.println("Digite a quantidade de produtos: ");
            quantProduto = leia.nextInt();

            totalCompra += (valorProduto * quantProduto);

        } while (true);

        System.out.printf("O valor total da sua compra foi de R$%.2f", totalCompra);

        leia.close();
    }
}