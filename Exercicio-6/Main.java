import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<contato> contatos = new ArrayList<contato>();

        System.out.print("Qual o nome do contato? ");
        String nome = leitor.nextLine();

        System.out.print("Qual o telefone do contato? ");
        String telefone = leitor.nextLine();

        contato novoContato = new contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato adicionado: " + nome + " - " + telefone);

        System.out.print("Qual o nome do contato que queira buscar? ");
        String nomeBuscador = leitor.nextLine();

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome() == nomeBuscador) {
                System.out.println("Contato encontrado:");
                System.out.println("Nome: " + contatos.get(i).getNome());
                System.out.println("Telefone: " + contatos.get(i).getTelefone());
            }

            System.out.println("Contato não encontrado.");
        }
    }

}
