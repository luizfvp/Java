public class Questao03 {
    public static void acessarIndice(int[] valores, int x) {
        try {
            int valor = valores[x];
            System.out.printf("\nSucesso! O valor lido no índice %d é: %d\n", x, valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERRO: Tentativa de acesso a índice inválido.");
            System.out.printf("Índice Máximo Válido: %d (o array tem %d elementos).\n", valores.length - 1, valores.length);
        }
    }

    public static void main(String[] args) {
        int[] valores = {100, 200, 300};
        
        acessarIndice(valores, 1);
        
        acessarIndice(valores, 3); 
    }
}
