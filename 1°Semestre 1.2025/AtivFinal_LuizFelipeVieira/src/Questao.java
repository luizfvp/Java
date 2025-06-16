/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/15
 */

import java.util.Scanner;

public class Questao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String[] setor = new String[3]; //nome do setor tipo String
        int[][] funcionarios = new int[setor.length][2]; //matriz bidimensional tipo int, com número de setores e coluna para homens e mulheres
        double[] porcentagemMulheres = new double[setor.length]; //porcentagem de mulheres de cada setor

        for (int i = 0; i < setor.length; i++) {
            System.out.println("\nDigite o nome do " + (i + 1) + "° setor: ");
            setor[i] = leia.nextLine(); //receber o nome do setor no vetor

            System.out.println("Digite o número de funcionarios homens do " + (i + 1) + "° setor: ");
            funcionarios[i][0] = leia.nextInt(); //receber na primeira coluna da matriz bidimensional o número de homens

            System.out.println("Digite o número de funcionarias mulheres do " + (i + 1) + "° setor: ");
            funcionarios[i][1] = leia.nextInt(); //receber na segunda coluna da matriz bidimensional o número de mulheres
            leia.nextLine();

            int totalProvisorio = funcionarios[i][0] + funcionarios[i][1]; //calculando a soma de homens com mulheres
            double totalFuncionarios = totalProvisorio; //convertendo o total, que era tipo Int, em tipo double

            porcentagemMulheres[i] = (funcionarios[i][1] / totalFuncionarios) * 100; //calculando a porcentagem de mulheres
        }

        System.out.println("\n------------------------------------------------------");
        System.out.println("Relatório de Funcionários por Setor: ");
        for (int i = 0; i < setor.length; i++) {
            System.out.printf("\nNome do Setor: %s\nNúmero de Homens: %s\nNúmero de Mulheres: %s\nPercentual de Mulheres: %.1f%%\n", setor[i], funcionarios[i][0], funcionarios[i][1], porcentagemMulheres[i]);
        }

        System.out.println("\n------------------------------------------------------");
        System.out.println("Setores com menos de 30% de Mulheres: ");
        for (int i = 0; i < setor.length; i++) {
            if (porcentagemMulheres[i] < 30) {
                System.out.printf("\nNome do Setor: %s\nPercentual de Mulheres: %.1f%%\n", setor[i], porcentagemMulheres[i]);
            } else {
                System.out.println("\nNão há setor com menos de 30% de mulheres");
            }
        }

        leia.close();
    }
}