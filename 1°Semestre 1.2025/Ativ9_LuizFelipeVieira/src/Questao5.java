/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/14
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[][] tabuleiro = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        System.out.println("\nConsidere o tabuleiro a seguir: \n");
        System.out.println("1 | 2 | 3");
        System.out.println("---------");
        System.out.println("4 | 5 | 6");
        System.out.println("---------");
        System.out.println("7 | 8 | 9");
        
        int jogadas = 0;
        int posicao = 0;
        boolean vitoria = false;
        String jogador = "";
        String simbolo = "";

        while (jogadas < 9 && !vitoria) {
            if (jogadas % 2 == 0){
                jogador = "Jogador 1";
                simbolo = "X";
            } else {
                jogador = "Jogador 2";
                simbolo = "O";
            }

            boolean posicaoValida = false;
            while (!posicaoValida) {
                System.out.println("\n" + jogador + " (" + simbolo + "): Digite a posição que deseja jogar: ");
                posicao = leia.nextInt();

                if (posicao < 1 || posicao > 9) {
                    System.out.println("Posição inválida. Tente novamente.");
                    continue;
                }

                int linha = (posicao - 1) / 3;
                int coluna = (posicao - 1) % 3;

                if (!tabuleiro[linha][coluna].equals(" ")) {
                    System.out.println("Posição ocupada. Tente outra.");
                } else {
                    tabuleiro[linha][coluna] = simbolo;
                    posicaoValida = true;
                }
            }
            jogadas++;

            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.println(tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
                if (i < 2) {
                    System.out.println("----------");
                }
            }

            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0].equals(simbolo) && tabuleiro[i][1].equals(simbolo) && tabuleiro[i][2].equals(simbolo)) {
                    vitoria = true;
                }
                if (tabuleiro[0][i].equals(simbolo) && tabuleiro[1][i].equals(simbolo) && tabuleiro[2][i].equals(simbolo)) {
                    vitoria = true;
                }
            }
            if (tabuleiro[0][0].equals(simbolo) && tabuleiro[1][1].equals(simbolo) && tabuleiro[2][2].equals(simbolo)) {
                vitoria = true;
            }
            if (tabuleiro[0][2].equals(simbolo) && tabuleiro[1][1].equals(simbolo) && tabuleiro[2][0].equals(simbolo)) {
                vitoria = true;
            }

            if (vitoria) {
                System.out.println("\n" + jogador + " venceu!");
                break;
            }

            if (jogadas == 9){
                System.out.println("\nEmpate!");
                break;
            }
        }
        leia.close();
    }
}