/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/17
 */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i=0, par,  totalPar=0, numerosPar=0;

        while (true) {
            System.out.println("Digite um número par: ");
            par = leia.nextInt();

            if ((par%2 == 0) && (par > 0)){
                totalPar += par;
                numerosPar++;
            }

            if (par == 0){
                break;
            }
        }

        int mediaPar = totalPar / numerosPar;

        System.out.println("A média dos números pares digitados é: " + mediaPar);

        leia.close();
    }
}