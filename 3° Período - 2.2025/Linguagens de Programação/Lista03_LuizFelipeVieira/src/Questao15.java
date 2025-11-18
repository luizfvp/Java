import java.util.Scanner;

public class Questao15 {
    public static int soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para N: ");
        int n = sc.nextInt();

        int resultado = soma(n);

        System.out.printf("\nA soma de 1 até %d é: %d", n, resultado);

        sc.close();
    }
}
