import java.util.Scanner;

public class Questao03 {

    public static String inverter(String palavra, int i) {
        if (i == palavra.length()) { // quando indice for igual ao tamanho da palavra
            return ""; // retorna espaço vazio
        }

        return palavra.charAt(palavra.length() - 1 - i) + inverter(palavra, i + 1); 
        // o ultimo caracter + o caracter anterior ao da chamada
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String palavraInvertida = inverter(palavra, 0);

        System.out.println("\nA palavra '" + palavra + "' ao inverso fica: " + palavraInvertida);

        sc.close();
    }
}
