package TesteJava;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        float peso, altura, imc;
        String imcFormatado;

        Scanner imc_pessoa = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        peso = imc_pessoa.nextFloat();

        System.out.print("Informe a sua altura: ");
        altura = imc_pessoa.nextFloat();

        imc = peso/ (altura * altura);
        imcFormatado = String.format("%.2f", imc); /* Formatação da variável para aceitar dois valores após a vírgula */

        System.out.println("Valor do seu IMC: "+ imcFormatado);

        if(imc >= 18.5 || imc <= 24.9){
            System.out.print("Seu IMC está NORMAL");
        } else if(imc >= 25 || imc <= 29.9){
            System.out.print("Seu IMC está com SOBREPESO");
        } else if(imc >= 30 || imc <= 34.9){
            System.out.print("Seu IMC está com OBESIDADE 1");
        } else if(imc >= 35 || imc <= 39.9){
            System.out.print("Seu IMC está com OBESIDADE 2");
        } else if(imc > 40){
            System.out.print("Seu IMC está com OBESIDADE 3");
        } else {
            System.out.print("Seu IMC está ABAIXO DO PESO IDEAL");
        }

    }
}
