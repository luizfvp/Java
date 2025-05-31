package Questao9;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String valor1, valor2;
        boolean boolean1, boolean2, resultado;

        System.out.println("Digite [V] para verdadeiro ou [F] para falso: ");
        valor1 = leia.nextLine();
        boolean1 = valor1.equalsIgnoreCase("v");

        System.out.println("Digite novamente [V] para verdadeiro ou [F] para falso: ");
        valor2 = leia.nextLine();
        boolean2 = valor2.equalsIgnoreCase("v");

        resultado = (boolean1 && boolean2);

        System.out.println("O resultado dos dois valores é: " + resultado);

    }
}
