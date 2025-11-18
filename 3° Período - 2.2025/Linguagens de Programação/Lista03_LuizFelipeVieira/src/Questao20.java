import java.util.Random;

public class Questao20 {
    public static int maior(int[] valores, int x) {
        if (x == valores.length - 1) {
            return valores[x];
        }
        
        int maiorValor = maior(valores, x + 1);

        if (valores[x] > maiorValor) {
            return valores[x];
        } else {
            return maiorValor;
        }
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

        int resultado = maior(valores, 0);

        System.out.printf("\nO maior valor do vetor é o: %d", resultado);

    }
}
