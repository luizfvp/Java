import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] valores = new int[10];

        System.out.printf("Digite um valor inteiro: ");
        valores[0] = sc.nextInt();

        for (int i = 1; i < valores.length; i++) {
            valores[i] = valores[i-1] * 2;

            System.out.print(valores[i] + " ");
        }

        sc.close();
    }
}
