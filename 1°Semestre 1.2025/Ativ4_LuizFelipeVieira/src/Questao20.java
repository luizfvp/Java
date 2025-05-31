/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/03/29
 */

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = leia.nextLine();
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = leia.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = leia.nextDouble();
        System.out.println("Digite a  sua terceira nota: ");
        double nota3 = leia.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.printf("A média das notas %.2f - %.2f - %.2f do aluno " + aluno + ", é igual a: %.2f", nota1, nota2, nota3, media);

        leia.close();
    }
}
