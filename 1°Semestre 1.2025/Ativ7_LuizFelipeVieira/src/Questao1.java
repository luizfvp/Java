/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

public class Questao1 {
    public static void main(String[] args) {

        int [] valores = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Valores em ordem crescente:");
        for(int i=0; i<valores.length; i++){
            System.out.println("- " + valores[i]);
        }

        System.out.println("\nValores em ordem decrescente:");
        for(int i=valores.length - 1; i >= 0; i--){
            System.out.println("- " + valores[i]);
        }

    }
}