import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<carro> listaCarros = new ArrayList<carro>();

        System.out.print("Qual o nome do modelo do carro? ");
        String modelo = leitor.nextLine();

        System.out.print("Qual a marca do carro?");
        String marca = leitor.nextLine();

        System.out.print("Qual o ano do carro? ");
        String ano = leitor.nextLine();

        System.out.print("Qual a placa do carro? ");
        String placa = leitor.nextLine();

        System.out.print("Qual a velocidade atual do carro? ");
        Float velocidadeAtual = leitor.nextFloat();

        carro carro = new carro(marca, modelo, ano, placa, velocidadeAtual);

        listaCarros.add(carro);

        System.out.print("Em quanto deseja aumentar a velocidade do carro? ");
        Float aumentoVelocidade = leitor.nextFloat();
        carro.aumentarVelocidade(aumentoVelocidade);

        System.out.print("Em quanto deseja diminuir a velocidade? ");
        Float diminuicaoVelocidade = leitor.nextFloat();
        carro.reduzirVelocidade(diminuicaoVelocidade);

        carro.exibirCarro();

    }

}
