import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro para a posição de Fibonacci: ");
        int valor = sc.nextInt();

        if (valor == 0) {
            System.out.println("O número de Fibonacci para a posição 0 é: 0");
        } else if (valor == 1) {
            System.out.println("O número de Fibonacci para a posição 1 é: 1");
        } else if (valor > 93) {
            System.out.println("O valor informado é grande para ser um Fibonacci, informe um valor menor que 93.");
        } else {
            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 2; i <= valor; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("O número de Fibonacci para a posição " + valor + " é: " + c);
        }

        sc.close();
    }
}
