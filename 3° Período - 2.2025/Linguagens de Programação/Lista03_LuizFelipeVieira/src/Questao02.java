import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] valores = new int[20];

        System.out.println("Digite 20 valores inteiros a seguir.");

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            valores[i] = sc.nextInt();
        }

        int maiorValor = valores[0];
        int posicaoMaior = 0;
        int menorValor = valores[0];
        int posicaoMenor = 0;

        for (int i = 0; i < valores.length; i++) {
            
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaior = i;
            } else if (valores[i] < menorValor) {
                menorValor = valores[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O número " + maiorValor + " da posição " + posicaoMaior + " do vetor, é o MAIOR valor digitado.");
        System.out.println("O número " + menorValor + " da posição " + posicaoMenor + " do vetor, é o MENOR valor digitado.");

        sc.close();
    }
}
