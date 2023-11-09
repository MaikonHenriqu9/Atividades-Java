package TesteJava;

import java.util.Scanner;

public class OperacoesAritmetcas {
    public static void main(String[] args){
        int valor1, valor2, soma, subtracao, divisao, multiplicacao;

        Scanner operacao = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        valor1 = operacao.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = operacao.nextInt();

        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        multiplicacao = valor1 * valor2;
        divisao = valor1 / valor2;

        System.out.println("Resultado da Soma: "+ soma);
        System.out.println("Resultado da Subtração: "+ subtracao);
        System.out.println("Resultado da Divisão: "+ divisao);
        System.out.println("Resultado da Multiplicação: "+ multiplicacao);
    }
}
