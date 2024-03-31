public class jogador {

    private String nomeJogador;
    private int pontuacao;
    private int nivel;

    jogador(String nomeJogador, int pontuacao, int nivel) {
        this.nomeJogador = nomeJogador;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    void aumentarNivel(int aumentoNivel) {
        nivel += aumentoNivel;
    }

    void aumentarPontuacao(int aumentoPontuacao) {
        pontuacao += aumentoPontuacao;
    }

    public String getnomeJogador() {
        return nomeJogador;
    }

    public int get_pontuacao() {
        return pontuacao;
    }

    public int get_nivel() {
        return nivel;
    }

    void exibirPontuacao() {
        System.out.println("Nome do jogador: " + getnomeJogador());
        System.out.println("Pontuação atual da Conta: " + get_pontuacao());
        System.out.println("Nível atual da conta: " + get_nivel());
    }

}
