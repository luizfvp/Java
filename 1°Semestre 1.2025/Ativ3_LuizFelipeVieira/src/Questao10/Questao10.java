package Questao10;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int valor, absolute;

        System.out.println("Digite um valor inteiro: ");
        valor = leia.nextInt();

        absolute = Math.abs(valor);

        System.out.println("O valor absoluto do número " + valor + " é: " +absolute);
    }
}
