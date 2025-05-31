/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] nomes = new String[]{"Azul", "Amarelo", "Verde", "Vermelho", "Azul", "Amarelo", "Vermelho", "Amarelo"};
        boolean verificacao = false;

        System.out.println("Digite uma cor: ");
        String cor = leia.nextLine();
        int vezes = 0;

        for (int i = 0; i < nomes.length; i++) {
            if (cor.equalsIgnoreCase(nomes[i])) {
                verificacao = true;
                vezes++;
            }
        }

        if (vezes > 0) {
            System.out.println("A cor " + cor + " aparece " + vezes + " vezes no vetor.");
        } else {
            System.out.println("A cor " + cor + " não aparece no vetor.");
        }

        leia.close();
    }
}
