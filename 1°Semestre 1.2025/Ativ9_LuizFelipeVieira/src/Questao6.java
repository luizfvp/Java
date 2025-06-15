import java.util.Random;
import java.util.Scanner;

/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/14
 */

public class Questao6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();

        int tamanho = 5;
        int[][] campo = new int[tamanho][tamanho];
        boolean[][] revelado = new boolean[tamanho][tamanho];

        int bombas = 5;
        int colocadas = 0;
        while (colocadas < bombas) {
            int linha = rand.nextInt(tamanho);
            int coluna = rand.nextInt(tamanho);
            if (campo[linha][coluna] != -1) {
                campo[linha][coluna] = -1;
                colocadas++;
            }
        }

        boolean perdeu = false;
        int espacosParaRevelar = tamanho * tamanho - bombas;

        while (!perdeu && espacosParaRevelar > 0) {
            // Mostra o campo
            System.out.println("Campo:");
            // Imprime cabeçalho de colunas
            System.out.print("  ");
            for (int j = 0; j < tamanho; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int i = 0; i < tamanho; i++) {
                // Imprime letra da linha
                System.out.print((char)('A' + i) + " ");
                for (int j = 0; j < tamanho; j++) {
                    if (revelado[i][j]) {
                        if (campo[i][j] == -1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("0 ");
                        }
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }

            System.out.print("Digite a linha (A-E): ");
            String linhaStr = leia.next().toUpperCase();
            int l = linhaStr.charAt(0) - 'A';
            System.out.print("Digite a coluna (0-4): ");
            int c = leia.nextInt();

            if (l < 0 || l >= tamanho || c < 0 || c >= tamanho) {
                System.out.println("Coordenada inválida!");
                continue;
            }
            if (revelado[l][c]) {
                System.out.println("Posição já revelada!");
                continue;
            }

            revelado[l][c] = true;
            if (campo[l][c] == -1) {
                perdeu = true;
                System.out.println("Você encontrou uma bomba! Fim de jogo.");
            } else {
                espacosParaRevelar--;
                System.out.println("Espaço vazio!");
            }
        }

        System.out.println("Campo final:");
        System.out.print("  ");
        for (int j = 0; j < tamanho; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            System.out.print((char)('A' + i) + " ");
            for (int j = 0; j < tamanho; j++) {
                if (campo[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        if (!perdeu) {
            System.out.println("Parabéns! Você venceu!");
        }

        leia.close();
    }
}