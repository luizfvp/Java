package Questao5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int valor1, valor2, resultado;

        System.out.println("Digite um número inteiro: ");
        valor1 = leia.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        valor2 = leia.nextInt();

        resultado = valor1 + valor2;

        System.out.println("A soma de " + valor1 + "+" + valor2 + " é igual a: " + resultado);

    }
}
