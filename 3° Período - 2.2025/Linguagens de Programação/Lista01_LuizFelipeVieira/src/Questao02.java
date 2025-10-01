import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %d° valor: ", i + 1);
            valores[i] = sc.nextInt();
        }

        double somaPonderada = 0;
        double somaIndices = 0;

        for (int i = 0; i < valores.length; i++) {
            somaPonderada += (valores[i] * i);
            somaIndices += i;
        }
        
        double mediaPonderada = somaPonderada / somaIndices;

        System.out.printf("\nA média ponderada dos valores é: %.2f", mediaPonderada);

        sc.close();
    }
}
