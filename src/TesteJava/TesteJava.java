package TesteJava;
import java.util.Scanner;

public class TesteJava {
    public static void main(String[] args){

        int n1, n2, soma;
        Scanner valor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        n1 = valor.nextInt();

        System.out.println("Informe o segundo valor: ");
        n2 = valor.nextInt();

        soma = n1 + n2;

        System.out.println("Resultado: "+ soma);

        System.out.println("A soma entre os numeros é " + soma);
    }
}
