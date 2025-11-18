public class Questao06 {
    public static void realizarOperacoes(int dividendo, int divisor, int[] array, int indice) 
            throws ArithmeticException, ArrayIndexOutOfBoundsException {
        
       int resultadoDivisao = dividendo / divisor;
        
        int valor = array[indice];
        
        System.out.println("\nOperações bem-sucedidas!");
        System.out.printf("Divisão: %d | Valor lido no array: %d\n", resultadoDivisao, valor);
    }

    public static void main(String[] args) {
        int[] meuArray = {10, 20};
        
        int dividendo = 10;
        int divisor = 0;
        int indice = 5;
        
        System.out.println("--- Tratamento de Múltiplas Exceções ---");

        try {
            realizarOperacoes(dividendo, divisor, meuArray, indice);

        } catch (ArithmeticException e) {
            System.out.println("\nERRO TIPO 1: Divisão por Zero! Verifique o divisor.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERRO TIPO 2: Acesso ao Array Inválido! O índice está fora do limite.");
        } 
        
        System.out.println("O programa continua sua execução normalmente.");
    }
}
