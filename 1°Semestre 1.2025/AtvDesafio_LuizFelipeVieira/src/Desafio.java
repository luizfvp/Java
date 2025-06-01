/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/06/01
 */

import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random aleatorizar = new Random();

        String[] nome = new String[20];
        String[] codigo = new String[nome.length];
        double[] consumo = new double[nome.length];
        double[] valorMedio = new double[nome.length];
        double tarifa;
        int meses = 12;

        System.out.println("Digite o valor da tarifa dos kW (em reais): ");
        tarifa = leia.nextDouble();
        leia.nextLine(); // Limpar o buffer do scanner
        System.out.println();

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "° cliente: ");
            nome[i] = leia.nextLine();
            
            codigo[i] = String.valueOf(aleatorizar.nextInt(1, 20));
            System.out.println("\nO cliente " + nome[i] + " possui o código: " + codigo[i]);
            
            for (int m = 0; m < meses; m++) {
                System.out.println("\nDigite o consumo em kW do " + (m + 1) + "° mês do cliente " + nome[i] + ": ");
                double consumoTemporario = leia.nextDouble();
                leia.nextLine(); // Limpar o buffer do scanner
                consumo[i] += consumoTemporario;
            }

            valorMedio[i] = (consumo[i] * tarifa) / meses;
            System.out.printf("\nO valor médio mensal do cliente %s é: R$ %.2f%n", nome[i], valorMedio[i]);
            System.out.println("\n--------------------------------------------------\n");
        }

        while (true) {
            System.out.println("\nBuscar cliente por nome ou código (Digite 'sair' para encerrar):");
            String buscar = leia.nextLine();
            
            if (buscar.equalsIgnoreCase("sair")) {
                System.out.println("\nEncerrando o programa...");
                break;
            }
            
            boolean clienteEncontrado = false;
            
            for (int i = 0; i < nome.length; i++) {
                if (buscar.equalsIgnoreCase(nome[i]) || buscar.equalsIgnoreCase(codigo[i])) {
                    System.out.printf("\nO cliente %s com o código %s, teve um consumo medio de %.2f kWh e um gasto médio de R$ %.2f por mês.\n"
                    , nome[i], codigo[i], (consumo[i]/meses), valorMedio[i]);
                    clienteEncontrado = true;
                    break;
                }
            }

            if (!clienteEncontrado) {
                System.out.println("Cliente não encontrado.");
            }
        }
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("               TABELA GERAL:");
        System.out.println("\n--------------------------------------------------");
        System.out.printf("%-20s | %-8s | %-18s | %-20s%n", "Cliente", "Código", "Consumo Médio (kWh)", "Valor Médio Mensal (R$)");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("%-20s | %-8s | %-18.2f | %-20.2f%n", 
                nome[i], codigo[i], (consumo[i]/meses), valorMedio[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
                            
        leia.close();
    }
}
