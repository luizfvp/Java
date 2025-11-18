import java.util.Scanner;
import java.util.InputMismatchException;

public class Questao02 {

    public static int numInteiro(Scanner sc) {
        int num = 0;
        boolean validacao = false;

        while (!validacao) {
            System.out.print("Digite um número inteiro: ");
            try {
                num = sc.nextInt();

                validacao = true;
            } catch (InputMismatchException e) {
                System.out.println("ERRO! Digite apenas números inteiros.");
                
                sc.next(); 
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor = numInteiro(sc);
        
        System.out.printf("\nSucesso! O número lido é: %d\n", valor);
        sc.close();
    }
}
