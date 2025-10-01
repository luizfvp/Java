public class Main {
    public static void main(String[] args) {
        // Criando duas pessoas usando o construtor
        Pessoa pessoa1 = new Pessoa("Maria Silva", "3199999-1111", "maria@email.com");
        Pessoa pessoa2 = new Pessoa("João Pereira", "3198888-2222", "joao@email.com");

        // Exibindo dados iniciais
        System.out.println("Pessoa 1:");
        pessoa1.imprimirDados();
        System.out.println("\nPessoa 2:");
        pessoa2.imprimirDados();

        System.out.println("\n--- Alterando valores ---\n");

        // Alterando valores usando os setters
        pessoa1.setTelefone("3197777-3333");
        pessoa2.setEmail("joao.novo@email.com");

        // Exibindo dados atualizados
        System.out.println("Pessoa 1 (atualizada):");
        pessoa1.imprimirDados();
        System.out.println("\nPessoa 2 (atualizada):");
        pessoa2.imprimirDados();
    }
}
