/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/16
 */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao1 = 0, opcao2 = 0, opcao3 = 0, opcao4 = 0, opcao5 = 0, opcao6 = 0, votosTotal = 0;

        System.out.println("INICIO DA VOTAÇÃO: ");
        System.out.println("Digite '1' para votar no Daniel. ");
        System.out.println("Digite '2' para votar na Dayane. ");
        System.out.println("Digite '3' para votar na Maria. ");
        System.out.println("Digite '4' para votar na Patrick. ");
        System.out.println("Digite '5' para votar nulo. ");
        System.out.println("Digite '6' para votar em branco. ");
        System.out.println("Digite '0' para sair da votação. ");

        while(true){
            System.out.println("Digite o seu voto: ");
            int opcao = leia.nextInt();

            while(opcao < 0 || opcao > 6){
                System.out.println("O VALOR DIGITADO É INVALIDO! TENTE NOVAMENTE.");
                System.out.println("Digite '1' para votar no Daniel.");
                System.out.println("Digite '2' para votar na Dayane.");
                System.out.println("Digite '3' para votar na Maria.");
                System.out.println("Digite '4' para votar na Patrick.");
                System.out.println("Digite '5' para votar nulo.");
                System.out.println("Digite '6' para votar em branco.");
                System.out.println("Digite '0' para sair da votação.");
                opcao = leia.nextInt();
            }

            if (opcao == 0){
                break;
            }

            if(opcao == 1){
                opcao1++;
            } else if(opcao == 2){
                opcao2++;
            } else if(opcao == 3){
                opcao3++;
            } else if(opcao == 4){
                opcao4++;
            } else if(opcao == 5){
                opcao5++;
            } else if(opcao == 6){
                opcao6++;
            }

            votosTotal = opcao1 + opcao2 + opcao3 + opcao4 + opcao5 + opcao6;
        }

        System.out.println("\n RESULTADO DA VOTAÇÃO: ");
        System.out.println("O candidato Daniel recebeu: " +opcao1+ " votos (" +((opcao1*100)/votosTotal)+ "%)");
        System.out.println("A candidata Dayane recebeu: " +opcao2+ " votos (" +((opcao2*100)/votosTotal)+ "%)");
        System.out.println("A candidata Maria recebeu: " +opcao3+ " votos (" +((opcao3*100)/votosTotal)+ "%)");
        System.out.println("O candidata Patrick recebeu: " +opcao4+ " votos (" +((opcao4*100)/votosTotal)+ "%)");
        System.out.println("A quantidade de votos nulos foi: " +opcao5+ " votos (" +((opcao5*100)/votosTotal)+ "%)");
        System.out.println("A quantidade de votos em branco foi: " +opcao5+ " votos (" +((opcao5*100)/votosTotal)+ "%)");

        leia.close();
    }
}
