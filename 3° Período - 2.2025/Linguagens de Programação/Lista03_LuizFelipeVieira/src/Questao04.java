import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] valores = new int[15];
       int[] valoresInverso = new int[valores.length];
       
        System.out.println("Digite 15 valores inteiros.\n");
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            valores[i] = sc.nextInt();
         }
    
        for (int i = 0; i < valores.length; i++) {
            valoresInverso[(valores.length - 1) - i] = valores[i];
        }

        System.out.println("\nVetor na ordem inversa:");
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valoresInverso[i] + " | ");
        }

        sc.close();
    }
}
