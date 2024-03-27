public class calculadora {

    float num1;
    float num2;
    float result;

    calculadora(float n1, float n2) {
        num1 = n1;
        num2 = n2;
    }

    void adicao(boolean adicao_bol) {
        result = num1 + num2;
        System.out.println("O resultado da adição entre " + num1 + " + " + num2 + " é igual a: " + result);
    }

    void subtracao(boolean subtracao_bol) {
        result = num1 - num2;
        System.out.println("O resultado da subtração entre " + num1 + " + " + num2 + " é igual a: " + result);
    }

    void multiplicacao(boolean multiplicacao_bol) {
        result = num1 * num2;
        System.out.println("O resultado da multiplicação entre " + num1 + " + " + num2 + " é igual a: " + result);
    }

    void divisao(boolean divisao_bol) {
        result = num1 / num2;
        System.out.println("O resultado da divisão entre " + num1 + " + " + num2 + " é igual a: " + result);
    }

}
