package com.company;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double real, dolar, cotacao;

        System.out.println("Digite uma quantidade em dolar: " );
        dolar = sc.nextDouble();

        System.out.println("Digite a cotação do dolar: " );
        cotacao = sc.nextDouble();

        real = dolar * cotacao;

        System.out.printf("Você possui em reais: " + real);
    }
}
