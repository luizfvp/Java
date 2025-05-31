package Questao8;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String letra;
        int numero;

        System.out.println("Digite uma letra: ");
        letra = leia.nextLine();
        System.out.println("Digite um número: ");
        numero = leia.nextInt();

        System.out.println("Você digitou: " + letra + numero);

    }
}
