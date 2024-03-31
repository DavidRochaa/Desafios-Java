import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class produto {

    String nomeProduto;
    int codigoProduto;
    int estoqueProduto;
    Float precoProduto;
    int aumentoEstoque;
    Float precoEstoque;

    produto(String nome, int codigo, int estoque, Float preco) {
        this.nomeProduto = nome;
        this.codigoProduto = codigo;
        this.estoqueProduto = estoque;
        this.precoProduto = preco;
    }

    public int getcodigoProduto() {
        return codigoProduto;
    }

    public void aumentarEstoque(int aumentoEstoque) {
        estoqueProduto += aumentoEstoque;
    }

    void reduzirEstoque(int reducaoEstoque) {
        if (estoqueProduto < 0) {
            System.out.println("Estoque vazio. ");
        } else {

            estoqueProduto -= reducaoEstoque;

        }

    }

    void aumentarPreco(Float aumentoPreco) {
        precoProduto += aumentoPreco;
    }

    void reduzirPreco(Float reducaoPreco) {
        if (precoProduto < 0) {

            System.out.println("Preço já zerado.");

        } else {
            precoProduto -= reducaoPreco;
        }
    }

    void exibirProduto() {
        precoEstoque = estoqueProduto * precoProduto;
        System.out.println("O nome do produto é: " + nomeProduto);
        System.out.println("O código do produto é: " + codigoProduto);
        System.out.println("O estoque atual desse produto é: " + estoqueProduto);
        System.out.println("O preço atual desse produto é: R$" + precoProduto);
        System.out.println("O preço do estoque desse produto é: R$" + precoEstoque);

    }

}
