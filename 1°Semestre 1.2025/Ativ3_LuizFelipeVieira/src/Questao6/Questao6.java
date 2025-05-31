package Questao6;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor1, valor2, resultado;

        System.out.println("Digite um número real: ");
        valor1 = leia.nextDouble();
        System.out.println("Digite um segundo número real: ");
        valor2 = leia.nextDouble();

        resultado = valor1 * valor2;

        System.out.println("A multiplicação de " + valor1 + "x" + valor2 + " é igual a: " + resultado);

    }
}
