import java.io.*;
import java.util.Scanner;

public class GerenciadorCSV {

    private static final String ARQUIVO_CSV = "dados_pessoas.csv";
    private static final String DELIMITADOR = ";";

    public static void main(String[] args) {
        menu();
    }
    
    public static void adicionarDados(Scanner sc) {
        System.out.println("\nAdicionar Nova Pessoa");
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        
        System.out.print("E-mail: ");
        String email = sc.nextLine();

        String registro = nome + DELIMITADOR + telefone + DELIMITADOR + email;

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO_CSV, true))) {
            pw.println(registro);
            System.out.println("\nDados de " + nome + " adicionados com sucesso!");
        } catch (IOException e) {
            System.out.println("\nERRO ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static void buscarDados(Scanner sc) {
        System.out.println("\nBuscar Pessoa");
        System.out.print("Digite o NOME da pessoa a buscar: ");
        String nomeBusca = sc.nextLine().trim();
        boolean encontrado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CSV))) {
            String linha;
            System.out.println("\nResultado da Busca:");
            
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(DELIMITADOR);
                
                if (dados.length > 0 && dados[0].trim().equalsIgnoreCase(nomeBusca)) {
                    System.out.println("Nome: " + dados[0]);
                    System.out.println("Telefone: " + dados[1]);
                    System.out.println("E-mail: " + dados[2]);
                    encontrado = true;
                    break;
                }
            }
            
            if (!encontrado) {
                System.out.println("Pessoa não encontrada.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: Arquivo '" + ARQUIVO_CSV + "' não encontrado. (Adicione dados primeiro).");
        } catch (IOException e) {
            System.out.println("ERRO ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void exibirTodosDados() {
        System.out.println("\nTodos os Dados Registrados");
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CSV))) {
            String linha;
            System.out.println("--------------------------------------------------");
            System.out.printf("| %-20s | %-15s | %-25s |\n", "NOME", "TELEFONE", "E-MAIL");
            System.out.println("--------------------------------------------------");
            
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(DELIMITADOR);
                if (dados.length == 3) {
                    System.out.printf("| %-20s | %-15s | %-25s |\n", dados[0], dados[1], dados[2]);
                }
            }
            System.out.println("--------------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: Arquivo '" + ARQUIVO_CSV + "' não encontrado. (Nenhum dado salvo ainda).");
        } catch (IOException e) {
            System.out.println("ERRO ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void menu() {
        Scanner scMenu = new Scanner(System.in);
        Scanner scOperacao = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("\n============================================");
            System.out.println("      Gerenciador de Dados CSV");
            System.out.println("============================================");
            System.out.println("1. Adicionar Nova Pessoa");
            System.out.println("2. Buscar Dados por Nome");
            System.out.println("3. Exibir Todos os Dados");
            System.out.println("0. Sair");
            System.out.println("--------------------------------------------");
            System.out.print("Escolha uma opção: ");

            try {
                escolha = scMenu.nextInt();
                scMenu.nextLine();

                switch (escolha) {
                    case 1:
                        adicionarDados(scOperacao);
                        break;
                    case 2:
                        buscarDados(scOperacao);
                        break;
                    case 3:
                        exibirTodosDados();
                        break;
                    case 0:
                        System.out.println("\nFinalizando o programa. Até logo!");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nEntrada inválida. Digite um número correspondente à opção.");
                scMenu.nextLine();
                escolha = -1;
            }

        } while (escolha != 0);
        
        scMenu.close();
    }
}