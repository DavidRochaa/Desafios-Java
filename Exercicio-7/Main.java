import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<produto> listaProdutos = new ArrayList<produto>();

        boolean j = true;

        while (j == true) {
            System.out.println("DIgite a opção desejada: ");
            System.out.println("1 - Cadastrar produto: ");
            System.out.println("2 - Aumentar estoque do produto: ");
            System.out.println("3 - Diminuir estoque do produto: ");
            System.out.println("4 - Aumentar preço do produto: ");
            System.out.println("5 - Diminuir preço do produto: ");
            System.out.println("6 - Mostrar informação do estoque: ");
            System.out.print("7 - Sair do programa: ");
            int escolha = leitor.nextInt();

            Scanner leitor_for = new Scanner(System.in);
            Scanner leitor_escolha = new Scanner(System.in);

            if (escolha == 1) {

                System.out.print("Qual o nome do produto? ");
                String nomeProduto = leitor_for.nextLine();

                System.out.print("Qual o código do produto? ");
                int codigoProduto = leitor_for.nextInt();

                System.out.print("Qual o estoque atual do produto? ");
                int estoqueProduto = leitor_for.nextInt();

                System.out.print("Qual o preço atual do produto? ");
                Float precoProduto = leitor_for.nextFloat();

                produto novoProduto = new produto(nomeProduto, codigoProduto, estoqueProduto, precoProduto);

                listaProdutos.add(novoProduto);

            } else if (escolha == 2) {
                System.out.print("Qual o código do produto que deseja aumentar o estoque? ");
                int codigoProdutoBuscador = leitor_for.nextInt();
                System.out.println("Em quanto você deseja adicionar o estoque? ");
                int aumentoEstoque = leitor_for.nextInt();
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (listaProdutos.get(i).codigoProduto == codigoProdutoBuscador) {
                        listaProdutos.get(i).aumentarEstoque(aumentoEstoque);
                        break;
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                }

            } else if (escolha == 3) {

                System.out.print("Qual o código do produto que deseja diminuir o estoque? ");
                int codigoProdutoBuscador = leitor_for.nextInt();

                System.out.println("Em quanto você deseja reduzir o estoque? ");
                int reducaoEstoque = leitor_for.nextInt();

                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (listaProdutos.get(i).codigoProduto == codigoProdutoBuscador) {
                        listaProdutos.get(i).reduzirEstoque(reducaoEstoque);
                        break;
                    } else {

                        System.out.println("Produto não encontrado.");
                    }
                }
            } else if (escolha == 4) {
                System.out.print("Qual o código do produto que deseja aumentar o preço? ");
                int codigoProdutoBuscador = leitor_for.nextInt();
                System.out.println("Em quanto você deseja adicionar o valor do produto? ");
                Float aumentoPreco = leitor_for.nextFloat();
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (listaProdutos.get(i).codigoProduto == codigoProdutoBuscador) {
                        listaProdutos.get(i).aumentarPreco(aumentoPreco);
                        break;
                    } else {

                        System.out.println("Produto não encontrado.");
                    }
                }
            } else if (escolha == 5) {
                System.out.print("Qual o código do produto que deseja diminuir o preço? ");
                int codigoProdutoBuscador = leitor_for.nextInt();
                System.out.println("Em quanto você deseja diminuir o valor do produto? ");
                Float reducaoPreco = leitor_for.nextFloat();
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (listaProdutos.get(i).codigoProduto == codigoProdutoBuscador) {
                        listaProdutos.get(i).reduzirPreco(reducaoPreco);
                        break;
                    }
                }

            } else if (escolha == 6) {

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Escolha a opção de relatório:");
                System.out.println("1 - Relatório de um produto específico.");
                System.out.print("2 - Relatório de todos os produtos.");
                int escolhaRelatorio = leitor_escolha.nextInt();
                if (escolhaRelatorio == 1) {
                    System.out.print("Qual o código do produto para gerar o relatório? ");
                    int escolhaProduto = leitor_escolha.nextInt();
                    for (int i = 0; i < listaProdutos.size(); i++) {
                        if (listaProdutos.get(i).codigoProduto == escolhaProduto) {
                            listaProdutos.get(i).exibirProduto();
                            break;
                        } else {
                            System.out.print("Produto não encontrado");
                        }
                    }
                } else if (escolhaRelatorio == 2) {
                    for (int i = 0; i < listaProdutos.size(); i++) {
                        listaProdutos.get(i).exibirProduto();
                    }
                }

            } else if (escolha == 7) {

                j = false;

            } else {

                System.out.println("Escolha uma opção válida");

            }

        }
    }
}
