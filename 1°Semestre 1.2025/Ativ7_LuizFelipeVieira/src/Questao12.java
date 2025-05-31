/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];
        double[] altura = new double[10];

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome da " +(i+1)+ "° pessoa: ");
            nomes[i] = leia.nextLine();

            System.out.println("Digite a idade dela: ");
            idades[i] = leia.nextInt();

            System.out.println("Digite a altura dela: ");
            altura[i] = leia.nextDouble();

            leia.nextLine();
            System.out.print("\n");
        }

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Dados da " +(i+1)+ "° pessoa: ");
            System.out.println("Nome: " + nomes[i] + "\nIdade: " + idades[i] + "\nAltura: " + altura[i]);
        }

        leia.nextLine();
    }
}
