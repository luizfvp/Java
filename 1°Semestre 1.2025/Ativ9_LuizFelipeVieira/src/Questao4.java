/*
 * @author Luiz Felipe Vieira
 * @RA 12127579
 * @version 1.00 2025/06/14
 */

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[][] temperatura = {
                {22.0, 24.2, 28.7},
                {25.5, 27.2, 29.5},
                {26.5, 28.2, 30.0},
                {27.5, 29.2, 31.5},
                {28.5, 30.2, 32.5},
                {29.5, 31.2, 33.5},
                {30.5, 32.2, 34.5}
        };

        int bairros = temperatura[0].length;
        int dias = temperatura.length;

        System.out.println("Temperatura média dos bairros por semana: ");
        for (int j = 0; j < bairros; j++) {
            double soma = 0;
            for (int i = 0; i < dias; i++) {
                soma += temperatura[i][j];
            }
            double media = soma / dias;
            System.out.printf("A média do %d° bairro é %.2fºC.\n", j + 1, media);
        }

        double maiorTemp = temperatura[0][0];
        int bairroMaior = 0;
        int diaMaior = 0;

        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < bairros; j++) {
                if (temperatura[i][j] > maiorTemp) {
                    maiorTemp = temperatura[i][j];
                    bairroMaior = j + 1;
                    diaMaior = i + 1;
                }
            }
        }

        System.out.printf("\nA maior temperatura registrada foi %.2fºC no %d° dia do %d° bairro.\n", maiorTemp, diaMaior, bairroMaior);

        leia.close();
    }
}
