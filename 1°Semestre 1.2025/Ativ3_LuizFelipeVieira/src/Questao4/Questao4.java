package Questao4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int valorEscolhido, valorDigitado;
        boolean resultado;

        valorEscolhido = 6;

        System.out.println("Tente acertar o número que escolhi, de 0 a 10:");
        valorDigitado = leia.nextInt();

        resultado = valorEscolhido == valorDigitado;

        System.out.println("E a resposta é: " + resultado);

    }
}
