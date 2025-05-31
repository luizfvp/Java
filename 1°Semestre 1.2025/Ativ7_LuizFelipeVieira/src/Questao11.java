/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/24
 */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] palavras = new String[4];

        for(int i = 0; i < palavras.length; i++){
            System.out.println("Digite a " +(i+1)+ "° palavra: ");
            palavras[i] = leia.nextLine();
        }

        System.out.println("\nAs palavras digitas foram: ");

        for(int i = 0; i < palavras.length; i++){
            System.out.print(palavras[i] + " ");
        }

        leia.close();
    }
}
