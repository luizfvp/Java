import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContaBancaria {
    // Atributos privados
    private String numero;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método para formatar nome para cartão
    public String formatarNomeCartao() {
        // Lista de preposições que devem ser ignoradas
        Set<String> preposicoes = new HashSet<>(Arrays.asList("de", "da", "das", "do", "dos", "e"));

        // Quebra o nome em partes
        String[] partes = titular.trim().split("\\s+");

        if (partes.length == 0) {
            return "";
        }

        StringBuilder nomeFormatado = new StringBuilder();

        // Primeiro nome em maiúsculo completo
        nomeFormatado.append(partes[0].toUpperCase()).append(" ");

        // Processa os nomes do meio (exceto o último)
        for (int i = 1; i < partes.length - 1; i++) {
            String palavra = partes[i].toLowerCase();

            if (preposicoes.contains(palavra)) {
                continue; // ignora preposição
            }

            // pega só a primeira letra maiúscula + "."
            nomeFormatado.append(Character.toUpperCase(palavra.charAt(0))).append(". ");
        }

        // Último sobrenome em maiúsculo completo
        nomeFormatado.append(partes[partes.length - 1].toUpperCase());

        return nomeFormatado.toString();
    }
}
