import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("Digite 10 valores inteiros a seguir.");
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            valores[i] = sc.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.println("O número " + valores[i] + " da posição " + i + " do vetor, é par!");
            }
        }

        sc.close();
    }
}
