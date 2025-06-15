/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/14
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char[][][] cinema = {
            {//Sala 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 4
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 5
            },
            {//Sala 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 4
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 5
            },
            {//Sala 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 4
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L',}, //fileira 5
            }
        };
        
        int sala = 0, fileira = 0, poltrona = 0;
        String resposta = "";

        while (!resposta.equalsIgnoreCase("sair")) {
            
            System.out.println("Reservar poltrona no cinema:");

            System.out.println("Digite o número da sala desejada: (escolha de 1 a 3)");
            sala = leia.nextInt() - 1;
            
            if (sala >= 0 && sala < cinema.length) {
                System.out.println("Digite o número da fileira desejada na sala " + ( sala + 1) + ": (escolha de 1 a 5)");
                fileira = leia.nextInt() - 1;

                if (fileira >= 0 && fileira < cinema[sala].length) {
                    System.out.println("Digite o número da poltrona desejada na fileira " + (fileira + 1) + " da sala " + (sala + 1) + ": (escolha de 1 a 10)");
                    poltrona = leia.nextInt() - 1;

                    if (poltrona >= 0 && poltrona < cinema[sala][fileira].length) {
                        if (cinema[sala][fileira][poltrona] == 'L') {
                            cinema[sala][fileira][poltrona] = 'O';
                            System.out.println("Poltrona reservada com sucesso.");
                        } else {
                            System.out.println("Poltrona ocupada. Tente outra.");
                        }
                    } else {
                        System.out.println("Poltrona inválida.");
                        continue;
                    }
                } else {
                    System.out.println("Fileira inválida.");
                    continue;
                }
            } else {
                System.out.println("Sala inválida.");
                continue;
            }
            
            System.out.println("Deseja realizar uma nova reserva?");
            System.out.println("Digite 'sim' para continuar ou 'sair' para encerrar o programa.");
            resposta = leia.next();
            continue;
        }

        System.out.println("\nMapa do cinema ATUALIZADO:");
        for (int i = 0; i < cinema.length; i++) {
            System.out.println("\nSala " + (i + 1) + ": ");
            for (int j = 0; j < cinema[i].length; j++) {
                for (int k = 0; k < cinema[i][j].length; k++) {
                    System.out.print(cinema[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        leia.close();
    }
}