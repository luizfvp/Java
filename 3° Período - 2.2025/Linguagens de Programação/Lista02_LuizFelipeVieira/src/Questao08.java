import java.util.Scanner;

public class Questao08 {
    public static int pares(int[] valores, int i) {
        if (i == valores.length) {
            return 0;
        }

        if (valores[i] % 2 == 0) {
            return 1 + pares(valores, i + 1);
        } else {
            return 0 + pares(valores, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %d° valor: ", i + 1);
            valores[i] = sc.nextInt();
        }

        int resposta = pares(valores, 0);

        System.out.println("\nA quantidade de pares são: " + resposta);

        sc.close();
    }
}
