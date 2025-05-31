/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/14
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int quantPares = 0;
        int quantImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i=1; i<=10; i++){
            System.out.println("Digite o " + i + "° número inteiro diferente de 0: ");
            int num = leia.nextInt();

                    while (num == 0){
                        System.out.println("O número digitado é 0.");
                        System.out.println("Digite o " + i + "° número inteiro diferente de 0: ");
                        num = leia.nextInt();
                    }

                    if (num % 2 == 0){
                        quantPares++;
                        somaPares += num;
                    } else {
                        quantImpares++;
                        somaImpares += num;
                    }
        }

        System.out.println("A quantidade de pares é: " + quantPares);
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A quantidade de impares é: " + quantImpares);
        System.out.println("A soma dos números impares é: " + somaImpares);

        leia.close();
    }
}