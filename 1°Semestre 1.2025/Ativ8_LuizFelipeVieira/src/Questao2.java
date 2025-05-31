/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] produto = new String[10];
        double[] valores = new double[produto.length];

        for (int i = 0; i < produto.length; i++) {
            System.out.println("Digite a descrição do " +(i+1)+ "° produto: ");
            produto[i] = leia.nextLine();

            System.out.println("Digite o valor do " +(i+1)+ "° produto: ");
            valores[i] = leia.nextDouble();
            leia.nextLine();
            System.out.println();
        }

        System.out.println("\nProdutos cadastrados: ");

        for (int i = 0; i < produto.length; i++) {
            System.out.print("- " +produto[i]);
            System.out.printf(": R$ %.2f%n",valores[i]);
        }

        System.out.println("\nDigite o percentual de aumento no valor dos produtos: ");
        double percentual = leia.nextInt();

        percentual = percentual / 100;

        for (int i = 0; i < produto.length; i++) {
            valores[i] += valores[i] * percentual;
        }

        System.out.println("\nValores atualizado com o acréscimo de " + (percentual*100) + "%");

        for (int i = 0; i < produto.length; i++) {
            System.out.print("- " +produto[i]);
            System.out.printf(": R$ %.2f%n",valores[i]);
        }


        leia.close();
    }
}
