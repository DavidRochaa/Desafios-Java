import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print(
                "Escolha a operação desejada com o número correspondente: \n 1: Adição \n 2: Subtração \n 3: Multiplicação \n 4: Divisão. \n");
        int escolha = leitor.nextInt();

        System.out.print("Qual o primeiro número que deseja calcular? ");
        Float num1 = leitor.nextFloat();

        System.out.print("Qual o segundo número que deseja calcular? ");
        Float num2 = leitor.nextFloat();

        calculadora numeros_calc = new calculadora(num1, num2);

        if (escolha == 1) {
            numeros_calc.adicao(true);
        } else if (escolha == 2) {
            numeros_calc.subtracao(true);
        } else if (escolha == 3) {
            numeros_calc.multiplicacao(true);
        } else if (escolha == 4) {
            numeros_calc.divisao(true);
        } else {
            System.out.println("Escolha uma operação válida.");
        }

    }

}