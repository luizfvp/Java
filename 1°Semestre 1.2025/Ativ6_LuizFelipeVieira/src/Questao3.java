/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/16
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numPositivos = 0;
        int quantPositivos = 0;
        int quantNegativos = 0;
        int numNegativos = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;

        for (int i=1; i<=5; i++){
            System.out.println("Digite o " + i + "° número inteiro diferente de 0: ");
            int num = leia.nextInt();

            while (num == 0){
                System.out.println("O número digitado é 0.");
                System.out.println("Digite o " + i + "° número inteiro diferente de 0:");
                num = leia.nextInt();
            }

            if (num > 0){
                quantPositivos++;
                numPositivos += num;
            } else {
                quantNegativos++;
                numNegativos += num;
            }
        }

        if (quantPositivos > 1){
            mediaPositivos = numPositivos/quantPositivos;
        }

        if (quantNegativos > 1) {
            mediaNegativos = numNegativos / quantNegativos;
        }

        System.out.println("A média dos números positivos é: " + mediaPositivos);
        System.out.println("A média dos números negativos é: " + mediaNegativos);

        leia.close();
    }
}
