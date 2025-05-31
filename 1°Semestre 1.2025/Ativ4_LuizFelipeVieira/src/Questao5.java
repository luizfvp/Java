/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/26
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a capacidade do tanque em litros: ");
        double cap_tanque = leia.nextDouble();

        System.out.println("Digite a quantidade de litros ");
        double quant_litros = leia.nextDouble();

        System.out.println("Digite a quilometragem percorrida desde o último abastecimento: ");
        double km_percorrida = leia.nextDouble();

        double consumo = km_percorrida / quant_litros;
        double autonomia = cap_tanque * consumo;

        System.out.printf("O consumo do veículo foi de %.2fKm/L. \n", consumo);
        System.out.printf("A autonomia do veículo é de %.2fKm.", autonomia);

        leia.close();
    }
}
