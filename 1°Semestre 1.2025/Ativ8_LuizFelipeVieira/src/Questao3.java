/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

public class Questao3 {
    public static void main(String[] args) {

        double[] primeiroValor = new double[]{14.57, 82.41, 3.89, 67.12, 25.63, 49.87, 91.35, 58.74, 6.29, 73.18, 42.56, 19.04, 88.77, 34.25, 51.93, 60.48, 7.15, 27.66, 95.82, 11.39};
        double[] segundoValor = new double[]{63.48, 9.27, 85.63, 47.19, 22.84, 78.51, 5.36, 39.72, 14.95, 56.08, 31.67, 90.24, 3.51, 68.79, 12.45, 81.33, 27.58, 44.96, 70.12, 18.65};
        double[] resultado = new double[primeiroValor.length];

        int esquerda = (resultado.length/2) - 1;
        int direita = (resultado.length/2);

        for (int i = 0; i < primeiroValor.length; i++) {
            double provisorio = primeiroValor[i] * segundoValor[primeiroValor.length - (i+1)];

            if (i % 2 == 0) {
                resultado[esquerda--] = provisorio;
            } else {
                resultado[direita++] = provisorio;
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("Vetor[%d] = %.2f%n", i, resultado[i]);
        }

    }
}
