/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do deposito: ");
        double deposito = leia.nextDouble();
        System.out.println("Digite o valor ta taxa de juros mensal: ");
        double taxa = leia.nextDouble();

        double juros = taxa / 100;
        double rendimento = deposito * juros;

        System.out.println("Valores de rendimento do primeiro mês: " + (rendimento*1) + " com um total de: " + (deposito+(rendimento*1)));
        System.out.println("Valores de rendimento do segundo mês: " + (rendimento*2) + " com um total de: " + (deposito+(rendimento*2)));
        System.out.println("Valores de rendimento do terceiro mês: " + (rendimento*3) + " com um total de: " + (deposito+(rendimento*3)));



        leia.close();
    }
}
