import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] valores = new double[100];

        System.out.printf("Digite um valor: ");
        valores[0] = sc.nextInt();

        for (int i = 1; i < valores.length; i++) {
            valores[i] = valores[i-1] / 2.0;
        }

        for (int i = 1; i < valores.length; i++) {
            System.out.printf("%d° = %.5f\n", i, valores[i]);
        }

        sc.close();
    }
}
