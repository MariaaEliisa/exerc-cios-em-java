import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Gerenciamento de Produtos");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Fabricante do produto: ");
                    String fabricante = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(id, descricao, fabricante, preco);
                    produtoService.adicionarProduto(produto);
                    break;

                case 2:
                    produtoService.listarProdutos();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
