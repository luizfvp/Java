import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double primeiroValor, segundoValor, resultado = 0;
        String continuar = "SIM";
        
        while (!continuar.equalsIgnoreCase("NÃO") && !continuar.equalsIgnoreCase("NAO")) {
    
            System.out.println("Digite o primeiro valor: ");
            primeiroValor = leia.nextDouble();
            
            System.out.println("\nDigite o operador matematico: ");
            System.out.println("- Utilize '+' para Adição;");
            System.out.println("- Utilize '-' para Subtração;");
            System.out.println("- Utilize '*' para Multiplicação;");
            System.out.println("- Utilize '/' para Divisão;");
            System.out.println("- Utilize '^' para Potencialização;");
            System.out.println("- Utilize '%' para saber o resto da divisão.");
            char operador = leia.next().charAt(0);
            
            while (operador != '+' && operador != '-' && operador != '*' && operador != '/' && operador != '^' && operador != '%') {
                System.out.println("O operador digitado é invalido, tente novamente: ");
                operador = leia.next().charAt(0);
            }
            
            System.out.println("\nDigite o segundo valor: ");
            segundoValor = leia.nextDouble();

            while (segundoValor == 0 && operador == '/') {
                System.out.println("Erro: Divisão por zero não é permitida. Tente novamente: ");
                segundoValor = leia.nextDouble();
            }
            
            switch (operador) {
                case '+':
                resultado = primeiroValor + segundoValor;
                break;
                case '-':
                resultado = primeiroValor - segundoValor;
                break;
                case '*':
                resultado = primeiroValor * segundoValor;
                break;
                case '/':
                resultado = primeiroValor / segundoValor;
                break;
                case '^':
                resultado = Math.pow(primeiroValor, segundoValor);
                break;
                case '%':
                resultado = primeiroValor % segundoValor;
                break;
                default:
                System.out.println("Operador inválido.");
                leia.close();
                return;
            }
            
            System.out.printf("\nO resultado da operação: %.2f %c %.2f = %.2f %n", primeiroValor, operador, segundoValor, resultado);

            System.out.println("\nDeseja fazer uma nova operação?");
            System.out.println("Digite 'SIM' para continuar ou 'NÃO' para encerrar: ");
            leia.nextLine(); // Consumir a quebra de linha pendente
            continuar = leia.nextLine();
            System.out.println();
        }

        leia.close();
    }
}
