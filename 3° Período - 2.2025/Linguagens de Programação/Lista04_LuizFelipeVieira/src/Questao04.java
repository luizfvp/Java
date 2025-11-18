import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Questao04 {
    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("A idade (" + idade + ") é inválida. O valor deve estar entre 0 e 150.");
        }
        System.out.println("Idade verificada com sucesso!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        try {
            verificarIdade(idade);
            
            System.out.println("Programa finalizado com idade válida.");

        } catch (IdadeInvalidaException e) {
            System.out.println("ERRO: Idade inválida.");
            System.out.println("Detalhe: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
