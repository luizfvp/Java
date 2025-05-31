/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int [] valores = new int[3];
        int pares=0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número inteiro: ");
            valores[i] = leia.nextInt();
            if(valores[i]%2==0){
                pares++;
            }
        }

        System.out.println("\nO total de números pares é: " +pares);

        leia.close();
    }
}
