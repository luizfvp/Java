import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %d° valor: ", i + 1);
            valores[i] = sc.nextInt();
        }

        System.out.println("\nValores pares: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.print(valores[i] + " ");
            }
        }

        System.out.println("\nValores ímpares: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 != 0) {
                System.out.print(valores[i] + " ");
            }
        }

        sc.close();
    }
}
