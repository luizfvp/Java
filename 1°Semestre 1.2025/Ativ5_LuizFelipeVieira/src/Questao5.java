/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/04/05
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = leia.nextLine();

        String senhaCerta = "4531";

        if (senha.equals(senhaCerta)) {
            System.out.println("Senha correta, ACESSO AUTORIZADO!");
        } else {
            System.out.println("Senha incorreta, ACESSO NEGADO!");
        }

        leia.close();
    }
}
