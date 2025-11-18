import java.util.Random;

public class Questao19 {
    public static int pares(int[] valores, int x) {
        if (x == valores.length) {
            return 0;
        }

        int contador = 0;

        if (valores[x] % 2 == 0) {
            contador = 1;
        }

        return contador + pares(valores, x + 1);
    }
    public static void main(String[] args) {
        Random random = new Random();

        int[] valores = new int[10];

        for (int x = 0; x < valores.length; x++) {
            valores[x] = random.nextInt(100);
        }

        for (int x = 0; x < valores.length; x++) {
            System.out.print(valores[x] + " | ");
        }

        int resultado = pares(valores, 0);

        System.out.printf("\nO número de valores pares do vetor é: %d", resultado);

    }
}
