/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = leia.nextDouble();
        System.out.println("Digite a sua altura [em centimetros]: ");
        double alturaCM = leia.nextDouble();
        double altura = alturaCM / 100;

        double imc = peso / (altura * altura);
        System.out.printf("O seu IMC é de %.2f\n", imc);

        if (imc < 20) {
            System.out.println("Você está ABAIXO DO PESO!");
        } else if (imc >= 20 && imc < 24.9) {
            System.out.println("Você está com o peso NORMAL!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com EXCESSO DE PESO!");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Você está com OBESIDADE!");
        } else {
            System.out.println("Você está com OBESIDADE MÓRBIDA!");
        }

        leia.close();
    }
}
