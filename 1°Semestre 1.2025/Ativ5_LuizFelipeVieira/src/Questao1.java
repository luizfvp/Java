/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = leia.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = leia.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média do aluno é: %.2f\n", media);

        if (media < 3.0) {
            System.out.println("O aluno está REPROVADO!");
            } else if (media < 7.0) {
                System.out.println("O aluno precisa fazer o Exame de Recuperação.");
                double notaExame = (6.0 * 2) - media;
                System.out.printf("Para ser aprovado, o aluno precisa tirar %.2f no exame.\n", notaExame);
            } else {
                System.out.println("O aluno está APROVADO!");
        }

        leia.close();
    }
}
