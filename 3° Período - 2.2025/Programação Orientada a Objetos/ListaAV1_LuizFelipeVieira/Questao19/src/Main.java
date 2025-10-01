public class Main {
    public static void main(String[] args) {
        // Criando uma conta
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Nayara Rocha Souza Ramos", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("65432-1", "Matheus dos Anjos Zoe", 500.0);

        // Testando operações
        conta1.exibirSaldo();
        conta1.depositar(200);
        conta1.sacar(150);
        conta1.exibirSaldo();

        System.out.println("----------------------");

        // Testando formatação do nome
        System.out.println("Nome formatado (conta1): " + conta1.formatarNomeCartao());
        System.out.println("Nome formatado (conta2): " + conta2.formatarNomeCartao());
    }
}
