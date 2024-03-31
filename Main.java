import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Scanner leitor_for = new Scanner(System.in);

        List<biblioteca> colecao = new ArrayList<biblioteca>();

        System.out.print("Quantos livros você deseja adicionar? ");
        int escolhaLivros = leitor.nextInt();

        for (int i = 0; i < escolhaLivros; i++) {

            System.out.print("Qual o nome do livro? ");
            String nome_livro = leitor_for.nextLine();

            System.out.print("Qual o(a) autor(a) do livro? ");
            String autor = leitor_for.nextLine();

            System.out.print("Qual o ano de publicação do livro? ");
            String ano_publicacao = leitor_for.nextLine();

            biblioteca biblioteca = new biblioteca(nome_livro, autor, ano_publicacao);

            colecao.add(biblioteca);

        }

        for (int i = 0; i < escolhaLivros; i++) {
            colecao.get(i).colecaoBiblioteca(i);
        }

    }

}
