package TesteJava;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args){
        float n1, n2, n3, n4, media;

        Scanner notafinal = new Scanner(System.in);


            System.out.println("Informe a primeira nota: ");
            n1 = notafinal.nextFloat();

            System.out.println("Informe a segunda nota: ");
            n2 = notafinal.nextFloat();

            System.out.println("Informe a terceira nota: ");
            n3 = notafinal.nextFloat();

            System.out.println("Informe a última nota: ");
            n4 = notafinal.nextFloat();

            media = (n1 + n2 + n3 + n4) / 4;

            System.out.println("Média final: " + media);

            if (media >= 6.0) {
                System.out.println("Você passou");
            } else if (media >= 5.0 || media < 6.0) {
                System.out.println("Você está de recuperação");
            } else {
                System.out.println("Você está reprovado");
            }

    }
}
