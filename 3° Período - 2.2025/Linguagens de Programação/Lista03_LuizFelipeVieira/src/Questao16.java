import java.util.Scanner;

public class Questao16 {
    public static int fatorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para N: ");
        int n = sc.nextInt();

        int resultado = fatorial(n);

        System.out.printf("\nO fatorial do número %d é: %d", n, resultado);

        sc.close();
    }
}
