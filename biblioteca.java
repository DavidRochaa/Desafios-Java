public class biblioteca {

    String nome_livro;
    String autor;
    String data_publicacao;
    int escolhaLivros;

    biblioteca(String nome_livro, String autor, String data_publicacao) {
        this.nome_livro = nome_livro;
        this.autor = autor;
        this.data_publicacao = data_publicacao;
    }

    void colecaoBiblioteca(int i) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + "O nome do livro " + i + " é: " + nome_livro
                + "\n O seu(ua) autor(a) é: " + autor + "\n E sua data de publicação é: " + data_publicacao
                + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}