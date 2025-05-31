/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/17
 */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String tipoVinho;
        int quantVinhos, totalTinto=0, totalBranco=0, totalRose=0;

        do {
            System.out.println("Escolha o tipo do vinho:\n[T] para Vinho Tinto\n[B] para Vinho Branco\n[R] para Vinho Rosê\n[F] para sair");
            tipoVinho = leia.nextLine();

            while (!tipoVinho.equalsIgnoreCase("T") && !tipoVinho.equalsIgnoreCase("B") && !tipoVinho.equalsIgnoreCase("R") && !tipoVinho.equalsIgnoreCase("F")) {
                System.out.println("O código informado é INVALIDO. Tente novamente. ");
                tipoVinho = leia.nextLine();
            }

            if (tipoVinho.equalsIgnoreCase("F")) {
                break;
            }

            System.out.println("Digite a quantidade de vinhos do estoque: ");
            quantVinhos = leia.nextInt();

            if (tipoVinho.equalsIgnoreCase("T")) {
                totalTinto += quantVinhos;
            } else if (tipoVinho.equalsIgnoreCase("B")) {
                totalBranco += quantVinhos;
            } else if (tipoVinho.equalsIgnoreCase("R")) {
                totalRose += quantVinhos;
            }

        } while (!tipoVinho.equalsIgnoreCase("F"));

        int totalVinhos = totalTinto + totalBranco + totalRose;

        System.out.println("\nEstoque de Vinhos:");
        System.out.println("- Vinhos Tinto: " +totalTinto+ " (" +((totalTinto*100)/totalVinhos)+"%)");
        System.out.println("- Vinhos Branco: " +totalBranco+ " (" +((totalBranco*100)/totalVinhos)+"%)");
        System.out.println("- Vinhos Rosê: " +totalRose+ " (" +((totalRose*100)/totalVinhos)+"%)");

        leia.close();
    }
}