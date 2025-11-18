import java.util.Scanner;
import java.util.Random;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int[] valores = new int[50];
         Random random = new Random();

         for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
         }

         for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " | ");
         }

         System.out.println("\nDigite uma posição do vetor acima (de 0 a 49): ");
         int pos1 = sc.nextInt();
         
         System.out.println("\nDigite uma segunda posição do vetor (diferente da informada anteriormente): ");
         int pos2 = sc.nextInt();

         int valorA = valores[pos1];
         int valorB = valores[pos2];

         if (valorB == 0) {
             System.out.println("ERRO: Não é possivel fazer a divisão por zero!");
         } else {
             double resultado = (double) valorA / valorB;
             System.out.printf("\nO resultado da divisão de %d por %d = %.2f", valorA, valorB, resultado);
         }

        sc.close();
    }
}
