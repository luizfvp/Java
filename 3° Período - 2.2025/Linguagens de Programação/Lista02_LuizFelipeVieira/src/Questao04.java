import java.util.Scanner;

public class Questao04 {

    public static int maiorElemento(int[] valores, int i) {
        if (i == valores.length - 1) { // verifica se i é o último índice do array
            return valores[i]; // se for o último, retorna o valor dessa posição
        }

        if (valores[i] > maiorElemento(valores, i + 1)) { // retorna a recursão para obter o maior do resto da array
            // (a partir de i + 1) e compara esse resultado com valores[i]
            return valores[i]; // se ele for maior, if será verdadeiro e retornará o proprio valor
        } else {
            return maiorElemento(valores, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %d° valor: ", i + 1);
            valores[i] = sc.nextInt();
        }

        int resposta = maiorElemento(valores, 0);

        System.out.println("\nO maior valor da array é: " + resposta);

        sc.close();
    }
}
