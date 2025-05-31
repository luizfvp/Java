/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valor1, valor2, valor3, valor4;

        System.out.println("Digite um valor: ");
        valor1 = leia.nextInt();

        System.out.println("Digite um segundo valor que seja MAIOR que " + valor1 + " : ");
        valor2 = leia.nextInt();

        if (valor2 > valor1) {
            System.out.println("Digite um terceiro valor que seja MAIOR que " + valor2 + " : ");
            valor3 = leia.nextInt();

            if (valor3 > valor2) {
                System.out.println("Digite um quarto valor qualquer: ");
                valor4 = leia.nextInt();
                if (valor4 > valor3) {
                    System.out.println("Valores em ordem decrescentes: " + valor4 + ", " + valor3 + ", " + valor2 + ", " + valor1);
                } else if (valor4 > valor2) {
                    System.out.println("Valores em ordem decrescentes: " + valor3 + ", " + valor4 + ", " + valor2 + ", " + valor1);
                } else if (valor4 > valor1) {
                    System.out.println("Valores em ordem decrescentes: " + valor3 + ", " + valor2 + ", " + valor4 + ", " + valor1);
                } else {
                    System.out.println("Valores em ordem decrescentes: " + valor3 + ", " + valor2 + ", " + valor1 + ", " + valor4);
                }
            } else {
                System.out.println("Error: o terceiro valor é MENOR ou IGUAL que " + valor2);
            }
        } else {
            System.out.println("Error: o segundo valor é MENOR ou IGUAL que " + valor1);
            System.exit(0);
        }


        leia.close();
    }
}
