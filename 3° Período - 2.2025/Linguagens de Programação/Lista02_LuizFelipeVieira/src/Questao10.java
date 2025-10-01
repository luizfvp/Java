import java.util.Scanner;

public class Questao10 {

    public static String converterBi(int valor) {
        if (valor == 0) {
            return "";
        } else {
            return converterBi(valor / 2) + (valor % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor decimal inteiro: ");
        int valor = sc.nextInt();

        String resultado = converterBi(valor);
        System.out.println("O número '" + valor + "' em binário é: " + resultado);

        sc.close();
    }
}
