import java.util.Scanner;
import java.util.Random;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
            System.out.print(valores[i] + " | ");
        }

        System.out.println("\n");        

        for (int i = 0; i < valores.length; i++) {            
            int valorParaAnalisar = valores[i];
            boolean jaAnalisado = false;

            for (int j = 0; j < i; j++) {
                if (valores[j] == valorParaAnalisar) {
                    jaAnalisado = true;
                    break;
                }
            }

            if (!jaAnalisado) {                
                int contador = 0;

                for (int k = 0; k < valores.length; k++) {
                    if (valores[k] == valorParaAnalisar) {
                        contador++;
                    }
                }

                System.out.println("O número " + valorParaAnalisar + " apareceu " + contador + " vezes.");
            }
        }

        sc.close();
    }
}
