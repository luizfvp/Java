package Questao11;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor, raiz;

        System.out.println("Digite um valor real: ");
        valor = leia.nextDouble();

        raiz = Math.sqrt(valor);

        System.out.printf("A raiz quadrada do valor " + valor + " é: %.2f", raiz);
    }
}
