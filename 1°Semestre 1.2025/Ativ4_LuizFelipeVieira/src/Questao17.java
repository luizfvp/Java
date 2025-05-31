/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/29
 */

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro com três digitos: ");
        int valor = leia.nextInt();

        int centena = valor / 100;
        int dezena = (valor % 100) / 10;
        int unidade = valor % 10;
        int invertido = (unidade * 100) + (dezena * 10) + centena;

        System.out.println("O número invertido é: " + invertido);

        leia.close();
    }
}
