/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

public class Questao2 {
    public static void main(String[] args) {
        double [] valores = new double []{1.9,2.8,3.7,4.6,5.5,6.4,7.3,8.2,9.1,10.0};

        System.out.println("Valores em ordem crescente:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        System.out.println("\nValores em ordem decrescente:");
        for (int i=valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }

    }
}
