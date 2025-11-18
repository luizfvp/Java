import java.util.Scanner;
import java.util.Random;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[30];
        Random random = new Random();

        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
            System.out.print(valores[i] + " | ");
        }

        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 5 == 0) {
                soma += valores[i];
            }
        }

        System.out.println("\nA soma dos valores múltiplos de 5 é " + soma);

        sc.close();
    }
}
