/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/18
 */

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int cont=0, totalAprovados=0, totalReprovados=0;
        double totalClasse=0, mediaClasse;
        String nomeAluno;
        String [] alunos = new String[50];
        Boolean [] aprovacao = new Boolean[50];

        do {
            System.out.println("Digite o nome do " +(cont + 1)+ "° aluno: \n(Para encerrar o programa digite 'FIM')");
            nomeAluno = leia.nextLine();

            if(nomeAluno.equalsIgnoreCase("FIM")) {
                break;
            }

            alunos[cont] = nomeAluno;
            double totalAluno = 0;

            for (int i=0; i<3; i++) {
                System.out.println("Digite a " +(i + 1)+ "° nota do aluno " + nomeAluno + ": ");
                double nota = leia.nextDouble();
                totalAluno += nota;
            }
            leia.nextLine();

            if (totalAluno >= 60) {
                aprovacao[cont] = true;
                totalAprovados++;
            } else {
                aprovacao[cont] = false;
                totalReprovados++;
            }

            totalClasse += totalAluno;

            cont++;
        } while (true);

        mediaClasse = totalClasse/cont;

        System.out.printf("\nA média de notas da classe é: %.2f\n", mediaClasse);
        System.out.println("A quantidade de alunos APROVADOS é de: " +totalAprovados);
        System.out.println("A quantidade de alunos REPROVADOS é de: " +totalReprovados);
        System.out.println("\nSTATUS DE APROVAÇÃO DA TURMA:\n");

        for (int i=0; i<cont; i++) {
            System.out.println("Aluno: " + alunos[i]);
            if (aprovacao[i]) {
                System.out.println("Status: APROVADO!\n");
            } else {
                System.out.println("Status: REPROVADO!\n");
            }
        }

        leia.close();
    }
}

