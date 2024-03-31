import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<jogador> ListaJogadores = new ArrayList<jogador>();

        System.out.print("Qual o nome do jogador? ");
        String nomeJogador = leitor.nextLine();

        System.out.print("Qual a pontuação desse jogador? ");
        int pontuacao = leitor.nextInt();

        System.out.print("Qual o nivel desse jogado? ");
        int nivel = leitor.nextInt();

        jogador jogador = new jogador(nomeJogador, pontuacao, nivel);

        ListaJogadores.add(jogador);

        System.out.print("Qual a pontuação que deseja aumentar no jogador " + nomeJogador + " ? ");
        int aumentoPontuacao = leitor.nextInt();
        jogador.aumentarPontuacao(aumentoPontuacao);

        System.out.print("Qual o nível que deseja adicionar no jogador " + nomeJogador + " ? ");
        int aumentoNivel = leitor.nextInt();
        jogador.aumentarNivel(aumentoNivel);

        jogador.exibirPontuacao();

    }

}
