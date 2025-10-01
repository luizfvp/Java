import java.util.Scanner;

public class Questao07 {

    public static int mdc(int valorA, int valorB) {
        if (valorB == 0) { 
            return valorA; // se o segundo valor for 0, logo o MDC será o primeiro valor
        } else {
            return mdc(valorB, valorA % valorB); 
            // chamada recursiva substituindo (valorA, valorB) por (valorB, valorA mod valorB) até valorB virar 0.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor inteiro: ");
        int valorA = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int valorB = sc.nextInt();
        
        int resposta = mdc(valorA, valorB);

        System.out.println("\nO MDC é: " + resposta);

        sc.close();
    }
}
