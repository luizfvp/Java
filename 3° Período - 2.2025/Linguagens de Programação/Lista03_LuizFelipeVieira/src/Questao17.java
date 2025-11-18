import java.util.Scanner;

public class Questao17 {
    public static int fibonacci(int p) {
        if (p == 1) {
            return 0;
        } else if (p == 2) {
            return 1;
        } else {
            return fibonacci(p - 1) + fibonacci(p - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para descobrir a posição de Fibonacci: ");
        int p = sc.nextInt();

        int resultado = fibonacci(p);

        System.out.printf("\nO Fibonacci de %d é: %d", p, resultado);

        sc.close();
    }
}
