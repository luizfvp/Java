import java.util.Scanner;

public class Questao05 {

    public static int somar(int[] valores, int i) {
        if (i >= valores.length) {
            return 0;
        } else {
            return valores[i] + somar(valores, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %d° valor: ", i + 1);
            valores[i] = sc.nextInt();
        }
        
        int resultado = somar(valores, 0);

        System.out.println("\nA soma dos valores digitados é: " + resultado);

        sc.close();
    }
}
