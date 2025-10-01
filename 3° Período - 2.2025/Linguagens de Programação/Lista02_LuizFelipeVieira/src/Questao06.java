import java.util.Scanner;

public class Questao06 {
    
    public static boolean palindromo(String palavra, int i) {
        if (i == palavra.length()) {
            return true;
        }
        if (palavra.toUpperCase().charAt(i) != palavra.toUpperCase().charAt(palavra.length() - 1 - i)) {
            return false;
        }
        return palindromo(palavra, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean resultado = palindromo(palavra, 0);

        System.out.printf("\nA palavra %s é um palíndromo? %b", palavra, resultado);

        sc.close();
    }
}
