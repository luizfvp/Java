import java.util.Scanner;

public class Questao09 {

    public static int somaDigitos(int numero) {
        if (numero == 0) {
            return numero;
        } else {
            return numero + somaDigitos(numero -1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para 'N': ");
        int valor = sc.nextInt();

        int resultado = somaDigitos(valor);

        System.out.println("O resultado da soma de 1 até " + valor + " é de: " + resultado);

        sc.close();
    }
}
