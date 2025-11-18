import java.util.Scanner;

public class Questao01 {
    
    public static void divisao(int dividendo, int divisor) {
        try {
            int resultado = dividendo / divisor;
            System.out.printf("Resultado da divisão: %d / %d = %d\n", dividendo, divisor, resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERRO: Impossível realizar a divisão por zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o dividendo: ");
        int numA = sc.nextInt();
        
        System.out.print("Digite o divisor: ");
        int numB = sc.nextInt();

        divisao(numA, numB);
        
        sc.close();
    }
}
