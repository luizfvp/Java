/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/14
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float mediaClasse = 0;
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        float totalClasse = 0;

        for (int i=1; i<=10; i++) {
            System.out.println("Digite o nome do " + i + "° aluno: ");
            String nome = leia.next();

            float totalNotas = 0;

            for (int j=1; j<=3; j++) {
                System.out.println("Digite a " + j + "° nota do aluno " + nome + ":");
                float nota = leia.nextFloat();
                totalNotas += nota;
            }

            if (totalNotas >= 60) {
                alunosAprovados++;
            } else {
                alunosReprovados++;
            }

            totalClasse += totalNotas;

        }

        mediaClasse = totalClasse / 10;

        System.out.println("A quantidade de alunos aprovados: " + alunosAprovados);
        System.out.println("A quantidade de alunos reprovados: " + alunosReprovados);
        System.out.println("A media dos alunos aprovados: " + mediaClasse);

        leia.close();
    }
}
