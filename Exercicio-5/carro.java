public class carro {

    String marca;
    String modelo;
    String anoCarro;
    String placa;
    Float velocidadeAtual;

    carro(String marca, String modelo, String anoCarro, String placa, Float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoCarro = anoCarro;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void aumentarVelocidade(Float aumentoVelocidade) {
        velocidadeAtual += aumentoVelocidade;
    }

    public void reduzirVelocidade(Float diminuicaoVelocidade) {
        velocidadeAtual -= diminuicaoVelocidade;
    }

    public void exibirCarro() {
        System.out.print("A marca do carro é: " + marca);
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + anoCarro);
        System.out.println("A placa do carro é: " + placa);
        System.out.println("A velocidade atual do carro é: " + velocidadeAtual);

    }

}
