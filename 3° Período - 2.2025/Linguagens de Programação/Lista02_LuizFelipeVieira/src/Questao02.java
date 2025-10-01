import java.util.Scanner;

public class Questao02 {
    
    public static int potencia(int base, int expoente) {
        if (expoente == 0) { // todo valor elevado a 0 = 1
            return 1; // retorna 1 quando o expoente for 0
        } else {
            return base * potencia(base, expoente - 1); // retorna a recursão sempre subtraindo -1 do expoente até que
            // o expoente vire 0 e caia no if (retornando 1) depois ele volta multiplicando pela base.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para a base: ");
        int base = sc.nextInt();

        System.out.println("Digite um número inteiro para o expoente: ");
        int expoente = sc.nextInt();

        int resultado = potencia(base, expoente);

        System.out.println("\nA potência de '" + base + "' elevado a '" + expoente + "' = " + resultado);

        sc.close();
    }
}
