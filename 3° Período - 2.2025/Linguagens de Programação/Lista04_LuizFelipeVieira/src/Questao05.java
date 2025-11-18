import java.util.Scanner;

public class Questao05 {
    public static double calcularRaiz(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Erro de argumento: O número deve ser não negativo para calcular a raiz.");
        }
        
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        try {
            double resultado = calcularRaiz(num);
            System.out.printf("\nA raiz quadrada de %.2f é: %.4f\n", num, resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("\nERRO de Cálculo:");
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
