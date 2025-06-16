/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/15
 */

import java.util.Scanner;

public class Questao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String[] setor = new String[6]; //nome do setor tipo String
        int[][] funcionarios = new int[6][2]; //matriz bidimensional tipo int, com número de setores e coluna para homens e mulheres
        double[] porcentagemMulheres = new double[6]; //porcentagem de mulheres de cada setor

        for (int i = 0; i < setor.length; i++) {
            System.out.println("\nDigite o nome do " + (i + 1) + "° setor: ");
            setor[i] = leia.nextLine(); //receber o nome do setor no vetor

            System.out.println("\nDigite o número de funcionarios homens do " + (i + 1) + "° setor: ");
            funcionarios[i][0] = leia.nextInt(); //receber na primeira coluna da matriz bidimensional o número de homens

            System.out.println("\nDigite o número de funcionarias mulheres do " + (i + 1) + "° setor: ");
            funcionarios[i][1] = leia.nextInt(); //receber na segunda coluna da matriz bidimensional o número de mulheres
            leia.nextLine();

            int totalProvisorio = funcionarios[i][0] + funcionarios[i][1]; //calculando a soma de homens com mulheres
            double totalFuncionarios = totalProvisorio; //convertendo o total, que era tipo Int, em tipo double

            if (funcionarios[i][1] != 0) {
                porcentagemMulheres[i] = (funcionarios[i][1] / totalFuncionarios) * 100; //calculando a porcentagem de mulheres
            } else {
                porcentagemMulheres[i] = 0;
            }
        }

        for (int i = 0; i < setor.length; i++) {
            System.out.printf("\nNome do Setor: %s\nNúmero de Homens: %s\nNúmero de Mulheres: %s\nPercentual de Mulheres: %.1f%%\n", setor[i], funcionarios[i][0], funcionarios[i][1], porcentagemMulheres[i]);
            System.out.println( "--------------------------------");
        }

        leia.close();
    }
}