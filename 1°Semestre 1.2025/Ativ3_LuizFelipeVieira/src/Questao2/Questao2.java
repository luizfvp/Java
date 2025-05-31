package Questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor real(separado por virgula): ");
        valor = leia.nextDouble();

        System.out.println("O valor real digitado foi: " + valor);

    }
}
