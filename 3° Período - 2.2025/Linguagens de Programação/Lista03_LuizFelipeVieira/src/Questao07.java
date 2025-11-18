import java.util.Scanner;
import java.util.Random;

public class Questao07 {
    
    public static double calcularMedia(int[] valores) {
        if (valores.length == 0) {
            return 0;
        }
        
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / valores.length;
        
        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];
        Random random = new Random();

        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " | ");
        }

        double media = calcularMedia(valores);
        System.out.printf("\nA média aritmética dos valores é: %.2f", media);

        sc.close();
    }
}
