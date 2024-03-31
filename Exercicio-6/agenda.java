import java.util.List;
import java.util.ArrayList;

public class agenda {

    List<contato> contatos = new ArrayList<contato>();

    public void Buscador(String nomeBuscador) {
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
