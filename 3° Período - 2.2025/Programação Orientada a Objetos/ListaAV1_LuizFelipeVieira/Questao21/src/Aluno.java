public class Aluno {
    private int registroAcademico;
    private String CPF;
    private String nome;
    private double[] notas;  // 4 notas
    private int[] faltas;    // 4 faltas

    // Construtor
    public Aluno(int registroAcademico, String CPF, String nome, double[] notas, int[] faltas) {
        this.registroAcademico = registroAcademico;
        this.CPF = CPF;
        this.nome = nome;
        this.notas = notas;
        this.faltas = faltas;
    }

    // Getters e Setters
    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int[] getFaltas() {
        return faltas;
    }

    public void setFaltas(int[] faltas) {
        this.faltas = faltas;
    }

    // Método para calcular a média aritmética
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para calcular a situação do aluno
    public String calcularSituacao() {
        // Critério 1: todas as notas acima de 60
        for (double nota : notas) {
            if (nota < 60) {
                return "Reprovado (nota insuficiente)";
            }
        }

        // Critério 2: todas as faltas menores que 5
        for (int falta : faltas) {
            if (falta >= 5) {
                return "Reprovado (excesso de faltas)";
            }
        }

        return "Aprovado";
    }
}
