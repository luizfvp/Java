package Questao12;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String letra;
        int numero;

        System.out.println("Digite uma letra: ");
        letra = leia.nextLine();

        System.out.println("Digite um número: ");
        numero = leia.nextInt();

        System.out.println("Você digitou o número: " + numero + " e a letra: " + letra);

    }
}
