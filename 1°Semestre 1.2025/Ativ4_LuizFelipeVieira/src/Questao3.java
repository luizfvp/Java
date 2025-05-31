/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/24
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da base maior do trapézio: ");
        double base_maior = leia.nextDouble();

        System.out.println("Digite o valor da base menor do trapézio: ");
        double base_menor = leia.nextDouble();

        System.out.println("Digite o valor da altura do trapézio: ");
        double altura = leia.nextDouble();

        double area = ((base_maior + base_menor) * altura / 2);
        System.out.println("A área do trapézio é: " + area);

        leia.close();
    }
}
