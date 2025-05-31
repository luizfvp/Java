package Questao7;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int valor1;
        double valor2, resultado;

        System.out.println("Digite um valor inteiro: ");
        valor1 = leia.nextInt();
        System.out.println("Digite um segundo valor real: ");
        valor2 = leia.nextDouble();

        resultado = valor1 + valor2;

        System.out.printf("A soma de " + valor1 + " + %.2f é igual a: %.2f", valor2, resultado);
    }
}
