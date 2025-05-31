/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/30
 */

public class Questao4 {
    public static void main(String[] args) {

        double[] primeiroVetor = new double[]{1.5, 2.7, 3.6, 4.5, 5.1, 6.3, 7.1, 8.4, 9.5, 10.7, 11.3, 12.5, 13.1, 14.8, 15.6, 16.2, 17.5, 18.9, 19.8, 20.5};
        double[] segundoVetor = new double[]{20.5, 19.8, 18.9, 17.5, 16.2, 15.6, 14.8, 13.1, 12.5, 11.3, 10.7, 9.5, 8.4, 7.1, 6.3, 5.1, 4.5, 3.6, 2.7, 1.5};
        double[] resultado = new double[primeiroVetor.length];

        int pontaEsquerda = 0;
        int pontaDireita = (resultado.length - 1);

        for (int i = 0; i < primeiroVetor.length; i++) {
            double resultadoProvisorio = primeiroVetor[i] * segundoVetor[primeiroVetor.length - (i + 1)];

            if (i % 2 == 0) {
                resultado[pontaEsquerda++] = resultadoProvisorio;
            } else {
                resultado[pontaDireita--] = resultadoProvisorio;
            }
        }

        for (int i = 0; i < primeiroVetor.length; i++) {
            System.out.printf("%.2f%n", resultado[i]);
        }

    }
}
