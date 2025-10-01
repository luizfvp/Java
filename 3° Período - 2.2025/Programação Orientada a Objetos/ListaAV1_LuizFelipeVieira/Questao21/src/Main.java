public class Main {
    public static void main(String[] args) {
        // Criando dois alunos para teste
        double[] notas1 = {70, 80, 90, 100};
        int[] faltas1 = {2, 3, 1, 0};
        Aluno aluno1 = new Aluno(123, "111.222.333-44", "Maria Silva", notas1, faltas1);

        double[] notas2 = {50, 75, 85, 90};
        int[] faltas2 = {2, 6, 1, 0};
        Aluno aluno2 = new Aluno(456, "555.666.777-88", "João Pereira", notas2, faltas2);

        // Exibindo resultados
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.calcularSituacao());

        System.out.println("-----------------------------");

        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Situação: " + aluno2.calcularSituacao());
    }
}
