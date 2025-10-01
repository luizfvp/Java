import java.util.Scanner;

public class Questao01 {

    public static int somar(int num) {
        if (num < 10 && num > -10) { 
            return num; // se tiver apenas um digito retornará ele mesmo
        } else {
            return (num % 10) + somar(num / 10); 
            // (num % 10) = o ultimo digito do número
            // (num / 10) = o número sem o último digito e chama a função novamente
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int somarDigitos = somar(num);

        System.out.println("\nA soma dos dígitos do número '" + num + "' é: " + somarDigitos);

        sc.close();
    }
}
